// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public interface process_step_callback {

    static MemoryAddress allocate(process_step_callback fi) {
        return RuntimeHelper.upcallStub(process_step_callback.class, fi, constants$94.process_step_callback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }

    static MemoryAddress allocate(process_step_callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(process_step_callback.class, fi, constants$94.process_step_callback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }

    static process_step_callback ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$94.process_step_callback$MH.invokeExact((Addressable) addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }

    void apply(jdk.incubator.foreign.MemoryAddress x0);
}


