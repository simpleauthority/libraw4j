// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class constants$92 {

    static final FunctionDescriptor exif_parser_callback$FUNC = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_INT,
            C_INT,
            C_INT,
            C_INT,
            C_POINTER,
            C_LONG_LONG
    );
    static final MethodHandle exif_parser_callback$MH = RuntimeHelper.downcallHandle(
            "(Ljdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;J)V",
            constants$92.exif_parser_callback$FUNC, false
    );
    static final FunctionDescriptor default_memory_callback$FUNC = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_POINTER,
            C_POINTER
    );
    static final MethodHandle default_memory_callback$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "default_memory_callback",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
            constants$92.default_memory_callback$FUNC, false
    );
    static final FunctionDescriptor data_callback$FUNC = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_POINTER,
            C_INT
    );
    static final MethodHandle data_callback$MH = RuntimeHelper.downcallHandle(
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
            constants$92.data_callback$FUNC, false
    );
    static final FunctionDescriptor default_data_callback$FUNC = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_POINTER,
            C_INT
    );
    static final MethodHandle default_data_callback$MH = RuntimeHelper.downcallHandle(
            libraw_h.LIBRARIES, "default_data_callback",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
            constants$92.default_data_callback$FUNC, false
    );
}


