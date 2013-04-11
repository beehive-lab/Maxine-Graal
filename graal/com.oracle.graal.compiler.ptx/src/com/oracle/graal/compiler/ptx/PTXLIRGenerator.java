/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
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

package com.oracle.graal.compiler.ptx;

import static com.oracle.graal.api.code.ValueUtil.*;
import static com.oracle.graal.lir.ptx.PTXArithmetic.*;
import static com.oracle.graal.lir.ptx.PTXBitManipulationOp.IntrinsicOpcode.*;
import static com.oracle.graal.lir.ptx.PTXCompare.*;

import com.oracle.graal.api.code.AllocatableValue;
import com.oracle.graal.api.code.CodeCacheProvider;
import com.oracle.graal.api.code.DeoptimizationAction;
import com.oracle.graal.api.code.RuntimeCallTarget;
import com.oracle.graal.api.code.StackSlot;
import com.oracle.graal.api.code.TargetDescription;
import com.oracle.graal.api.code.RuntimeCallTarget.Descriptor;
import com.oracle.graal.api.meta.Constant;
import com.oracle.graal.api.meta.Kind;
import com.oracle.graal.api.meta.ResolvedJavaMethod;
import com.oracle.graal.api.meta.Value;
import com.oracle.graal.asm.NumUtil;
import com.oracle.graal.compiler.gen.LIRGenerator;
import com.oracle.graal.compiler.target.LIRGenLowerable;
import com.oracle.graal.graph.GraalInternalError;
import com.oracle.graal.lir.FrameMap;
import com.oracle.graal.lir.LIR;
import com.oracle.graal.lir.LIRFrameState;
import com.oracle.graal.lir.LIRInstruction;
import com.oracle.graal.lir.LIRValueUtil;
import com.oracle.graal.lir.LabelRef;
import com.oracle.graal.lir.StandardOp.JumpOp;
import com.oracle.graal.lir.Variable;
import com.oracle.graal.lir.ptx.PTXAddressValue;
import com.oracle.graal.lir.ptx.PTXArithmetic.Op1Stack;
import com.oracle.graal.lir.ptx.PTXArithmetic.Op2Reg;
import com.oracle.graal.lir.ptx.PTXArithmetic.Op2Stack;
import com.oracle.graal.lir.ptx.PTXArithmetic.ShiftOp;
import com.oracle.graal.lir.ptx.PTXBitManipulationOp;
import com.oracle.graal.lir.ptx.PTXCompare.CompareOp;
import com.oracle.graal.lir.ptx.PTXControlFlow.BranchOp;
import com.oracle.graal.lir.ptx.PTXControlFlow.CondMoveOp;
import com.oracle.graal.lir.ptx.PTXControlFlow.FloatCondMoveOp;
import com.oracle.graal.lir.ptx.PTXControlFlow.ReturnOp;
import com.oracle.graal.lir.ptx.PTXControlFlow.SequentialSwitchOp;
import com.oracle.graal.lir.ptx.PTXControlFlow.TableSwitchOp;
import com.oracle.graal.lir.ptx.PTXMove.LoadOp;
import com.oracle.graal.lir.ptx.PTXMove.MoveFromRegOp;
import com.oracle.graal.lir.ptx.PTXMove.MoveToRegOp;
import com.oracle.graal.lir.ptx.PTXMove.StoreOp;
import com.oracle.graal.nodes.*;
import com.oracle.graal.nodes.calc.Condition;
import com.oracle.graal.nodes.calc.ConvertNode;
import com.oracle.graal.nodes.java.CompareAndSwapNode;

/**
 * This class implements the PTX specific portion of the LIR generator.
 */
public class PTXLIRGenerator extends LIRGenerator {

    public static final Descriptor ARITHMETIC_FREM = new Descriptor("arithmeticFrem", false, float.class, float.class, float.class);
    public static final Descriptor ARITHMETIC_DREM = new Descriptor("arithmeticDrem", false, double.class, double.class, double.class);

    public static class PTXSpillMoveFactory implements LIR.SpillMoveFactory {

        @Override
        public LIRInstruction createMove(Value result, Value input) {
            throw new InternalError("NYI");
        }
    }

    public PTXLIRGenerator(StructuredGraph graph, CodeCacheProvider runtime, TargetDescription target, FrameMap frameMap, ResolvedJavaMethod method, LIR lir) {
        super(graph, runtime, target, frameMap, method, lir);
        lir.spillMoveFactory = new PTXSpillMoveFactory();
    }

    @Override
    protected void emitNode(ValueNode node) {
        if (node instanceof LIRGenLowerable) {
            ((LIRGenLowerable) node).generate(this);
        } else {
            super.emitNode(node);
        }
    }

    @Override
    public boolean canStoreConstant(Constant c) {
        // Operand b must be in the .reg state space.
        return false;
    }

    @Override
    public boolean canInlineConstant(Constant c) {
        switch (c.getKind()) {
            case Long:
                return NumUtil.isInt(c.asLong()) && !runtime.needsDataPatch(c);
            case Object:
                return c.isNull();
            default:
                return true;
        }
    }

    @Override
    public Variable emitMove(Value input) {
        Variable result = newVariable(input.getKind());
        emitMove(result, input);
        return result;
    }

    @Override
    public void emitMove(Value dst, Value src) {
        if (isRegister(src) || isStackSlot(dst)) {
            append(new MoveFromRegOp(dst, src));
        } else {
            append(new MoveToRegOp(dst, src));
        }
    }

    private PTXAddressValue prepareAddress(Kind kind, Value base, int displacement, Value index, int scale) {
        AllocatableValue baseRegister;
        long finalDisp = displacement;
        if (isConstant(base)) {
            if (asConstant(base).isNull()) {
                baseRegister = AllocatableValue.UNUSED;
            } else if (asConstant(base).getKind() != Kind.Object) {
                finalDisp += asConstant(base).asLong();
                baseRegister = AllocatableValue.UNUSED;
            } else {
                baseRegister = load(base);
            }
        } else if (base == Value.ILLEGAL) {
            baseRegister = AllocatableValue.UNUSED;
        } else {
            baseRegister = asAllocatable(base);
        }

        if (index != Value.ILLEGAL) {
            if (isConstant(index)) {
                finalDisp += asConstant(index).asLong() * scale;
            } else {
                Value indexRegister;
                if (scale != 1) {
                    indexRegister = emitMul(index, Constant.forInt(scale));
                } else {
                    indexRegister = index;
                }

                if (baseRegister == AllocatableValue.UNUSED) {
                    baseRegister = asAllocatable(indexRegister);
                } else {
                    baseRegister = emitAdd(baseRegister, indexRegister);
                }
            }
        }

        return new PTXAddressValue(kind, baseRegister, finalDisp);
    }

    @Override
    public Variable emitLoad(Kind kind, Value base, int displacement, Value index, int scale, DeoptimizingNode deopting) {
        PTXAddressValue loadAddress = prepareAddress(kind, base, displacement, index, scale);
        Variable result = newVariable(loadAddress.getKind());
        append(new LoadOp(result, loadAddress, deopting != null ? state(deopting) : null));
        return result;
    }

    @Override
    public void emitStore(Kind kind, Value base, int displacement, Value index, int scale, Value inputVal, DeoptimizingNode deopting) {
        PTXAddressValue storeAddress = prepareAddress(kind, base, displacement, index, scale);
        Variable input = load(inputVal);
        append(new StoreOp(storeAddress, input, deopting != null ? state(deopting) : null));
    }

    @Override
    public Variable emitLea(Value base, int displacement, Value index, int scale) {
        throw new InternalError("NYI");
    }

    @Override
    public Variable emitLea(StackSlot address) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitJump(LabelRef label) {
        append(new JumpOp(label));
    }

    @Override
    public void emitCompareBranch(Value left, Value right, Condition cond, boolean unorderedIsTrue, LabelRef label) {
        switch (left.getKind().getStackKind()) {
            case Int:
                append(new CompareOp(ICMP, cond, left, right));
                append(new BranchOp(cond, label));
                break;
            case Long:
                append(new CompareOp(LCMP, cond, left, right));
                append(new BranchOp(cond, label));
                break;
            case Float:
                append(new CompareOp(FCMP, cond, left, right));
                append(new BranchOp(cond, label));
                break;
            case Double:
                append(new CompareOp(DCMP, cond, left, right));
                append(new BranchOp(cond, label));
                break;
            case Object:
                append(new CompareOp(ACMP, cond, left, right));
                append(new BranchOp(cond, label));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere("" + left.getKind());
        }
    }

    @Override
    public void emitOverflowCheckBranch(LabelRef label, boolean negated) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitIntegerTestBranch(Value left, Value right, boolean negated, LabelRef label) {
        throw new InternalError("NYI");
    }

    @Override
    public Variable emitConditionalMove(Value left, Value right, Condition cond, boolean unorderedIsTrue, Value trueValue, Value falseValue) {
        boolean mirrored = emitCompare(cond, left, right);
        Condition finalCondition = mirrored ? cond.mirror() : cond;

        Variable result = newVariable(trueValue.getKind());
        switch (left.getKind().getStackKind()) {
            case Int:
            case Long:
            case Object:
                append(new CondMoveOp(result, finalCondition, load(trueValue), loadNonConst(falseValue)));
                break;
            case Float:
            case Double:
                append(new FloatCondMoveOp(result, finalCondition, unorderedIsTrue, load(trueValue), load(falseValue)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere("missing: " + left.getKind());
        }
        return result;
    }

    /**
     * This method emits the compare instruction, and may reorder the operands. It returns true if
     * it did so.
     * 
     * @param a the left operand of the comparison
     * @param b the right operand of the comparison
     * @return true if the left and right operands were switched, false otherwise
     */
    private boolean emitCompare(Condition cond, Value a, Value b) {
        Variable left;
        Value right;
        boolean mirrored;
        if (LIRValueUtil.isVariable(b)) {
            left = load(b);
            right = loadNonConst(a);
            mirrored = true;
        } else {
            left = load(a);
            right = loadNonConst(b);
            mirrored = false;
        }
        switch (left.getKind().getStackKind()) {
            case Int:
                append(new CompareOp(ICMP, cond, left, right));
                break;
            case Long:
                append(new CompareOp(LCMP, cond, left, right));
                break;
            case Object:
                append(new CompareOp(ACMP, cond, left, right));
                break;
            case Float:
                append(new CompareOp(FCMP, cond, left, right));
                break;
            case Double:
                append(new CompareOp(DCMP, cond, left, right));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere();
        }
        return mirrored;
    }

    @Override
    public Variable emitIntegerTestMove(Value left, Value right, Value trueValue, Value falseValue) {
        throw new InternalError("NYI");
    }

    @Override
    public Variable emitNegate(Value input) {
        Variable result = newVariable(input.getKind());
        switch (input.getKind()) {
            case Int:
                append(new Op1Stack(INEG, result, input));
                break;
            case Float:
                append(new Op1Stack(FNEG, result, input));
                break;
            case Double:
                append(new Op1Stack(DNEG, result, input));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere();
        }
        return result;
    }

    @Override
    public Variable emitAdd(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Stack(IADD, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op2Stack(LADD, result, a, loadNonConst(b)));
                break;
            case Float:
                append(new Op2Stack(FADD, result, a, loadNonConst(b)));
                break;
            case Double:
                append(new Op2Stack(DADD, result, a, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere("missing: " + a.getKind() + " prim: " + a.getKind().isPrimitive());
        }
        return result;
    }

    @Override
    public Variable emitSub(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Stack(ISUB, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op2Stack(LSUB, result, a, loadNonConst(b)));
                break;
            case Float:
                append(new Op2Stack(FSUB, result, a, loadNonConst(b)));
                break;
            case Double:
                append(new Op2Stack(DSUB, result, a, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere("missing: " + a.getKind());
        }
        return result;
    }

    @Override
    public Variable emitMul(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Reg(IMUL, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op2Reg(LMUL, result, a, loadNonConst(b)));
                break;
            case Float:
                append(new Op2Stack(FMUL, result, a, loadNonConst(b)));
                break;
            case Double:
                append(new Op2Stack(DMUL, result, a, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere("missing: " + a.getKind());
        }
        return result;
    }

    @Override
    protected boolean peephole(ValueNode valueNode) {
        // No peephole optimizations for now
        return false;
    }

    @Override
    public Value emitDiv(Value a, Value b, DeoptimizingNode deopting) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Reg(IDIV, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op2Reg(LDIV, result, a, loadNonConst(b)));
                break;
            case Float:
                append(new Op2Stack(FDIV, result, a, loadNonConst(b)));
                break;
            case Double:
                append(new Op2Stack(DDIV, result, a, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere("missing: " + a.getKind());
        }
        return result;
    }

    @Override
    public Value emitRem(Value a, Value b, DeoptimizingNode deopting) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Reg(IREM, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op2Reg(LREM, result, a, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere("missing: " + a.getKind());
        }
        return result;
    }

    @Override
    public Variable emitUDiv(Value a, Value b, DeoptimizingNode deopting) {
        throw new InternalError("NYI");
    }

    @Override
    public Variable emitURem(Value a, Value b, DeoptimizingNode deopting) {
        throw new InternalError("NYI");
    }

    @Override
    public Variable emitAnd(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Stack(IAND, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op2Stack(LAND, result, a, loadNonConst(b)));
                break;

            default:
                throw GraalInternalError.shouldNotReachHere("missing: " + a.getKind());
        }
        return result;
    }

    @Override
    public Variable emitOr(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Stack(IOR, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op2Stack(LOR, result, a, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere("missing: " + a.getKind());
        }
        return result;
    }

    @Override
    public Variable emitXor(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Stack(IXOR, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op2Stack(LXOR, result, a, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere();
        }
        return result;
    }

    @Override
    public Variable emitShl(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Stack(ISHL, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op1Stack(LSHL, result, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere();
        }
        return result;
    }

    @Override
    public Variable emitShr(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new Op2Stack(ISHR, result, a, loadNonConst(b)));
                break;
            case Long:
                append(new Op1Stack(LSHR, result, loadNonConst(b)));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere();
        }
        return result;
    }

    @Override
    public Variable emitUShr(Value a, Value b) {
        Variable result = newVariable(a.getKind());
        switch (a.getKind()) {
            case Int:
                append(new ShiftOp(IUSHR, result, a, b));
                break;
            case Long:
                append(new ShiftOp(LUSHR, result, a, b));
                break;
            default:
                throw GraalInternalError.shouldNotReachHere();
        }
        return result;
    }

    @Override
    public Variable emitConvert(ConvertNode.Op opcode, Value inputVal) {
        Variable input = load(inputVal);
        Variable result = newVariable(opcode.to);
        switch (opcode) {
            case I2L:
                append(new Unary2Op(I2L, result, input));
                break;
            case L2I:
                append(new Unary1Op(L2I, result, input));
                break;
            case I2B:
                append(new Unary2Op(I2B, result, input));
                break;
            case I2C:
                append(new Unary1Op(I2C, result, input));
                break;
            case I2S:
                append(new Unary2Op(I2S, result, input));
                break;
            case F2D:
                append(new Unary2Op(F2D, result, input));
                break;
            case D2F:
                append(new Unary2Op(D2F, result, input));
                break;
            case I2F:
                append(new Unary2Op(I2F, result, input));
                break;
            case I2D:
                append(new Unary2Op(I2D, result, input));
                break;
            case F2I:
                append(new Unary2Op(F2I, result, input));
                break;
            case D2I:
                append(new Unary2Op(D2I, result, input));
                break;
            case L2F:
                append(new Unary2Op(L2F, result, input));
                break;
            case L2D:
                append(new Unary2Op(L2D, result, input));
                break;
            case F2L:
                append(new Unary2Op(F2L, result, input));
                break;
            case D2L:
                append(new Unary2Op(D2L, result, input));
                break;
            case MOV_I2F:
                append(new Unary2Op(MOV_I2F, result, input));
                break;
            case MOV_L2D:
                append(new Unary2Op(MOV_L2D, result, input));
                break;
            case MOV_F2I:
                append(new Unary2Op(MOV_F2I, result, input));
                break;
            case MOV_D2L:
                append(new Unary2Op(MOV_D2L, result, input));
                break;
            case UNSIGNED_I2L:
                // Instructions that move or generate 32-bit register values also set the upper 32
                // bits of the register to zero.
                // Consequently, there is no need for a special zero-extension move.
                emitMove(result, input);
                break;
            default:
                throw GraalInternalError.shouldNotReachHere();
        }
        return result;
    }

    @Override
    public void emitDeoptimize(DeoptimizationAction action, DeoptimizingNode deopting) {
        append(new ReturnOp(Value.ILLEGAL));
    }

    @Override
    public void emitMembar(int barriers) {
        throw new InternalError("NYI");
    }

    @Override
    protected void emitDirectCall(DirectCallTargetNode callTarget, Value result, Value[] parameters, Value[] temps, LIRFrameState callState) {
        throw new InternalError("NYI");
    }

    @Override
    protected void emitIndirectCall(IndirectCallTargetNode callTarget, Value result, Value[] parameters, Value[] temps, LIRFrameState callState) {
        throw new InternalError("NYI");
    }

    @Override
    protected void emitCall(RuntimeCallTarget callTarget, Value result, Value[] arguments, Value[] temps, LIRFrameState info) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitBitCount(Variable result, Value value) {
        if (value.getKind().getStackKind() == Kind.Int) {
            append(new PTXBitManipulationOp(IPOPCNT, result, value));
        } else {
            append(new PTXBitManipulationOp(LPOPCNT, result, value));
        }
    }

    @Override
    public void emitBitScanForward(Variable result, Value value) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitBitScanReverse(Variable result, Value value) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitMathAbs(Variable result, Variable input) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitMathSqrt(Variable result, Variable input) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitMathLog(Variable result, Variable input, boolean base10) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitMathCos(Variable result, Variable input) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitMathSin(Variable result, Variable input) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitMathTan(Variable result, Variable input) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitByteSwap(Variable result, Value input) {
        throw new InternalError("NYI");
    }

    @Override
    protected void emitReturn(Value input) {
        append(new ReturnOp(input));
    }

    @Override
    protected void emitSequentialSwitch(Constant[] keyConstants, LabelRef[] keyTargets, LabelRef defaultTarget, Value key) {
        // Making a copy of the switch value is necessary because jump table destroys the input
        // value
        if (key.getKind() == Kind.Int || key.getKind() == Kind.Long) {
            append(new SequentialSwitchOp(keyConstants, keyTargets, defaultTarget, key, Value.ILLEGAL));
        } else {
            assert key.getKind() == Kind.Object : key.getKind();
            append(new SequentialSwitchOp(keyConstants, keyTargets, defaultTarget, key, newVariable(Kind.Object)));
        }
    }

    @Override
    protected void emitSwitchRanges(int[] lowKeys, int[] highKeys, LabelRef[] targets, LabelRef defaultTarget, Value key) {
        throw new InternalError("NYI");
    }

    @Override
    protected void emitTableSwitch(int lowKey, LabelRef defaultTarget, LabelRef[] targets, Value key) {
        // Making a copy of the switch value is necessary because jump table destroys the input
        // value
        Variable tmp = emitMove(key);
        append(new TableSwitchOp(lowKey, defaultTarget, targets, tmp, newVariable(target.wordKind)));
    }

    @Override
    public void visitCompareAndSwap(CompareAndSwapNode node) {
        throw new InternalError("NYI");
    }

    @Override
    public void visitBreakpointNode(BreakpointNode node) {
        throw new InternalError("NYI");
    }

    @Override
    public void visitSafepointNode(SafepointNode i) {
        // LIRFrameState info = state();
        // append(new PTXSafepointOp(info, runtime().config, this));
        throw new InternalError("NYI");
    }

    @Override
    public void emitUnwind(Value operand) {
        throw new InternalError("NYI");
    }

    @Override
    public void emitNullCheck(ValueNode v, DeoptimizingNode deopting) {
        throw new InternalError("NYI");
    }

    @Override
    public void visitInfopointNode(InfopointNode i) {
        throw new InternalError("NYI");
    }
}
