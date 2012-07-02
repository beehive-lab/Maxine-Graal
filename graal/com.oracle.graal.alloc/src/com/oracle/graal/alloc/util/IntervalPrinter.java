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
package com.oracle.graal.alloc.util;

import static com.oracle.graal.alloc.util.LocationUtil.*;
import java.util.*;

import com.oracle.graal.alloc.simple.*;
import com.oracle.graal.api.code.*;
import com.oracle.graal.api.meta.*;
import com.oracle.graal.debug.*;
import com.oracle.graal.lir.*;
import com.oracle.graal.lir.LIRInstruction.*;
import com.oracle.graal.lir.cfg.*;

public final class IntervalPrinter {

    public static void printBeforeAllocation(String label, LIR lir, RegisterConfig registerConfig, DataFlowAnalysis dataFlow) {
        if (Debug.isDumpEnabled()) {
            IntervalPrinter printer = new IntervalPrinter(lir, registerConfig, dataFlow, null);
            Debug.dump(lir, label);
            Debug.dump(printer.execute(), label);
        }
    }

    public static void printAfterAllocation(String label, LIR lir, RegisterConfig registerConfig, DataFlowAnalysis dataFlow, LocationMap[] blockEndLocations) {
        if (Debug.isDumpEnabled()) {
            IntervalPrinter printer = new IntervalPrinter(lir, registerConfig, dataFlow, blockEndLocations);
            Debug.dump(lir, label);
            Debug.dump(printer.execute(), label);
        }
    }


    public static class Range {
        public final int from;
        public final int to;

        public Range(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    public static class UsePosition {
        public final int pos;
        public final String kind;

        public UsePosition(int pos, String kind) {
            this.pos = pos;
            this.kind = kind;
        }
    }

    public static class Interval {
        public final String name;
        public final String description;
        public final String variable;
        public final String type;
        public final List<Range> ranges;
        public final List<UsePosition> uses;

        protected final int orderNum;
        protected int lastTo;

        public Interval(int orderNum, String name, String description, String variable, String type) {
            this.orderNum = orderNum;
            this.name = name;
            this.description = description;
            this.variable = variable;
            this.type = type;
            this.ranges = new ArrayList<>();
            this.uses = new ArrayList<>();
        }
    }


    private final LIR lir;
    private final RegisterConfig registerConfig;
    private final DataFlowAnalysis dataFlow;
    private final LocationMap[] blockEndLocations;
    private final Variable[] variables;
    private final Map<String, Interval> intervals;

    private IntervalPrinter(LIR lir, RegisterConfig registerConfig, DataFlowAnalysis dataFlow, LocationMap[] blockEndLocations) {
        this.lir = lir;
        this.registerConfig = registerConfig;
        this.dataFlow = dataFlow;
        this.blockEndLocations = blockEndLocations;
        this.variables = new Variable[lir.numVariables()];
        this.intervals = new HashMap<>();
    }

    private boolean isAllocatableRegister(Value value) {
        return isRegister(value) && registerConfig.getAttributesMap()[asRegister(value).number].isAllocatable();
    }

    private int curOpId;
    private String curUseKind;

    public Interval[] execute() {
        ValueProcedure varProc = new ValueProcedure() { @Override public Value doValue(Value value) { return var(value); } };

        for (Block block : lir.linearScanOrder()) {
            for (LIRInstruction op : block.lir) {
                op.forEachOutput(varProc);
            }
        }

        ValueProcedure useProc = new ValueProcedure() { @Override public Value doValue(Value value, OperandMode mode, EnumSet<OperandFlag> flags) { return use(value, mode, flags); } };
        ValueProcedure defProc = new ValueProcedure() { @Override public Value doValue(Value value, OperandMode mode, EnumSet<OperandFlag> flags) { return def(value, flags); } };

        intervals.put("call", new Interval(-2, "call", "", "call", "hasCall"));
        intervals.put("st", new Interval(-1, "st", "", "st", "hasState"));

        for (int i = lir.linearScanOrder().size() - 1; i >= 0; i--) {
            Block block = lir.linearScanOrder().get(i);

            curOpId = block.getLastLirInstructionId() + 2;
            for (Block sux : block.getSuccessors()) {
                BitSet suxIn = dataFlow.liveIn(sux);
                for (int idx = suxIn.nextSetBit(0); idx >= 0; idx = suxIn.nextSetBit(idx + 1)) {
                    if (blockEndLocations != null) {
                        out(blockEndLocations[block.getId()].get(variables[idx]));
                    } else {
                        out(variables[idx]);
                    }
                }
            }

            for (int j = block.lir.size() - 1; j >= 0; j--) {
                LIRInstruction op = block.lir.get(j);
                if (op.id() >= 0) {
                    curOpId = op.id();
                } else {
                    curOpId = (curOpId - 1) | 1;
                }

                op.forEachOutput(defProc);
                op.forEachTemp(defProc);
                op.forEachInput(useProc);
                op.forEachAlive(useProc);
                curUseKind = "L";
                op.forEachState(useProc);
                curUseKind = null;

                if (op.hasCall()) {
                    intervals.get("call").ranges.add(new Range(curOpId, curOpId + 1));
                }
                if (op.hasState()) {
                    intervals.get("st").ranges.add(new Range(curOpId, curOpId + 1));
                }
            }

            for (Interval interval : intervals.values()) {
                if (interval.lastTo != 0) {
                    interval.ranges.add(new Range(block.getFirstLirInstructionId(), interval.lastTo));
                    interval.lastTo = 0;
                }
            }
        }

        Interval[] intervalsArray = intervals.values().toArray(new Interval[0]);
        Arrays.sort(intervalsArray, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.orderNum - o2.orderNum;
            }
        });
        return intervalsArray;
    }

    public Value var(Value value) {
        if (isLocation(value)) {
            variables[asLocation(value).variable.index] = asLocation(value).variable;
        } else if (isVariable(value)) {
            variables[asVariable(value).index] = asVariable(value);
        }
        return value;
    }

    private Interval findInterval(Value value) {
        Interval interval;
        if (isLocation(value)) {
            Interval parent = findInterval(asLocation(value).variable);
            String name = "v" + asLocation(value).variable.index + ":" + asLocation(value).location;
            String description = isStackSlot(asLocation(value).location) ? "stack" : "";
            interval = new Interval(asLocation(value).variable.index * 2 + 1001, name, description, parent.name, value.kind.javaName);

        } else if (isVariable(value)) {
            interval = new Interval(asVariable(value).index * 2 + 1000, value.toString(), "", value.toString(), value.kind.javaName);

        } else if (isAllocatableRegister(value)) {
            interval = new Interval(asRegister(value).number, asRegister(value).toString(), "", asRegister(value).toString(), "fixed");

        } else {
            return null;
        }

        Interval existing = intervals.get(interval.name);
        if (existing != null) {
            return existing;
        }
        intervals.put(interval.name, interval);
        return interval;
    }

    private String useKind(EnumSet<OperandFlag> flags) {
        if (curUseKind != null) {
            return curUseKind;
        } else if (flags.contains(OperandFlag.STACK)) {
            return "S";
        } else {
            return "M";
        }
    }

    private Value use(Value value, OperandMode mode, EnumSet<OperandFlag> flags) {
        Interval interval = findInterval(value);
        if (interval != null) {
            if (interval.uses.size() == 0 || interval.uses.get(interval.uses.size() - 1).pos != curOpId) {
                interval.uses.add(new UsePosition(curOpId, useKind(flags)));
            }
            if (interval.lastTo == 0) {
                interval.lastTo = curOpId + (mode == OperandMode.ALIVE ? 1 : 0);
            }
        }
        return value;
    }

    private Value def(Value value, EnumSet<OperandFlag> flags) {
        Interval interval = findInterval(value);
        if (interval != null) {
            interval.uses.add(new UsePosition(curOpId, useKind(flags)));
            if (interval.lastTo == 0) {
                interval.ranges.add(new Range(curOpId, curOpId + 1));
            } else {
                interval.ranges.add(new Range(curOpId, interval.lastTo));
            }
            interval.lastTo = 0;
        }
        return value;
    }

    private Value out(Value value) {
        Interval interval = findInterval(value);
        if (interval != null) {
            interval.lastTo = curOpId;
        }
        return value;
    }
}
