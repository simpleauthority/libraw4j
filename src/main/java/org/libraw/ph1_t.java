// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;

public class ph1_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            C_INT.withName("format"),
            C_INT.withName("key_off"),
            C_INT.withName("tag_21a"),
            C_INT.withName("t_black"),
            C_INT.withName("split_col"),
            C_INT.withName("black_col"),
            C_INT.withName("split_row"),
            C_INT.withName("black_row"),
            C_FLOAT.withName("tag_210")
    ).withName("ph1_t");
    static final VarHandle format$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("format"));
    static final VarHandle key_off$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("key_off"));
    static final VarHandle tag_21a$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tag_21a"));
    static final VarHandle t_black$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("t_black"));
    static final VarHandle split_col$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("split_col"));
    static final VarHandle black_col$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("black_col"));
    static final VarHandle split_row$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("split_row"));
    static final VarHandle black_row$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("black_row"));
    static final VarHandle tag_210$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("tag_210"));

    public static MemoryLayout $LAYOUT() {
        return ph1_t.$struct$LAYOUT;
    }

    public static VarHandle format$VH() {
        return ph1_t.format$VH;
    }

    public static int format$get(MemorySegment seg) {
        return (int) ph1_t.format$VH.get(seg);
    }

    public static void format$set(MemorySegment seg, int x) {
        ph1_t.format$VH.set(seg, x);
    }

    public static int format$get(MemorySegment seg, long index) {
        return (int) ph1_t.format$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void format$set(MemorySegment seg, long index, int x) {
        ph1_t.format$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle key_off$VH() {
        return ph1_t.key_off$VH;
    }

    public static int key_off$get(MemorySegment seg) {
        return (int) ph1_t.key_off$VH.get(seg);
    }

    public static void key_off$set(MemorySegment seg, int x) {
        ph1_t.key_off$VH.set(seg, x);
    }

    public static int key_off$get(MemorySegment seg, long index) {
        return (int) ph1_t.key_off$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void key_off$set(MemorySegment seg, long index, int x) {
        ph1_t.key_off$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle tag_21a$VH() {
        return ph1_t.tag_21a$VH;
    }

    public static int tag_21a$get(MemorySegment seg) {
        return (int) ph1_t.tag_21a$VH.get(seg);
    }

    public static void tag_21a$set(MemorySegment seg, int x) {
        ph1_t.tag_21a$VH.set(seg, x);
    }

    public static int tag_21a$get(MemorySegment seg, long index) {
        return (int) ph1_t.tag_21a$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void tag_21a$set(MemorySegment seg, long index, int x) {
        ph1_t.tag_21a$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle t_black$VH() {
        return ph1_t.t_black$VH;
    }

    public static int t_black$get(MemorySegment seg) {
        return (int) ph1_t.t_black$VH.get(seg);
    }

    public static void t_black$set(MemorySegment seg, int x) {
        ph1_t.t_black$VH.set(seg, x);
    }

    public static int t_black$get(MemorySegment seg, long index) {
        return (int) ph1_t.t_black$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void t_black$set(MemorySegment seg, long index, int x) {
        ph1_t.t_black$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle split_col$VH() {
        return ph1_t.split_col$VH;
    }

    public static int split_col$get(MemorySegment seg) {
        return (int) ph1_t.split_col$VH.get(seg);
    }

    public static void split_col$set(MemorySegment seg, int x) {
        ph1_t.split_col$VH.set(seg, x);
    }

    public static int split_col$get(MemorySegment seg, long index) {
        return (int) ph1_t.split_col$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void split_col$set(MemorySegment seg, long index, int x) {
        ph1_t.split_col$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle black_col$VH() {
        return ph1_t.black_col$VH;
    }

    public static int black_col$get(MemorySegment seg) {
        return (int) ph1_t.black_col$VH.get(seg);
    }

    public static void black_col$set(MemorySegment seg, int x) {
        ph1_t.black_col$VH.set(seg, x);
    }

    public static int black_col$get(MemorySegment seg, long index) {
        return (int) ph1_t.black_col$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void black_col$set(MemorySegment seg, long index, int x) {
        ph1_t.black_col$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle split_row$VH() {
        return ph1_t.split_row$VH;
    }

    public static int split_row$get(MemorySegment seg) {
        return (int) ph1_t.split_row$VH.get(seg);
    }

    public static void split_row$set(MemorySegment seg, int x) {
        ph1_t.split_row$VH.set(seg, x);
    }

    public static int split_row$get(MemorySegment seg, long index) {
        return (int) ph1_t.split_row$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void split_row$set(MemorySegment seg, long index, int x) {
        ph1_t.split_row$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle black_row$VH() {
        return ph1_t.black_row$VH;
    }

    public static int black_row$get(MemorySegment seg) {
        return (int) ph1_t.black_row$VH.get(seg);
    }

    public static void black_row$set(MemorySegment seg, int x) {
        ph1_t.black_row$VH.set(seg, x);
    }

    public static int black_row$get(MemorySegment seg, long index) {
        return (int) ph1_t.black_row$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void black_row$set(MemorySegment seg, long index, int x) {
        ph1_t.black_row$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle tag_210$VH() {
        return ph1_t.tag_210$VH;
    }

    public static float tag_210$get(MemorySegment seg) {
        return (float) ph1_t.tag_210$VH.get(seg);
    }

    public static void tag_210$set(MemorySegment seg, float x) {
        ph1_t.tag_210$VH.set(seg, x);
    }

    public static float tag_210$get(MemorySegment seg, long index) {
        return (float) ph1_t.tag_210$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void tag_210$set(MemorySegment seg, long index, float x) {
        ph1_t.tag_210$VH.set(seg.asSlice(index * sizeof()), x);
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


