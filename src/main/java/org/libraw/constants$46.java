// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$46 {

    static final FunctionDescriptor __asinh$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle __asinh$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__asinh",
            "(D)D",
            constants$46.__asinh$FUNC, false
    );
    static final FunctionDescriptor atanh$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle atanh$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "atanh",
            "(D)D",
            constants$46.atanh$FUNC, false
    );
    static final FunctionDescriptor __atanh$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle __atanh$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__atanh",
            "(D)D",
            constants$46.__atanh$FUNC, false
    );
    static final FunctionDescriptor exp$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle exp$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "exp",
            "(D)D",
            constants$46.exp$FUNC, false
    );
    static final FunctionDescriptor __exp$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE
    );
    static final MethodHandle __exp$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "__exp",
            "(D)D",
            constants$46.__exp$FUNC, false
    );
    static final FunctionDescriptor frexp$FUNC = FunctionDescriptor.of(C_DOUBLE,
            C_DOUBLE,
            C_POINTER
    );
    static final MethodHandle frexp$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "frexp",
            "(DLjdk/incubator/foreign/MemoryAddress;)D",
            constants$46.frexp$FUNC, false
    );
}


