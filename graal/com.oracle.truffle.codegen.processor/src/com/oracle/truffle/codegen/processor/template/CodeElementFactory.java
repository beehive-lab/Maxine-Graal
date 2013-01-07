/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.codegen.processor.template;

import javax.lang.model.element.*;

import com.oracle.truffle.codegen.processor.*;
import com.oracle.truffle.codegen.processor.ast.*;

public abstract class CodeElementFactory<M> {

    protected final ProcessorContext context;
    private M model;

    private CodeElement<? super Element> element;

    public CodeElementFactory(ProcessorContext context) {
        this.context = context;
    }

    protected abstract CodeElement<?> create(M m);

    @SuppressWarnings("unused")
    protected void createChildren(M m) { }

    @SuppressWarnings("unchecked")
    public final CodeElement<?> process(M m) {
        model = m;
        element = (CodeElement<? super Element>) create(model);
        if (element != null) {
            createChildren(model);
        }
        return element;
    }

    public CodeElement getElement() {
        return element;
    }

    protected <MO, K extends Element> void add(CodeElementFactory<MO> factory, MO m) {
        this.element.add(factory.process(m));
    }

    public ProcessorContext getContext() {
        return context;
    }

    public M getModel() {
        return model;
    }

}
