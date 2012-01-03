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
package com.oracle.max.graal.hotspot.ri;

import com.oracle.max.cri.ri.*;
import com.oracle.max.graal.hotspot.*;
import com.oracle.max.graal.hotspot.Compiler;

/**
 * Implementation of RiMethod for unresolved HotSpot methods.
 */
public final class HotSpotMethodUnresolved extends HotSpotMethod {
    /**
     * 
     */
    private static final long serialVersionUID = 5610263481791970079L;
    private final RiSignature signature;
    protected RiType holder;

    public HotSpotMethodUnresolved(Compiler compiler, String name, String signature, RiType holder) {
        super(compiler);
        this.name = name;
        this.holder = holder;
        this.signature = new HotSpotSignature(compiler, signature);
    }

    @Override
    public RiSignature signature() {
        return signature;
    }

    @Override
    public RiType holder() {
        return holder;
    }

    @Override
    public String toString() {
        return "HotSpotMethod<" + holder.name() + ". " + name + ", unresolved>";
    }
}
