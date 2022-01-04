// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;

class constants$76 {

    static final FunctionDescriptor __fabsf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle __fabsf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__fabsf",
            "(F)F",
            constants$76.__fabsf$FUNC, false
    );
    static final FunctionDescriptor floorf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle floorf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "floorf",
            "(F)F",
            constants$76.floorf$FUNC, false
    );
    static final FunctionDescriptor __floorf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle __floorf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__floorf",
            "(F)F",
            constants$76.__floorf$FUNC, false
    );
    static final FunctionDescriptor fmodf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle fmodf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fmodf",
            "(FF)F",
            constants$76.fmodf$FUNC, false
    );
    static final FunctionDescriptor __fmodf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle __fmodf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__fmodf",
            "(FF)F",
            constants$76.__fmodf$FUNC, false
    );
    static final FunctionDescriptor isinff$FUNC = FunctionDescriptor.of(C_INT,
            C_FLOAT
    );
    static final MethodHandle isinff$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "isinff",
            "(F)I",
            constants$76.isinff$FUNC, false
    );
}


