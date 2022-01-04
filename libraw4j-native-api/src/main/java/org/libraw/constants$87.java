// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;

class constants$87 {

    static final FunctionDescriptor llroundf$FUNC = FunctionDescriptor.of(C_LONG_LONG,
            C_FLOAT
    );
    static final MethodHandle llroundf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "llroundf",
            "(F)J",
            constants$87.llroundf$FUNC, false
    );
    static final FunctionDescriptor __llroundf$FUNC = FunctionDescriptor.of(C_LONG_LONG,
            C_FLOAT
    );
    static final MethodHandle __llroundf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__llroundf",
            "(F)J",
            constants$87.__llroundf$FUNC, false
    );
    static final FunctionDescriptor fdimf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle fdimf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fdimf",
            "(FF)F",
            constants$87.fdimf$FUNC, false
    );
    static final FunctionDescriptor __fdimf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle __fdimf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__fdimf",
            "(FF)F",
            constants$87.__fdimf$FUNC, false
    );
    static final FunctionDescriptor fmaxf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle fmaxf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fmaxf",
            "(FF)F",
            constants$87.fmaxf$FUNC, false
    );
    static final FunctionDescriptor __fmaxf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle __fmaxf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__fmaxf",
            "(FF)F",
            constants$87.__fmaxf$FUNC, false
    );
}


