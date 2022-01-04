// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_INT;

public class __once_flag {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            C_INT.withName("__data")
    );
    static final VarHandle __data$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__data"));

    public static MemoryLayout $LAYOUT() {
        return __once_flag.$struct$LAYOUT;
    }

    public static VarHandle __data$VH() {
        return __once_flag.__data$VH;
    }

    public static int __data$get(MemorySegment seg) {
        return (int) __once_flag.__data$VH.get(seg);
    }

    public static void __data$set(MemorySegment seg, int x) {
        __once_flag.__data$VH.set(seg, x);
    }

    public static int __data$get(MemorySegment seg, long index) {
        return (int) __once_flag.__data$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void __data$set(MemorySegment seg, long index, int x) {
        __once_flag.__data$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static long sizeof() {
        return $LAYOUT().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate($LAYOUT());
    }

    public static MemorySegment allocate(ResourceScope scope) {
        return allocate(SegmentAllocator.ofScope(scope));
    }

    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }

    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope);
    }
}


