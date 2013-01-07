/*
 * Copyright (c) 2012, 2012, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.codegen.processor.operation;

import com.oracle.truffle.api.codegen.*;
import com.oracle.truffle.codegen.processor.template.*;

public class SpecializationData extends TemplateMethod {

    private final int order;
    private final boolean generic;
    private final boolean uninitialized;
    private final SpecializationThrowsData[] exceptions;
    private SpecializationGuardData[] guards;
    private ShortCircuitData[] shortCircuits;

    private OperationData operation;

    public SpecializationData(TemplateMethod template, int order, SpecializationThrowsData[] exceptions) {
        super(template.getSpecification(), template.getMethod(), template.getMarkerAnnotation(), template.getReturnType(), template.getParameters());
        this.order = order;
        this.generic = false;
        this.uninitialized = false;
        this.exceptions = exceptions;

        for (SpecializationThrowsData exception : exceptions) {
            exception.setSpecialization(this);
        }
    }

    public SpecializationData(TemplateMethod template, boolean generic, boolean uninitialized) {
        super(template.getSpecification(), template.getMethod(), template.getMarkerAnnotation(), template.getReturnType(), template.getParameters());
        this.order = Specialization.DEFAULT_ORDER;
        this.generic = generic;
        this.uninitialized = uninitialized;
        this.exceptions = new SpecializationThrowsData[0];
        this.guards = new SpecializationGuardData[0];
    }

    public void setOperation(OperationData operation) {
        this.operation = operation;
    }

    void setGuards(SpecializationGuardData[] guards) {
        this.guards = guards;
    }

    public OperationData getOperation() {
        return operation;
    }

    public int getOrder() {
        return order;
    }

    public boolean isGeneric() {
        return generic;
    }

    public boolean isUninitialized() {
        return uninitialized;
    }

    public SpecializationThrowsData[] getExceptions() {
        return exceptions;
    }

    public SpecializationGuardData[] getGuards() {
        return guards;
    }

    public void setShortCircuits(ShortCircuitData[] shortCircuits) {
        this.shortCircuits = shortCircuits;
    }

    public ShortCircuitData[] getShortCircuits() {
        return shortCircuits;
    }

    public SpecializationData findNextSpecialization() {
        SpecializationData[] allMethods = operation.getAllMethods();
        for (int i = 0; i < allMethods.length - 1; i++) {
            if (allMethods[i] == this) {
                return allMethods[i + 1];
            }
        }
        throw new IllegalArgumentException();
    }

    public boolean hasDynamicGuards() {
        for (SpecializationGuardData guard : getGuards()) {
            if (guard.isOnExecution()) {
                return true;
            }
        }
        return false;
    }

    public ActualParameter getPreviousParam(ActualParameter searchParam) {
        ActualParameter prev = null;
        for (ActualParameter param : getParameters()) {
            if (param == searchParam) {
                return prev;
            }
            prev = param;
        }
        return prev;
    }

}
