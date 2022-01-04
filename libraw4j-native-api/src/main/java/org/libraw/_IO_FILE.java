// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;

public class _IO_FILE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            C_INT.withName("_flags"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("_IO_read_ptr"),
            C_POINTER.withName("_IO_read_end"),
            C_POINTER.withName("_IO_read_base"),
            C_POINTER.withName("_IO_write_base"),
            C_POINTER.withName("_IO_write_ptr"),
            C_POINTER.withName("_IO_write_end"),
            C_POINTER.withName("_IO_buf_base"),
            C_POINTER.withName("_IO_buf_end"),
            C_POINTER.withName("_IO_save_base"),
            C_POINTER.withName("_IO_backup_base"),
            C_POINTER.withName("_IO_save_end"),
            C_POINTER.withName("_markers"),
            C_POINTER.withName("_chain"),
            C_INT.withName("_fileno"),
            C_INT.withName("_flags2"),
            C_LONG.withName("_old_offset"),
            C_SHORT.withName("_cur_column"),
            C_CHAR.withName("_vtable_offset"),
            MemoryLayout.sequenceLayout(1, C_CHAR).withName("_shortbuf"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("_lock"),
            C_LONG.withName("_offset"),
            C_POINTER.withName("_codecvt"),
            C_POINTER.withName("_wide_data"),
            C_POINTER.withName("_freeres_list"),
            C_POINTER.withName("_freeres_buf"),
            C_LONG.withName("__pad5"),
            C_INT.withName("_mode"),
            MemoryLayout.sequenceLayout(20, C_CHAR).withName("_unused2")
    ).withName("_IO_FILE");
    static final VarHandle _flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_flags"));
    static final VarHandle _IO_read_ptr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_read_ptr")));
    static final VarHandle _IO_read_end$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_read_end")));
    static final VarHandle _IO_read_base$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_read_base")));
    static final VarHandle _IO_write_base$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_write_base")));
    static final VarHandle _IO_write_ptr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_write_ptr")));
    static final VarHandle _IO_write_end$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_write_end")));
    static final VarHandle _IO_buf_base$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_buf_base")));
    static final VarHandle _IO_buf_end$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_buf_end")));
    static final VarHandle _IO_save_base$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_save_base")));
    static final VarHandle _IO_backup_base$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_backup_base")));
    static final VarHandle _IO_save_end$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_IO_save_end")));
    static final VarHandle _markers$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_markers")));
    static final VarHandle _chain$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_chain")));
    static final VarHandle _fileno$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_fileno"));
    static final VarHandle _flags2$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_flags2"));
    static final VarHandle _old_offset$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_old_offset"));
    static final VarHandle _cur_column$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("_cur_column"));
    static final VarHandle _vtable_offset$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("_vtable_offset"));
    static final VarHandle _lock$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_lock")));
    static final VarHandle _offset$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_offset"));
    static final VarHandle _codecvt$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_codecvt")));
    static final VarHandle _wide_data$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_wide_data")));
    static final VarHandle _freeres_list$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_freeres_list")));
    static final VarHandle _freeres_buf$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_freeres_buf")));
    static final VarHandle __pad5$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("__pad5"));
    static final VarHandle _mode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_mode"));

    public static MemoryLayout $LAYOUT() {
        return _IO_FILE.$struct$LAYOUT;
    }

    public static VarHandle _flags$VH() {
        return _IO_FILE._flags$VH;
    }

    public static int _flags$get(MemorySegment seg) {
        return (int) _IO_FILE._flags$VH.get(seg);
    }

    public static void _flags$set(MemorySegment seg, int x) {
        _IO_FILE._flags$VH.set(seg, x);
    }

    public static int _flags$get(MemorySegment seg, long index) {
        return (int) _IO_FILE._flags$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _flags$set(MemorySegment seg, long index, int x) {
        _IO_FILE._flags$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_read_ptr$VH() {
        return _IO_FILE._IO_read_ptr$VH;
    }

    public static MemoryAddress _IO_read_ptr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_read_ptr$VH.get(seg);
    }

    public static void _IO_read_ptr$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_read_ptr$VH.set(seg, x);
    }

    public static MemoryAddress _IO_read_ptr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_read_ptr$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_read_ptr$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_read_ptr$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_read_end$VH() {
        return _IO_FILE._IO_read_end$VH;
    }

    public static MemoryAddress _IO_read_end$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_read_end$VH.get(seg);
    }

    public static void _IO_read_end$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_read_end$VH.set(seg, x);
    }

    public static MemoryAddress _IO_read_end$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_read_end$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_read_end$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_read_end$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_read_base$VH() {
        return _IO_FILE._IO_read_base$VH;
    }

    public static MemoryAddress _IO_read_base$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_read_base$VH.get(seg);
    }

    public static void _IO_read_base$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_read_base$VH.set(seg, x);
    }

    public static MemoryAddress _IO_read_base$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_read_base$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_read_base$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_read_base$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_write_base$VH() {
        return _IO_FILE._IO_write_base$VH;
    }

    public static MemoryAddress _IO_write_base$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_write_base$VH.get(seg);
    }

    public static void _IO_write_base$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_write_base$VH.set(seg, x);
    }

    public static MemoryAddress _IO_write_base$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_write_base$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_write_base$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_write_base$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_write_ptr$VH() {
        return _IO_FILE._IO_write_ptr$VH;
    }

    public static MemoryAddress _IO_write_ptr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_write_ptr$VH.get(seg);
    }

    public static void _IO_write_ptr$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_write_ptr$VH.set(seg, x);
    }

    public static MemoryAddress _IO_write_ptr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_write_ptr$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_write_ptr$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_write_ptr$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_write_end$VH() {
        return _IO_FILE._IO_write_end$VH;
    }

    public static MemoryAddress _IO_write_end$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_write_end$VH.get(seg);
    }

    public static void _IO_write_end$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_write_end$VH.set(seg, x);
    }

    public static MemoryAddress _IO_write_end$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_write_end$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_write_end$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_write_end$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_buf_base$VH() {
        return _IO_FILE._IO_buf_base$VH;
    }

    public static MemoryAddress _IO_buf_base$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_buf_base$VH.get(seg);
    }

    public static void _IO_buf_base$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_buf_base$VH.set(seg, x);
    }

    public static MemoryAddress _IO_buf_base$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_buf_base$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_buf_base$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_buf_base$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_buf_end$VH() {
        return _IO_FILE._IO_buf_end$VH;
    }

    public static MemoryAddress _IO_buf_end$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_buf_end$VH.get(seg);
    }

    public static void _IO_buf_end$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_buf_end$VH.set(seg, x);
    }

    public static MemoryAddress _IO_buf_end$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_buf_end$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_buf_end$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_buf_end$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_save_base$VH() {
        return _IO_FILE._IO_save_base$VH;
    }

    public static MemoryAddress _IO_save_base$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_save_base$VH.get(seg);
    }

    public static void _IO_save_base$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_save_base$VH.set(seg, x);
    }

    public static MemoryAddress _IO_save_base$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_save_base$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_save_base$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_save_base$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_backup_base$VH() {
        return _IO_FILE._IO_backup_base$VH;
    }

    public static MemoryAddress _IO_backup_base$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_backup_base$VH.get(seg);
    }

    public static void _IO_backup_base$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_backup_base$VH.set(seg, x);
    }

    public static MemoryAddress _IO_backup_base$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_backup_base$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_backup_base$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_backup_base$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _IO_save_end$VH() {
        return _IO_FILE._IO_save_end$VH;
    }

    public static MemoryAddress _IO_save_end$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_save_end$VH.get(seg);
    }

    public static void _IO_save_end$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._IO_save_end$VH.set(seg, x);
    }

    public static MemoryAddress _IO_save_end$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._IO_save_end$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _IO_save_end$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._IO_save_end$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _markers$VH() {
        return _IO_FILE._markers$VH;
    }

    public static MemoryAddress _markers$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._markers$VH.get(seg);
    }

    public static void _markers$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._markers$VH.set(seg, x);
    }

    public static MemoryAddress _markers$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._markers$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _markers$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._markers$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _chain$VH() {
        return _IO_FILE._chain$VH;
    }

    public static MemoryAddress _chain$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._chain$VH.get(seg);
    }

    public static void _chain$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._chain$VH.set(seg, x);
    }

    public static MemoryAddress _chain$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._chain$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _chain$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._chain$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _fileno$VH() {
        return _IO_FILE._fileno$VH;
    }

    public static int _fileno$get(MemorySegment seg) {
        return (int) _IO_FILE._fileno$VH.get(seg);
    }

    public static void _fileno$set(MemorySegment seg, int x) {
        _IO_FILE._fileno$VH.set(seg, x);
    }

    public static int _fileno$get(MemorySegment seg, long index) {
        return (int) _IO_FILE._fileno$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _fileno$set(MemorySegment seg, long index, int x) {
        _IO_FILE._fileno$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _flags2$VH() {
        return _IO_FILE._flags2$VH;
    }

    public static int _flags2$get(MemorySegment seg) {
        return (int) _IO_FILE._flags2$VH.get(seg);
    }

    public static void _flags2$set(MemorySegment seg, int x) {
        _IO_FILE._flags2$VH.set(seg, x);
    }

    public static int _flags2$get(MemorySegment seg, long index) {
        return (int) _IO_FILE._flags2$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _flags2$set(MemorySegment seg, long index, int x) {
        _IO_FILE._flags2$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _old_offset$VH() {
        return _IO_FILE._old_offset$VH;
    }

    public static long _old_offset$get(MemorySegment seg) {
        return (long) _IO_FILE._old_offset$VH.get(seg);
    }

    public static void _old_offset$set(MemorySegment seg, long x) {
        _IO_FILE._old_offset$VH.set(seg, x);
    }

    public static long _old_offset$get(MemorySegment seg, long index) {
        return (long) _IO_FILE._old_offset$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _old_offset$set(MemorySegment seg, long index, long x) {
        _IO_FILE._old_offset$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _cur_column$VH() {
        return _IO_FILE._cur_column$VH;
    }

    public static short _cur_column$get(MemorySegment seg) {
        return (short) _IO_FILE._cur_column$VH.get(seg);
    }

    public static void _cur_column$set(MemorySegment seg, short x) {
        _IO_FILE._cur_column$VH.set(seg, x);
    }

    public static short _cur_column$get(MemorySegment seg, long index) {
        return (short) _IO_FILE._cur_column$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _cur_column$set(MemorySegment seg, long index, short x) {
        _IO_FILE._cur_column$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _vtable_offset$VH() {
        return _IO_FILE._vtable_offset$VH;
    }

    public static byte _vtable_offset$get(MemorySegment seg) {
        return (byte) _IO_FILE._vtable_offset$VH.get(seg);
    }

    public static void _vtable_offset$set(MemorySegment seg, byte x) {
        _IO_FILE._vtable_offset$VH.set(seg, x);
    }

    public static byte _vtable_offset$get(MemorySegment seg, long index) {
        return (byte) _IO_FILE._vtable_offset$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _vtable_offset$set(MemorySegment seg, long index, byte x) {
        _IO_FILE._vtable_offset$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment _shortbuf$slice(MemorySegment seg) {
        return seg.asSlice(131, 1);
    }

    public static VarHandle _lock$VH() {
        return _IO_FILE._lock$VH;
    }

    public static MemoryAddress _lock$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._lock$VH.get(seg);
    }

    public static void _lock$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._lock$VH.set(seg, x);
    }

    public static MemoryAddress _lock$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._lock$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _lock$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._lock$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _offset$VH() {
        return _IO_FILE._offset$VH;
    }

    public static long _offset$get(MemorySegment seg) {
        return (long) _IO_FILE._offset$VH.get(seg);
    }

    public static void _offset$set(MemorySegment seg, long x) {
        _IO_FILE._offset$VH.set(seg, x);
    }

    public static long _offset$get(MemorySegment seg, long index) {
        return (long) _IO_FILE._offset$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _offset$set(MemorySegment seg, long index, long x) {
        _IO_FILE._offset$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _codecvt$VH() {
        return _IO_FILE._codecvt$VH;
    }

    public static MemoryAddress _codecvt$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._codecvt$VH.get(seg);
    }

    public static void _codecvt$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._codecvt$VH.set(seg, x);
    }

    public static MemoryAddress _codecvt$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._codecvt$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _codecvt$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._codecvt$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _wide_data$VH() {
        return _IO_FILE._wide_data$VH;
    }

    public static MemoryAddress _wide_data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._wide_data$VH.get(seg);
    }

    public static void _wide_data$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._wide_data$VH.set(seg, x);
    }

    public static MemoryAddress _wide_data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._wide_data$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _wide_data$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._wide_data$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _freeres_list$VH() {
        return _IO_FILE._freeres_list$VH;
    }

    public static MemoryAddress _freeres_list$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._freeres_list$VH.get(seg);
    }

    public static void _freeres_list$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._freeres_list$VH.set(seg, x);
    }

    public static MemoryAddress _freeres_list$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._freeres_list$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _freeres_list$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._freeres_list$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _freeres_buf$VH() {
        return _IO_FILE._freeres_buf$VH;
    }

    public static MemoryAddress _freeres_buf$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._freeres_buf$VH.get(seg);
    }

    public static void _freeres_buf$set(MemorySegment seg, MemoryAddress x) {
        _IO_FILE._freeres_buf$VH.set(seg, x);
    }

    public static MemoryAddress _freeres_buf$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) _IO_FILE._freeres_buf$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _freeres_buf$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_FILE._freeres_buf$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle __pad5$VH() {
        return _IO_FILE.__pad5$VH;
    }

    public static long __pad5$get(MemorySegment seg) {
        return (long) _IO_FILE.__pad5$VH.get(seg);
    }

    public static void __pad5$set(MemorySegment seg, long x) {
        _IO_FILE.__pad5$VH.set(seg, x);
    }

    public static long __pad5$get(MemorySegment seg, long index) {
        return (long) _IO_FILE.__pad5$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void __pad5$set(MemorySegment seg, long index, long x) {
        _IO_FILE.__pad5$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle _mode$VH() {
        return _IO_FILE._mode$VH;
    }

    public static int _mode$get(MemorySegment seg) {
        return (int) _IO_FILE._mode$VH.get(seg);
    }

    public static void _mode$set(MemorySegment seg, int x) {
        _IO_FILE._mode$VH.set(seg, x);
    }

    public static int _mode$get(MemorySegment seg, long index) {
        return (int) _IO_FILE._mode$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void _mode$set(MemorySegment seg, long index, int x) {
        _IO_FILE._mode$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment _unused2$slice(MemorySegment seg) {
        return seg.asSlice(196, 20);
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

