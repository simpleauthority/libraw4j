// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public interface atexit$__func {

    static MemoryAddress allocate(atexit$__func fi) {
        return RuntimeHelper.upcallStub(atexit$__func.class, fi, constants$33.atexit$__func$FUNC, "()V");
    }

    static MemoryAddress allocate(atexit$__func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(atexit$__func.class, fi, constants$33.atexit$__func$FUNC, "()V", scope);
    }

    static atexit$__func ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$33.atexit$__func$MH.invokeExact((Addressable) addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }

    void apply();
}

