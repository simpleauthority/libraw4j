// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public interface progress_callback {

    static MemoryAddress allocate(progress_callback fi) {
        return RuntimeHelper.upcallStub(progress_callback.class, fi, constants$93.progress_callback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;III)I");
    }

    static MemoryAddress allocate(progress_callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(progress_callback.class, fi, constants$93.progress_callback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;III)I", scope);
    }

    static progress_callback ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3) -> {
            try {
                return (int) constants$93.progress_callback$MH.invokeExact((Addressable) addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3);
}

