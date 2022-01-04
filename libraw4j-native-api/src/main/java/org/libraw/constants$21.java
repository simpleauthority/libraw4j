// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$21 {

    static final FunctionDescriptor ferror_unlocked$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final MethodHandle ferror_unlocked$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "ferror_unlocked",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$21.ferror_unlocked$FUNC, false
    );
    static final FunctionDescriptor perror$FUNC = FunctionDescriptor.ofVoid(
            C_POINTER
    );
    static final MethodHandle perror$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "perror",
            "(Ljdk/incubator/foreign/MemoryAddress;)V",
            constants$21.perror$FUNC, false
    );
    static final FunctionDescriptor fileno$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final MethodHandle fileno$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fileno",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$21.fileno$FUNC, false
    );
    static final FunctionDescriptor fileno_unlocked$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final MethodHandle fileno_unlocked$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "fileno_unlocked",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$21.fileno_unlocked$FUNC, false
    );
    static final FunctionDescriptor popen$FUNC = FunctionDescriptor.of(C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle popen$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "popen",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$21.popen$FUNC, false
    );
    static final FunctionDescriptor pclose$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final MethodHandle pclose$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "pclose",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$21.pclose$FUNC, false
    );
}

