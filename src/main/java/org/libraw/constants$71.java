// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$71 {

    static final FunctionDescriptor __frexpf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_POINTER
    );
    static final MethodHandle __frexpf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__frexpf",
            "(FLjdk/incubator/foreign/MemoryAddress;)F",
            constants$71.__frexpf$FUNC, false
    );
    static final FunctionDescriptor ldexpf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_INT
    );
    static final MethodHandle ldexpf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "ldexpf",
            "(FI)F",
            constants$71.ldexpf$FUNC, false
    );
    static final FunctionDescriptor __ldexpf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT,
            C_INT
    );
    static final MethodHandle __ldexpf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__ldexpf",
            "(FI)F",
            constants$71.__ldexpf$FUNC, false
    );
    static final FunctionDescriptor logf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle logf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "logf",
            "(F)F",
            constants$71.logf$FUNC, false
    );
    static final FunctionDescriptor __logf$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle __logf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__logf",
            "(F)F",
            constants$71.__logf$FUNC, false
    );
    static final FunctionDescriptor log10f$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_FLOAT
    );
    static final MethodHandle log10f$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "log10f",
            "(F)F",
            constants$71.log10f$FUNC, false
    );
}


