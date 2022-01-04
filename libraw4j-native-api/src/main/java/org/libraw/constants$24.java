// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$24 {

    static final FunctionDescriptor strtof$FUNC = FunctionDescriptor.of(C_FLOAT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle strtof$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strtof",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)F",
            constants$24.strtof$FUNC, false
    );
    static final FunctionDescriptor strtol$FUNC = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_INT
    );
    static final MethodHandle strtol$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strtol",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)J",
            constants$24.strtol$FUNC, false
    );
    static final FunctionDescriptor strtoul$FUNC = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_INT
    );
    static final MethodHandle strtoul$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strtoul",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)J",
            constants$24.strtoul$FUNC, false
    );
    static final FunctionDescriptor strtoq$FUNC = FunctionDescriptor.of(C_LONG_LONG,
            C_POINTER,
            C_POINTER,
            C_INT
    );
    static final MethodHandle strtoq$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strtoq",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)J",
            constants$24.strtoq$FUNC, false
    );
    static final FunctionDescriptor strtouq$FUNC = FunctionDescriptor.of(C_LONG_LONG,
            C_POINTER,
            C_POINTER,
            C_INT
    );
    static final MethodHandle strtouq$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strtouq",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)J",
            constants$24.strtouq$FUNC, false
    );
    static final FunctionDescriptor strtoll$FUNC = FunctionDescriptor.of(C_LONG_LONG,
            C_POINTER,
            C_POINTER,
            C_INT
    );
    static final MethodHandle strtoll$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strtoll",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)J",
            constants$24.strtoll$FUNC, false
    );
}


