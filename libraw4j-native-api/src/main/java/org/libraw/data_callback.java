// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public interface data_callback {

    static MemoryAddress allocate(data_callback fi) {
        return RuntimeHelper.upcallStub(data_callback.class, fi, constants$92.data_callback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V");
    }

    static MemoryAddress allocate(data_callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(data_callback.class, fi, constants$92.data_callback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
    }

    static data_callback ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2) -> {
            try {
                constants$92.data_callback$MH.invokeExact((Addressable) addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2);
}


