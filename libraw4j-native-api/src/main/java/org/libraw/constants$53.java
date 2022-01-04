// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;

class constants$53 {

    static final FunctionDescriptor finite$FUNC = FunctionDescriptor.of(C_INT,
            C_DOUBLE
    );
    static final MethodHandle finite$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "finite",
            "(D)I",
            constants$53.finite$FUNC, false
    );
    static final FunctionDescriptor drem$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle drem$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "drem",
            "(DD)D",
            constants$53.drem$FUNC, false
    );
    static final FunctionDescriptor __drem$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle __drem$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__drem",
            "(DD)D",
            constants$53.__drem$FUNC, false
    );
    static final FunctionDescriptor significand$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle significand$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "significand",
            "(D)D",
            constants$53.significand$FUNC, false
    );
    static final FunctionDescriptor __significand$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle __significand$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__significand",
            "(D)D",
            constants$53.__significand$FUNC, false
    );
    static final FunctionDescriptor copysign$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle copysign$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "copysign",
            "(DD)D",
            constants$53.copysign$FUNC, false
    );
}


