// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$2 {

    static final FunctionDescriptor strcoll$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle strcoll$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strcoll",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$2.strcoll$FUNC, false
    );
    static final FunctionDescriptor strxfrm$FUNC = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_LONG
    );
    static final MethodHandle strxfrm$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strxfrm",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
            constants$2.strxfrm$FUNC, false
    );
    static final FunctionDescriptor strcoll_l$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle strcoll_l$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strcoll_l",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$2.strcoll_l$FUNC, false
    );
    static final FunctionDescriptor strxfrm_l$FUNC = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_LONG,
            C_POINTER
    );
    static final MethodHandle strxfrm_l$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strxfrm_l",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)J",
            constants$2.strxfrm_l$FUNC, false
    );
    static final FunctionDescriptor strdup$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER
    );
    static final MethodHandle strdup$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strdup",
            "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$2.strdup$FUNC, false
    );
    static final FunctionDescriptor strndup$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_LONG
    );
    static final MethodHandle strndup$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strndup",
            "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
            constants$2.strndup$FUNC, false
    );
}


