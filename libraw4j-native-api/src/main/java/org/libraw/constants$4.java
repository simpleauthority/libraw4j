// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$4 {

    static final FunctionDescriptor strtok$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle strtok$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strtok",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$4.strtok$FUNC, false
    );
    static final FunctionDescriptor __strtok_r$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle __strtok_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__strtok_r",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$4.__strtok_r$FUNC, false
    );
    static final FunctionDescriptor strtok_r$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle strtok_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strtok_r",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$4.strtok_r$FUNC, false
    );
    static final FunctionDescriptor strlen$FUNC = FunctionDescriptor.of(C_LONG,
            C_POINTER
    );
    static final MethodHandle strlen$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strlen",
            "(Ljdk/incubator/foreign/MemoryAddress;)J",
            constants$4.strlen$FUNC, false
    );
    static final FunctionDescriptor strnlen$FUNC = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_LONG
    );
    static final MethodHandle strnlen$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strnlen",
            "(Ljdk/incubator/foreign/MemoryAddress;J)J",
            constants$4.strnlen$FUNC, false
    );
    static final FunctionDescriptor strerror$FUNC = FunctionDescriptor.of(C_POINTER,
            C_INT
    );
    static final MethodHandle strerror$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strerror",
            "(I)Ljdk/incubator/foreign/MemoryAddress;",
            constants$4.strerror$FUNC, false
    );
}

