// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;

class constants$41 {

    static final FunctionDescriptor __fpclassify$FUNC = FunctionDescriptor.of(C_INT,
            C_DOUBLE
    );
    static final MethodHandle __fpclassify$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__fpclassify",
            "(D)I",
            constants$41.__fpclassify$FUNC, false
    );
    static final FunctionDescriptor __signbit$FUNC = FunctionDescriptor.of(C_INT,
            C_DOUBLE
    );
    static final MethodHandle __signbit$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__signbit",
            "(D)I",
            constants$41.__signbit$FUNC, false
    );
    static final FunctionDescriptor __isinf$FUNC = FunctionDescriptor.of(C_INT,
            C_DOUBLE
    );
    static final MethodHandle __isinf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__isinf",
            "(D)I",
            constants$41.__isinf$FUNC, false
    );
    static final FunctionDescriptor __finite$FUNC = FunctionDescriptor.of(C_INT,
            C_DOUBLE
    );
    static final MethodHandle __finite$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__finite",
            "(D)I",
            constants$41.__finite$FUNC, false
    );
    static final FunctionDescriptor __isnan$FUNC = FunctionDescriptor.of(C_INT,
            C_DOUBLE
    );
    static final MethodHandle __isnan$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__isnan",
            "(D)I",
            constants$41.__isnan$FUNC, false
    );
    static final FunctionDescriptor __iseqsig$FUNC = FunctionDescriptor.of(C_INT,
            C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle __iseqsig$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__iseqsig",
            "(DD)I",
            constants$41.__iseqsig$FUNC, false
    );
}


