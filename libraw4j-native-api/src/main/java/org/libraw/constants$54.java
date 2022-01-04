// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$54 {

    static final FunctionDescriptor __copysign$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle __copysign$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__copysign",
            "(DD)D",
            constants$54.__copysign$FUNC, false
    );
    static final FunctionDescriptor nan$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_POINTER
    );
    static final MethodHandle nan$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "nan",
            "(Ljdk/incubator/foreign/MemoryAddress;)D",
            constants$54.nan$FUNC, false
    );
    static final FunctionDescriptor __nan$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_POINTER
    );
    static final MethodHandle __nan$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__nan",
            "(Ljdk/incubator/foreign/MemoryAddress;)D",
            constants$54.__nan$FUNC, false
    );
    static final FunctionDescriptor isnan$FUNC = FunctionDescriptor.of(C_INT,
            C_DOUBLE
    );
    static final MethodHandle isnan$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "isnan",
            "(D)I",
            constants$54.isnan$FUNC, false
    );
    static final FunctionDescriptor j0$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle j0$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "j0",
            "(D)D",
            constants$54.j0$FUNC, false
    );
    static final FunctionDescriptor __j0$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle __j0$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__j0",
            "(D)D",
            constants$54.__j0$FUNC, false
    );
}

