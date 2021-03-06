// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_INT;

public class timezone {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            C_INT.withName("tz_minuteswest"),
            C_INT.withName("tz_dsttime")
    ).withName("timezone");
    static final VarHandle tz_minuteswest$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tz_minuteswest"));
    static final VarHandle tz_dsttime$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tz_dsttime"));

    public static MemoryLayout $LAYOUT() {
        return timezone.$struct$LAYOUT;
    }

    public static VarHandle tz_minuteswest$VH() {
        return timezone.tz_minuteswest$VH;
    }

    public static int tz_minuteswest$get(MemorySegment seg) {
        return (int) timezone.tz_minuteswest$VH.get(seg);
    }

    public static void tz_minuteswest$set(MemorySegment seg, int x) {
        timezone.tz_minuteswest$VH.set(seg, x);
    }

    public static int tz_minuteswest$get(MemorySegment seg, long index) {
        return (int) timezone.tz_minuteswest$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void tz_minuteswest$set(MemorySegment seg, long index, int x) {
        timezone.tz_minuteswest$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle tz_dsttime$VH() {
        return timezone.tz_dsttime$VH;
    }

    public static int tz_dsttime$get(MemorySegment seg) {
        return (int) timezone.tz_dsttime$VH.get(seg);
    }

    public static void tz_dsttime$set(MemorySegment seg, int x) {
        timezone.tz_dsttime$VH.set(seg, x);
    }

    public static int tz_dsttime$get(MemorySegment seg, long index) {
        return (int) timezone.tz_dsttime$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void tz_dsttime$set(MemorySegment seg, long index, int x) {
        timezone.tz_dsttime$VH.set(seg.asSlice(index * sizeof()), x);
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


