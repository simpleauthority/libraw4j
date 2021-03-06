// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$89 {

    static final MemoryLayout signgam$LAYOUT = C_INT;
    static final VarHandle signgam$VH = constants$89.signgam$LAYOUT.varHandle(int.class);
    static final MemorySegment signgam$SEGMENT = RuntimeHelper.lookupGlobalVariable(libraw_h.LIBRARIES, "signgam", constants$89.signgam$LAYOUT);
    static final FunctionDescriptor __errno_location$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle __errno_location$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__errno_location",
            "()Ljdk/incubator/foreign/MemoryAddress;",
            constants$89.__errno_location$FUNC, false
    );
    static final FunctionDescriptor gettimeofday$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle gettimeofday$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "gettimeofday",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$89.gettimeofday$FUNC, false
    );
    static final FunctionDescriptor settimeofday$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle settimeofday$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "settimeofday",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$89.settimeofday$FUNC, false
    );
    static final FunctionDescriptor adjtime$FUNC = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle adjtime$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "adjtime",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            constants$89.adjtime$FUNC, false
    );
    static final FunctionDescriptor getitimer$FUNC = FunctionDescriptor.of(C_INT,
            C_INT,
            C_POINTER
    );
    static final MethodHandle getitimer$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "getitimer",
            "(ILjdk/incubator/foreign/MemoryAddress;)I",
            constants$89.getitimer$FUNC, false
    );
}


