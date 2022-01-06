// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$13 {

    static final FunctionDescriptor vsprintf$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle vsprintf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "vsprintf",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$13.vsprintf$FUNC, false
    );
    static final FunctionDescriptor snprintf$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_LONG,
            C_POINTER
    );
    static final MethodHandle snprintf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "snprintf",
            "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
            constants$13.snprintf$FUNC, true
    );
    static final FunctionDescriptor vsnprintf$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_LONG,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle vsnprintf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "vsnprintf",
            "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$13.vsnprintf$FUNC, false
    );
    static final FunctionDescriptor vdprintf$FUNC = FunctionDescriptor.of(C_INT,
            C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle vdprintf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "vdprintf",
            "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$13.vdprintf$FUNC, false
    );
    static final FunctionDescriptor dprintf$FUNC = FunctionDescriptor.of(C_INT,
            C_INT,
            C_POINTER
    );
    static final MethodHandle dprintf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "dprintf",
            "(ILjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
            constants$13.dprintf$FUNC, true
    );
    static final FunctionDescriptor fscanf$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle fscanf$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fscanf",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
            constants$13.fscanf$FUNC, true
    );
}

