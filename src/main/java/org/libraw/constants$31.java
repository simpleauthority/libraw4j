// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$31 {

    static final FunctionDescriptor jrand48_r$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle jrand48_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "jrand48_r",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$31.jrand48_r$FUNC, false
    );
    static final FunctionDescriptor srand48_r$FUNC = FunctionDescriptor.of(C_INT,
            C_LONG,
            C_POINTER
    );
    static final MethodHandle srand48_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "srand48_r",
            "(JLjdk/incubator/foreign/MemoryAddress;)I",
            constants$31.srand48_r$FUNC, false
    );
    static final FunctionDescriptor seed48_r$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle seed48_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "seed48_r",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$31.seed48_r$FUNC, false
    );
    static final FunctionDescriptor lcong48_r$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle lcong48_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "lcong48_r",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$31.lcong48_r$FUNC, false
    );
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(C_POINTER,
            C_LONG
    );
    static final MethodHandle malloc$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "malloc",
            "(J)Ljdk/incubator/foreign/MemoryAddress;",
            constants$31.malloc$FUNC, false
    );
    static final FunctionDescriptor calloc$FUNC = FunctionDescriptor.of(C_POINTER,
            C_LONG,
            C_LONG
    );
    static final MethodHandle calloc$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "calloc",
            "(JJ)Ljdk/incubator/foreign/MemoryAddress;",
            constants$31.calloc$FUNC, false
    );
}


