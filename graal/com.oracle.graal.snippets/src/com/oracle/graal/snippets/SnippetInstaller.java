/*
 * Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.graal.snippets;

import static com.oracle.graal.api.meta.MetaUtil.*;

import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.*;

import sun.misc.*;

import com.oracle.graal.api.code.*;
import com.oracle.graal.api.meta.*;
import com.oracle.graal.debug.*;
import com.oracle.graal.graph.*;
import com.oracle.graal.java.*;
import com.oracle.graal.nodes.*;
import com.oracle.graal.nodes.extended.*;
import com.oracle.graal.nodes.java.*;
import com.oracle.graal.nodes.java.MethodCallTargetNode.InvokeKind;
import com.oracle.graal.phases.*;
import com.oracle.graal.phases.common.*;
import com.oracle.graal.snippets.ClassSubstitution.MethodSubstitution;
import com.oracle.graal.snippets.Snippet.DefaultSnippetInliningPolicy;
import com.oracle.graal.snippets.Snippet.SnippetInliningPolicy;
import com.oracle.graal.word.phases.*;

/**
 * Utility for {@linkplain #installSnippets(Class) snippet} and
 * {@linkplain #installSubstitutions(Class) substitution} installation.
 */
public class SnippetInstaller {

    private final MetaAccessProvider runtime;
    private final TargetDescription target;
    private final Assumptions assumptions;
    private final BoxingMethodPool pool;

    /**
     * A graph cache used by this installer to avoid using the compiler
     * storage for each method processed during snippet installation.
     * Without this, all processed methods are to be determined as
     * {@linkplain InliningUtil#canIntrinsify intrinsifiable}.
     */
    private final Map<ResolvedJavaMethod, StructuredGraph> graphCache;

    public SnippetInstaller(MetaAccessProvider runtime, Assumptions assumptions, TargetDescription target) {
        this.runtime = runtime;
        this.target = target;
        this.assumptions = assumptions;
        this.pool = new BoxingMethodPool(runtime);
        this.graphCache = new HashMap<>();
    }

    /**
     * Finds all the snippet methods in a given class, builds a graph for them and
     * installs the graph with the key value of {@code Graph.class} in the
     * {@linkplain ResolvedJavaMethod#getCompilerStorage() compiler storage} of each method.
     */
    public void installSnippets(Class< ? extends SnippetsInterface> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getAnnotation(Snippet.class) != null) {
                int modifiers = method.getModifiers();
                if (Modifier.isAbstract(modifiers) || Modifier.isNative(modifiers)) {
                    throw new RuntimeException("Snippet must not be abstract or native");
                }
                ResolvedJavaMethod snippet = runtime.lookupJavaMethod(method);
                assert snippet.getCompilerStorage().get(Graph.class) == null : method;
                StructuredGraph graph = makeGraph(snippet, inliningPolicy(snippet), false);
                //System.out.println("snippet: " + graph);
                snippet.getCompilerStorage().put(Graph.class, graph);
            }
        }
    }

    /**
     * Finds all the {@linkplain MethodSubstitution substitution} methods in a given class,
     * builds a graph for them. If the original class is resolvable, then the
     * graph is installed with the key value of {@code Graph.class} in the
     * {@linkplain ResolvedJavaMethod#getCompilerStorage() compiler storage} of each original method.
     */
    public void installSubstitutions(Class<?> substitutions) {
        ClassSubstitution classSubstitution = substitutions.getAnnotation(ClassSubstitution.class);
        for (Method substituteMethod : substitutions.getDeclaredMethods()) {
            MethodSubstitution methodSubstitution = substituteMethod.getAnnotation(MethodSubstitution.class);
            if (methodSubstitution == null) {
                continue;
            }

            int modifiers = substituteMethod.getModifiers();
            if (!Modifier.isStatic(modifiers)) {
                throw new RuntimeException("Substitution methods must be static: " + substituteMethod);
            } else if (Modifier.isAbstract(modifiers) || Modifier.isNative(modifiers)) {
                throw new RuntimeException("Substitution method must not be abstract or native: " + substituteMethod);
            }

            String originalName = originalName(substituteMethod, methodSubstitution);
            Class[] originalParameters = originalParameters(substituteMethod, methodSubstitution);
            ResolvedJavaMethod substitute = runtime.lookupJavaMethod(substituteMethod);
            Method originalMethod = originalMethod(classSubstitution, originalName, originalParameters);
            ResolvedJavaMethod substituted = runtime.lookupJavaMethod(originalMethod);
            //System.out.println("substitution: " + MetaUtil.format("%H.%n(%p)", substituted) + " --> " + MetaUtil.format("%H.%n(%p)", substitute));
            StructuredGraph graph = makeGraph(substitute, inliningPolicy(substitute), true);
            Object oldValue = substituted.getCompilerStorage().put(Graph.class, graph);
            assert oldValue == null;
        }
    }

    private SnippetInliningPolicy inliningPolicy(ResolvedJavaMethod method) {
        Class<? extends SnippetInliningPolicy> policyClass = SnippetInliningPolicy.class;
        Snippet snippet = method.getAnnotation(Snippet.class);
        if (snippet != null) {
            policyClass = snippet.inlining();
        }
        if (policyClass == SnippetInliningPolicy.class) {
            return new DefaultSnippetInliningPolicy(runtime, pool);
        }
        try {
            return policyClass.getConstructor().newInstance();
        } catch (Exception e) {
            throw new GraalInternalError(e);
        }
    }

    public StructuredGraph makeGraph(final ResolvedJavaMethod method, final SnippetInliningPolicy policy, final boolean isSubstitution) {
        return Debug.scope("BuildSnippetGraph", new Object[] {method}, new Callable<StructuredGraph>() {
            @Override
            public StructuredGraph call() throws Exception {
                StructuredGraph graph = parseGraph(method, policy);

                new SnippetIntrinsificationPhase(runtime, pool, SnippetTemplate.hasConstantParameter(method)).apply(graph);

                if (isSubstitution) {
                    // TODO (ds) remove the constraint of only processing substitutions
                    // once issues with the arraycopy snippets have been resolved
                    new SnippetFrameStateCleanupPhase().apply(graph);
                    new DeadCodeEliminationPhase().apply(graph);
                }

                new InsertStateAfterPlaceholderPhase().apply(graph);

                Debug.dump(graph, "%s: Final", method.getName());

                return graph;
            }
        });
    }

    private StructuredGraph parseGraph(final ResolvedJavaMethod method, final SnippetInliningPolicy policy) {
        StructuredGraph graph = graphCache.get(method);
        if (graph == null) {
            graph = buildGraph(method, policy == null ? inliningPolicy(method) : policy);
            //System.out.println("built " + graph);
            graphCache.put(method, graph);
        }
        return graph;
    }

    private StructuredGraph buildGraph(final ResolvedJavaMethod method, final SnippetInliningPolicy policy) {
        assert !Modifier.isAbstract(method.getModifiers()) && !Modifier.isNative(method.getModifiers()) : method;
        final StructuredGraph graph = new StructuredGraph(method);
        GraphBuilderConfiguration config = GraphBuilderConfiguration.getSnippetDefault();
        GraphBuilderPhase graphBuilder = new GraphBuilderPhase(runtime, config, OptimisticOptimizations.NONE);
        graphBuilder.apply(graph);

        Debug.dump(graph, "%s: %s", method.getName(), GraphBuilderPhase.class.getSimpleName());

        new WordTypeVerificationPhase(runtime, target.wordKind).apply(graph);

        new SnippetIntrinsificationPhase(runtime, pool, true).apply(graph);

        for (Invoke invoke : graph.getInvokes()) {
            MethodCallTargetNode callTarget = invoke.methodCallTarget();
            ResolvedJavaMethod callee = callTarget.targetMethod();
            if ((callTarget.invokeKind() == InvokeKind.Static || callTarget.invokeKind() == InvokeKind.Special) && policy.shouldInline(callee, method)) {
                StructuredGraph targetGraph = parseGraph(callee, policy);
                InliningUtil.inline(invoke, targetGraph, true);
                Debug.dump(graph, "after inlining %s", callee);
                if (GraalOptions.OptCanonicalizer) {
                    new WordTypeRewriterPhase(runtime, target.wordKind).apply(graph);
                    new CanonicalizerPhase(target, runtime, assumptions).apply(graph);
                }
            }
        }

        new SnippetIntrinsificationPhase(runtime, pool, true).apply(graph);

        new WordTypeRewriterPhase(runtime, target.wordKind).apply(graph);

        new DeadCodeEliminationPhase().apply(graph);
        if (GraalOptions.OptCanonicalizer) {
            new CanonicalizerPhase(target, runtime, assumptions).apply(graph);
        }

        for (LoopEndNode end : graph.getNodes(LoopEndNode.class)) {
            end.disableSafepoint();
        }

        if (GraalOptions.ProbabilityAnalysis) {
            new DeadCodeEliminationPhase().apply(graph);
            new ComputeProbabilityPhase().apply(graph);
        }
        return graph;
    }

    private static String originalName(Method substituteMethod, MethodSubstitution methodSubstitution) {
        String name = substituteMethod.getName();
        if (!methodSubstitution.value().isEmpty()) {
            name = methodSubstitution.value();
        }
        return name;
    }

    private static Class resolveType(String className) {
        try {
            // Need to use launcher class path to handle classes
            // that are not on the boot class path
            ClassLoader cl = Launcher.getLauncher().getClassLoader();
            return Class.forName(className, false, cl);
        } catch (ClassNotFoundException e) {
            throw new GraalInternalError("Could not resolve type " + className);
        }
    }

    private static Class resolveType(JavaType type) {
        JavaType base = type;
        int dimensions = 0;
        while (base.getComponentType() != null) {
            base = base.getComponentType();
            dimensions++;
        }

        Class baseClass = base.getKind() != Kind.Object ? base.getKind().toJavaClass() : resolveType(toJavaName(base));
        return dimensions == 0 ? baseClass : Array.newInstance(baseClass, new int[dimensions]).getClass();
    }

    private Class[] originalParameters(Method substituteMethod, MethodSubstitution methodSubstitution) {
        Class[] parameters;
        if (methodSubstitution.signature().isEmpty()) {
            parameters = substituteMethod.getParameterTypes();
            if (!methodSubstitution.isStatic()) {
                assert parameters.length > 0 : "must be a static method with the 'this' object as its first parameter";
                parameters = Arrays.copyOfRange(parameters, 1, parameters.length);
            }
        } else {
            Signature signature = runtime.parseMethodDescriptor(methodSubstitution.signature());
            parameters = new Class[signature.getParameterCount(false)];
            for (int i = 0; i < parameters.length; i++) {
                parameters[i] = resolveType(signature.getParameterType(i, null));
            }
        }
        return parameters;
    }

    private static Method originalMethod(ClassSubstitution classSubstitution, String name, Class[] parameters) {
        Class<?> originalClass = classSubstitution.value();
        if (originalClass == ClassSubstitution.class) {
            originalClass = resolveType(classSubstitution.className());
        }
        try {
            return originalClass.getDeclaredMethod(name, parameters);
        } catch (NoSuchMethodException | SecurityException e) {
            throw new GraalInternalError(e);
        }
    }
}
