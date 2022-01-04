// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$28 {

    static final FunctionDescriptor setstate_r$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle setstate_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "setstate_r",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$28.setstate_r$FUNC, false
    );
    static final FunctionDescriptor rand$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle rand$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "rand",
            "()I",
            constants$28.rand$FUNC, false
    );
    static final FunctionDescriptor srand$FUNC = FunctionDescriptor.ofVoid(
            C_INT
    );
    static final MethodHandle srand$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "srand",
            "(I)V",
            constants$28.srand$FUNC, false
    );
    static final FunctionDescriptor rand_r$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final MethodHandle rand_r$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "rand_r",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$28.rand_r$FUNC, false
    );
    static final FunctionDescriptor drand48$FUNC = FunctionDescriptor.of(C_DOUBLE);
    static final MethodHandle drand48$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "drand48",
            "()D",
            constants$28.drand48$FUNC, false
    );
    static final FunctionDescriptor erand48$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_POINTER
    );
    static final MethodHandle erand48$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "erand48",
            "(Ljdk/incubator/foreign/MemoryAddress;)D",
            constants$28.erand48$FUNC, false
    );
}

