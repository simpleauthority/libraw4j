// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryLayout;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$38 {

    static final FunctionDescriptor labs$FUNC = FunctionDescriptor.of(C_LONG,
            C_LONG
    );
    static final MethodHandle labs$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "labs",
            "(J)J",
            constants$38.labs$FUNC, false
    );
    static final FunctionDescriptor llabs$FUNC = FunctionDescriptor.of(C_LONG_LONG,
            C_LONG_LONG
    );
    static final MethodHandle llabs$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "llabs",
            "(J)J",
            constants$38.llabs$FUNC, false
    );
    static final FunctionDescriptor div$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    C_INT.withName("quot"),
                    C_INT.withName("rem")
            ),
            C_INT,
            C_INT
    );
    static final MethodHandle div$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "div",
            "(II)Ljdk/incubator/foreign/MemorySegment;",
            constants$38.div$FUNC, false
    );
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    C_LONG.withName("quot"),
                    C_LONG.withName("rem")
            ),
            C_LONG,
            C_LONG
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "ldiv",
            "(JJ)Ljdk/incubator/foreign/MemorySegment;",
            constants$38.ldiv$FUNC, false
    );
    static final FunctionDescriptor lldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    C_LONG_LONG.withName("quot"),
                    C_LONG_LONG.withName("rem")
            ),
            C_LONG_LONG,
            C_LONG_LONG
    );
    static final MethodHandle lldiv$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "lldiv",
            "(JJ)Ljdk/incubator/foreign/MemorySegment;",
            constants$38.lldiv$FUNC, false
    );
    static final FunctionDescriptor ecvt$FUNC = FunctionDescriptor.of(C_POINTER,
            C_DOUBLE,
            C_INT,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle ecvt$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "ecvt",
            "(DILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            constants$38.ecvt$FUNC, false
    );
}


