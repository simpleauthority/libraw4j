// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_SHORT;

public class libraw_processed_image_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            C_INT.withName("type"),
            C_SHORT.withName("height"),
            C_SHORT.withName("width"),
            C_SHORT.withName("colors"),
            C_SHORT.withName("bits"),
            C_INT.withName("data_size"),
            MemoryLayout.sequenceLayout(1, C_CHAR).withName("data"),
            MemoryLayout.paddingLayout(24)
    );
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("height"));
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("width"));
    static final VarHandle colors$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("colors"));
    static final VarHandle bits$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("bits"));
    static final VarHandle data_size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("data_size"));

    public static MemoryLayout $LAYOUT() {
        return libraw_processed_image_t.$struct$LAYOUT;
    }

    public static VarHandle type$VH() {
        return libraw_processed_image_t.type$VH;
    }

    public static int type$get(MemorySegment seg) {
        return (int) libraw_processed_image_t.type$VH.get(seg);
    }

    public static void type$set(MemorySegment seg, int x) {
        libraw_processed_image_t.type$VH.set(seg, x);
    }

    public static int type$get(MemorySegment seg, long index) {
        return (int) libraw_processed_image_t.type$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void type$set(MemorySegment seg, long index, int x) {
        libraw_processed_image_t.type$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle height$VH() {
        return libraw_processed_image_t.height$VH;
    }

    public static short height$get(MemorySegment seg) {
        return (short) libraw_processed_image_t.height$VH.get(seg);
    }

    public static void height$set(MemorySegment seg, short x) {
        libraw_processed_image_t.height$VH.set(seg, x);
    }

    public static short height$get(MemorySegment seg, long index) {
        return (short) libraw_processed_image_t.height$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void height$set(MemorySegment seg, long index, short x) {
        libraw_processed_image_t.height$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle width$VH() {
        return libraw_processed_image_t.width$VH;
    }

    public static short width$get(MemorySegment seg) {
        return (short) libraw_processed_image_t.width$VH.get(seg);
    }

    public static void width$set(MemorySegment seg, short x) {
        libraw_processed_image_t.width$VH.set(seg, x);
    }

    public static short width$get(MemorySegment seg, long index) {
        return (short) libraw_processed_image_t.width$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void width$set(MemorySegment seg, long index, short x) {
        libraw_processed_image_t.width$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle colors$VH() {
        return libraw_processed_image_t.colors$VH;
    }

    public static short colors$get(MemorySegment seg) {
        return (short) libraw_processed_image_t.colors$VH.get(seg);
    }

    public static void colors$set(MemorySegment seg, short x) {
        libraw_processed_image_t.colors$VH.set(seg, x);
    }

    public static short colors$get(MemorySegment seg, long index) {
        return (short) libraw_processed_image_t.colors$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void colors$set(MemorySegment seg, long index, short x) {
        libraw_processed_image_t.colors$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle bits$VH() {
        return libraw_processed_image_t.bits$VH;
    }

    public static short bits$get(MemorySegment seg) {
        return (short) libraw_processed_image_t.bits$VH.get(seg);
    }

    public static void bits$set(MemorySegment seg, short x) {
        libraw_processed_image_t.bits$VH.set(seg, x);
    }

    public static short bits$get(MemorySegment seg, long index) {
        return (short) libraw_processed_image_t.bits$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void bits$set(MemorySegment seg, long index, short x) {
        libraw_processed_image_t.bits$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle data_size$VH() {
        return libraw_processed_image_t.data_size$VH;
    }

    public static int data_size$get(MemorySegment seg) {
        return (int) libraw_processed_image_t.data_size$VH.get(seg);
    }

    public static void data_size$set(MemorySegment seg, int x) {
        libraw_processed_image_t.data_size$VH.set(seg, x);
    }

    public static int data_size$get(MemorySegment seg, long index) {
        return (int) libraw_processed_image_t.data_size$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void data_size$set(MemorySegment seg, long index, int x) {
        libraw_processed_image_t.data_size$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(16, 1);
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


