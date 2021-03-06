/*
 * Copyright (c) 2011, 2012, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.graal.lir;

import static com.oracle.graal.lir.LIRInstruction.OperandFlag.*;

import com.oracle.graal.api.meta.*;
import com.oracle.graal.asm.*;
import com.oracle.graal.graph.*;
import com.oracle.graal.lir.asm.*;
import com.oracle.graal.nodes.cfg.*;

/**
 * A collection of machine-independent LIR operations, as well as interfaces to be implemented for
 * specific kinds or LIR operations.
 */
public class StandardOp {

    /**
     * Marker interface for LIR ops that can fall through to the next operation, like a switch
     * statement. setFallThroughTarget(null) can be used to make the operation fall through to the
     * next one.
     */
    public interface FallThroughOp {

        LabelRef fallThroughTarget();

        void setFallThroughTarget(LabelRef target);
    }

    /**
     * LIR operation that defines the position of a label. The first operation of every block must
     * implement this interface.
     */
    public static class LabelOp extends LIRInstruction {

        private final Label label;
        private final boolean align;

        public LabelOp(Label label, boolean align) {
            this.label = label;
            this.align = align;
        }

        @Override
        public void emitCode(TargetMethodAssembler tasm) {
            if (align) {
                tasm.asm.align(tasm.target.wordSize * 2);
            }
            tasm.asm.bind(label);
        }

        public Label getLabel() {
            return label;
        }
    }

    /**
     * LIR operation that is an unconditional jump to {@link #destination()}. When the LIR is
     * constructed, the last operation of every block must implement this interface. After register
     * allocation, unnecessary jumps can be deleted.
     */
    public static class JumpOp extends LIRInstruction {

        private final LabelRef destination;

        public JumpOp(LabelRef destination) {
            this.destination = destination;
        }

        @Override
        public void emitCode(TargetMethodAssembler tasm) {
            tasm.asm.jmp(destination.label());
        }

        public LabelRef destination() {
            return destination;
        }
    }

    /**
     * Marker interface for a LIR operation that is a conditional jump to {@link #destination()}.
     * Conditional jumps may be negated or optimized away after register allocation.
     */
    public interface BranchOp {

        LabelRef destination();

        void negate(LabelRef newDestination);
    }

    /**
     * Marker interface for a LIR operation that moves a value from {@link #getInput()} to
     * {@link #getResult()}.
     */
    public interface MoveOp {

        Value getInput();

        AllocatableValue getResult();
    }

    /**
     * Meta-operation that defines the incoming method parameters. In the LIR, every register and
     * variable must be defined before it is used. This operation is the definition point of method
     * parameters, but is otherwise a no-op. In particular, it is not the actual method prologue.
     */
    public static final class ParametersOp extends LIRInstruction {

        @Def({REG, STACK}) protected Value[] params;

        public ParametersOp(Value[] params) {
            this.params = params;
        }

        @Override
        public void emitCode(TargetMethodAssembler tasm) {
            // No code to emit.
        }
    }

    /**
     * Placeholder for a LIR instruction that will be subsequently replaced.
     */
    public static class PlaceholderOp extends LIRInstruction {

        /**
         * The block in which this instruction is located.
         */
        final Block block;

        /**
         * The block index of this instruction.
         */
        final int index;

        public PlaceholderOp(Block block, int index) {
            this.block = block;
            this.index = index;
        }

        public void replace(LIR lir, LIRInstruction replacement) {
            lir.lir(block).set(index, replacement);
        }

        @Override
        public void emitCode(TargetMethodAssembler tasm) {
            throw new GraalInternalError(this + " should have been replaced");
        }
    }
}
