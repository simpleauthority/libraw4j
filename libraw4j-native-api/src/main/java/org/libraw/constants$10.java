// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$10 {

    static final FunctionDescriptor tempnam$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle tempnam$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "tempnam",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$10.tempnam$FUNC, false
    );
    static final FunctionDescriptor fclose$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final MethodHandle fclose$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fclose",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$10.fclose$FUNC, false
    );
    static final FunctionDescriptor fflush$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final MethodHandle fflush$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fflush",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$10.fflush$FUNC, false
    );
    static final FunctionDescriptor fflush_unlocked$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final MethodHandle fflush_unlocked$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fflush_unlocked",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$10.fflush_unlocked$FUNC, false
    );
    static final FunctionDescriptor fopen$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle fopen$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fopen",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$10.fopen$FUNC, false
    );
    static final FunctionDescriptor freopen$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle freopen$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "freopen",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$10.freopen$FUNC, false
    );
}

