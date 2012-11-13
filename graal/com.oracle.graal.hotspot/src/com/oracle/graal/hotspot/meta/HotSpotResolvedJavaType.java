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
package com.oracle.graal.hotspot.meta;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

import com.oracle.graal.api.meta.*;
import com.oracle.graal.graph.*;
import com.oracle.graal.hotspot.*;

/**
 * Implementation of {@link JavaType} for resolved non-primitive HotSpot classes.
 */
public final class HotSpotResolvedJavaType extends HotSpotJavaType implements ResolvedJavaType {

    private static final long serialVersionUID = 3481514353553840471L;

    private Class javaMirror;
    private String simpleName;
    private int accessFlags;
    private boolean hasFinalizer;
    private boolean hasFinalizableSubclass;
    private int superCheckOffset;
    private boolean isArrayClass;
    private boolean isInstanceClass;
    private boolean isInterface;
    private int instanceSize;
    private HashMap<Long, ResolvedJavaField> fieldCache;
    private ResolvedJavaType superType;
    private ResolvedJavaType[] interfaces;
    private boolean superTypeSet;
    private ResolvedJavaField[] fields;
    private ConstantPool constantPool;
    private boolean isInitialized;
    private ResolvedJavaType arrayOfType;

    private HotSpotResolvedJavaType() {
        throw new GraalInternalError(HotSpotResolvedJavaType.class + " should only be created from C++ code");
    }

    @Override
    public int getModifiers() {
        return javaMirror.getModifiers();
    }

    @Override
    public ResolvedJavaType getArrayClass() {
        if (arrayOfType == null) {
           arrayOfType = (ResolvedJavaType) HotSpotGraalRuntime.getInstance().getCompilerToVM().getArrayOf(this);
        }
        return arrayOfType;
    }

    @Override
    public ResolvedJavaType getComponentType() {
        if (isArrayClass) {
            return (ResolvedJavaType) HotSpotGraalRuntime.getInstance().getCompilerToVM().getComponentType(this);
        }
        return null;
    }

    @Override
    public ResolvedJavaType findUniqueConcreteSubtype() {
        if (isArrayClass()) {
            return getComponentType().findUniqueConcreteSubtype() != null ? this : null;
        } else {
            ResolvedJavaType subtype = (ResolvedJavaType) HotSpotGraalRuntime.getInstance().getCompilerToVM().getUniqueConcreteSubtype(this);
            assert subtype == null || !subtype.isInterface();
            return subtype;
        }
    }

    @Override
    public ResolvedJavaType getSuperclass() {
        if (!superTypeSet) {
            Class<?> javaSuper = toJava().getSuperclass();
            if (javaSuper == null) {
                superType = null;
            } else {
                superType = HotSpotGraalRuntime.getInstance().getRuntime().lookupJavaType(javaSuper);
            }
            superTypeSet = true;
        }
        return superType;
    }

    @Override
    public ResolvedJavaType[] getInterfaces() {
        if (interfaces == null) {
            Class[] javaInterfaces = toJava().getInterfaces();
            ResolvedJavaType[] result = new ResolvedJavaType[javaInterfaces.length];
            for (int i = 0; i < javaInterfaces.length; i++) {
                result[i] = HotSpotGraalRuntime.getInstance().getRuntime().lookupJavaType(javaInterfaces[i]);
            }
            interfaces = result;
        }
        return interfaces;
    }

    @Override
    public ResolvedJavaType findLeastCommonAncestor(ResolvedJavaType otherType) {
        if (otherType instanceof HotSpotTypePrimitive) {
            return null;
        } else {
            return (ResolvedJavaType) HotSpotGraalRuntime.getInstance().getCompilerToVM().getLeastCommonAncestor(this, (HotSpotResolvedJavaType) otherType);
        }
    }

    @Override
    public ResolvedJavaType getExactType() {
        if (Modifier.isFinal(accessFlags)) {
            return this;
        }
        return null;
    }

    @Override
    public Constant getEncoding(Representation r) {
        switch (r) {
            case JavaClass:
                return Constant.forObject(javaMirror);
            case ObjectHub:
                return Constant.forObject(klassOop());
            case StaticPrimitiveFields:
            case StaticObjectFields:
                return Constant.forObject(javaMirror);
            default:
                assert false : "Should not reach here.";
                return null;
        }
    }

    @Override
    public boolean hasFinalizableSubclass() {
        return hasFinalizableSubclass;
    }

    @Override
    public boolean hasFinalizer() {
        return hasFinalizer;
    }

    @Override
    public boolean isArrayClass() {
        assert isArrayClass ^ (isInterface || isInstanceClass);
        return isArrayClass;
    }

    @Override
    public boolean isInitialized() {
        if (!isInitialized) {
            isInitialized = HotSpotGraalRuntime.getInstance().getCompilerToVM().isTypeInitialized(this);
        }
        return isInitialized;
    }

    @Override
    public void initialize() {
        if (!isInitialized) {
            HotSpotGraalRuntime.getInstance().getCompilerToVM().initializeType(this);
        }
        isInitialized = true;
    }

    @Override
    public boolean isInstance(Constant obj) {
        return javaMirror.isInstance(obj);
    }

    @Override
    public boolean isInstanceClass() {
        assert isInstanceClass ^ (isInterface || isArrayClass);
        return isInstanceClass;
    }

    @Override
    public boolean isInterface() {
        assert isInterface ^ (isInstanceClass || isArrayClass);
        return isInterface;
    }

    @Override
    public boolean isSubtypeOf(ResolvedJavaType other) {
        if (other instanceof HotSpotResolvedJavaType) {
            return HotSpotGraalRuntime.getInstance().getCompilerToVM().isSubtypeOf(this, other);
        }
        // No resolved type is a subtype of an unresolved type.
        return false;
    }

    @Override
    public Kind getKind() {
        return Kind.Object;
    }

    @Override
    public ResolvedJavaMethod resolveMethod(ResolvedJavaMethod method) {
        assert method instanceof HotSpotMethod;
        return (ResolvedJavaMethod) HotSpotGraalRuntime.getInstance().getCompilerToVM().resolveMethod(this, method.getName(), ((HotSpotSignature) method.getSignature()).asString());
    }

    @Override
    public String toString() {
        return "HotSpotType<" + simpleName + ", resolved>";
    }

    public ConstantPool constantPool() {
        if (constantPool == null) {
            constantPool = new HotSpotConstantPool(this);
        }
        return constantPool;
    }

    /**
     * Gets the instance size of this type. If an instance of this type cannot
     * be fast path allocated, then the returned value is negative (its absolute
     * value gives the size).
     */
    public int instanceSize() {
        return instanceSize;
    }

    public synchronized ResolvedJavaField createField(String fieldName, JavaType type, int offset, int flags) {
        ResolvedJavaField result = null;

        long id = offset + ((long) flags << 32);

        // (thomaswue) Must cache the fields, because the local load elimination only works if the objects from two field lookups are identical.
        if (fieldCache == null) {
            fieldCache = new HashMap<>(8);
        } else {
            result = fieldCache.get(id);
        }

        if (result == null) {
            result = new HotSpotResolvedJavaField(this, fieldName, type, offset, flags);
            fieldCache.put(id, result);
        } else {
            assert result.getName().equals(fieldName);
            assert result.getModifiers() == flags;
        }

        return result;
    }

    @Override
    public ResolvedJavaMethod findUniqueConcreteMethod(ResolvedJavaMethod method) {
        return ((HotSpotResolvedJavaMethod) method).uniqueConcreteMethod();
    }

    @Override
    public ResolvedJavaField[] getDeclaredFields() {
        if (fields == null) {
            if (isArrayClass) {
                fields = new ResolvedJavaField[0];
            } else {
                fields = HotSpotGraalRuntime.getInstance().getCompilerToVM().getFields(this);
            }
        }
        return fields;
    }

    @Override
    public Class< ? > toJava() {
        return javaMirror;
    }

    @Override
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
        return toJava().getAnnotation(annotationClass);
    }

    @Override
    public ResolvedJavaType resolve(ResolvedJavaType accessingClass) {
        return this;
    }

    // this value may require identity semantics so cache it
    private HotSpotKlassOop klassOopCache;

    @Override
    public synchronized HotSpotKlassOop klassOop() {
        if (klassOopCache == null) {
            klassOopCache = new HotSpotKlassOop(this);
        }
        return klassOopCache;
    }

    public boolean isPrimaryType() {
        return HotSpotGraalRuntime.getInstance().getConfig().secondarySuperCacheOffset != superCheckOffset;
    }

    public int superCheckOffset() {
        return superCheckOffset;
    }

    public long prototypeMarkWord() {
        return HotSpotGraalRuntime.getInstance().getCompilerToVM().getPrototypeMarkWord(this);
    }
}
