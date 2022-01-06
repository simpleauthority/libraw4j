// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$5 {

    static final FunctionDescriptor strerror_r$FUNC = FunctionDescriptor.of(C_INT,
            C_INT,
            C_POINTER,
            C_LONG
    );
    static final MethodHandle strerror_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strerror_r",
            "(ILjdk/incubator/foreign/MemoryAddress;J)I",
            constants$5.strerror_r$FUNC, false
    );
    static final FunctionDescriptor strerror_l$FUNC = FunctionDescriptor.of(C_POINTER,
            C_INT,
            C_POINTER
    );
    static final MethodHandle strerror_l$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "strerror_l",
            "(ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$5.strerror_l$FUNC, false
    );
    static final FunctionDescriptor bcmp$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER,
            C_LONG
    );
    static final MethodHandle bcmp$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "bcmp",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
            constants$5.bcmp$FUNC, false
    );
    static final FunctionDescriptor bcopy$FUNC = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_POINTER,
            C_LONG
    );
    static final MethodHandle bcopy$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "bcopy",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)V",
            constants$5.bcopy$FUNC, false
    );
    static final FunctionDescriptor bzero$FUNC = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_LONG
    );
    static final MethodHandle bzero$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "bzero",
            "(Ljdk/incubator/foreign/MemoryAddress;J)V",
            constants$5.bzero$FUNC, false
    );
    static final FunctionDescriptor index$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_INT
    );
    static final MethodHandle index$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "index",
            "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
            constants$5.index$FUNC, false
    );
}

