// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_POINTER;

public class libraw_callbacks_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            C_POINTER.withName("mem_cb"),
            C_POINTER.withName("memcb_data"),
            C_POINTER.withName("data_cb"),
            C_POINTER.withName("datacb_data"),
            C_POINTER.withName("progress_cb"),
            C_POINTER.withName("progresscb_data"),
            C_POINTER.withName("exif_cb"),
            C_POINTER.withName("exifparser_data"),
            C_POINTER.withName("pre_identify_cb"),
            C_POINTER.withName("post_identify_cb"),
            C_POINTER.withName("pre_subtractblack_cb"),
            C_POINTER.withName("pre_scalecolors_cb"),
            C_POINTER.withName("pre_preinterpolate_cb"),
            C_POINTER.withName("pre_interpolate_cb"),
            C_POINTER.withName("interpolate_bayer_cb"),
            C_POINTER.withName("interpolate_xtrans_cb"),
            C_POINTER.withName("post_interpolate_cb"),
            C_POINTER.withName("pre_converttorgb_cb"),
            C_POINTER.withName("post_converttorgb_cb")
    );
    static final VarHandle mem_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("mem_cb")));
    static final VarHandle memcb_data$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("memcb_data")));
    static final VarHandle data_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("data_cb")));
    static final VarHandle datacb_data$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("datacb_data")));
    static final VarHandle progress_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("progress_cb")));
    static final VarHandle progresscb_data$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("progresscb_data")));
    static final VarHandle exif_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("exif_cb")));
    static final VarHandle exifparser_data$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("exifparser_data")));
    static final VarHandle pre_identify_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pre_identify_cb")));
    static final VarHandle post_identify_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("post_identify_cb")));
    static final VarHandle pre_subtractblack_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pre_subtractblack_cb")));
    static final VarHandle pre_scalecolors_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pre_scalecolors_cb")));
    static final VarHandle pre_preinterpolate_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pre_preinterpolate_cb")));
    static final VarHandle pre_interpolate_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pre_interpolate_cb")));
    static final VarHandle interpolate_bayer_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("interpolate_bayer_cb")));
    static final VarHandle interpolate_xtrans_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("interpolate_xtrans_cb")));
    static final VarHandle post_interpolate_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("post_interpolate_cb")));
    static final VarHandle pre_converttorgb_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pre_converttorgb_cb")));
    static final VarHandle post_converttorgb_cb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("post_converttorgb_cb")));

    public static MemoryLayout $LAYOUT() {
        return libraw_callbacks_t.$struct$LAYOUT;
    }

    public static VarHandle mem_cb$VH() {
        return libraw_callbacks_t.mem_cb$VH;
    }

    public static MemoryAddress mem_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.mem_cb$VH.get(seg);
    }

    public static void mem_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.mem_cb$VH.set(seg, x);
    }

    public static MemoryAddress mem_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.mem_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void mem_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.mem_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static memory_callback mem_cb(MemorySegment segment) {
        return memory_callback.ofAddress(mem_cb$get(segment));
    }

    public static VarHandle memcb_data$VH() {
        return libraw_callbacks_t.memcb_data$VH;
    }

    public static MemoryAddress memcb_data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.memcb_data$VH.get(seg);
    }

    public static void memcb_data$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.memcb_data$VH.set(seg, x);
    }

    public static MemoryAddress memcb_data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.memcb_data$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void memcb_data$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.memcb_data$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle data_cb$VH() {
        return libraw_callbacks_t.data_cb$VH;
    }

    public static MemoryAddress data_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.data_cb$VH.get(seg);
    }

    public static void data_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.data_cb$VH.set(seg, x);
    }

    public static MemoryAddress data_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.data_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void data_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.data_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static data_callback data_cb(MemorySegment segment) {
        return data_callback.ofAddress(data_cb$get(segment));
    }

    public static VarHandle datacb_data$VH() {
        return libraw_callbacks_t.datacb_data$VH;
    }

    public static MemoryAddress datacb_data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.datacb_data$VH.get(seg);
    }

    public static void datacb_data$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.datacb_data$VH.set(seg, x);
    }

    public static MemoryAddress datacb_data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.datacb_data$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void datacb_data$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.datacb_data$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle progress_cb$VH() {
        return libraw_callbacks_t.progress_cb$VH;
    }

    public static MemoryAddress progress_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.progress_cb$VH.get(seg);
    }

    public static void progress_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.progress_cb$VH.set(seg, x);
    }

    public static MemoryAddress progress_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.progress_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void progress_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.progress_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static progress_callback progress_cb(MemorySegment segment) {
        return progress_callback.ofAddress(progress_cb$get(segment));
    }

    public static VarHandle progresscb_data$VH() {
        return libraw_callbacks_t.progresscb_data$VH;
    }

    public static MemoryAddress progresscb_data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.progresscb_data$VH.get(seg);
    }

    public static void progresscb_data$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.progresscb_data$VH.set(seg, x);
    }

    public static MemoryAddress progresscb_data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.progresscb_data$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void progresscb_data$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.progresscb_data$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle exif_cb$VH() {
        return libraw_callbacks_t.exif_cb$VH;
    }

    public static MemoryAddress exif_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.exif_cb$VH.get(seg);
    }

    public static void exif_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.exif_cb$VH.set(seg, x);
    }

    public static MemoryAddress exif_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.exif_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void exif_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.exif_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static exif_parser_callback exif_cb(MemorySegment segment) {
        return exif_parser_callback.ofAddress(exif_cb$get(segment));
    }

    public static VarHandle exifparser_data$VH() {
        return libraw_callbacks_t.exifparser_data$VH;
    }

    public static MemoryAddress exifparser_data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.exifparser_data$VH.get(seg);
    }

    public static void exifparser_data$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.exifparser_data$VH.set(seg, x);
    }

    public static MemoryAddress exifparser_data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.exifparser_data$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void exifparser_data$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.exifparser_data$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle pre_identify_cb$VH() {
        return libraw_callbacks_t.pre_identify_cb$VH;
    }

    public static MemoryAddress pre_identify_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_identify_cb$VH.get(seg);
    }

    public static void pre_identify_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.pre_identify_cb$VH.set(seg, x);
    }

    public static MemoryAddress pre_identify_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_identify_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void pre_identify_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.pre_identify_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static pre_identify_callback pre_identify_cb(MemorySegment segment) {
        return pre_identify_callback.ofAddress(pre_identify_cb$get(segment));
    }

    public static VarHandle post_identify_cb$VH() {
        return libraw_callbacks_t.post_identify_cb$VH;
    }

    public static MemoryAddress post_identify_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.post_identify_cb$VH.get(seg);
    }

    public static void post_identify_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.post_identify_cb$VH.set(seg, x);
    }

    public static MemoryAddress post_identify_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.post_identify_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void post_identify_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.post_identify_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static post_identify_callback post_identify_cb(MemorySegment segment) {
        return post_identify_callback.ofAddress(post_identify_cb$get(segment));
    }

    public static VarHandle pre_subtractblack_cb$VH() {
        return libraw_callbacks_t.pre_subtractblack_cb$VH;
    }

    public static MemoryAddress pre_subtractblack_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_subtractblack_cb$VH.get(seg);
    }

    public static void pre_subtractblack_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.pre_subtractblack_cb$VH.set(seg, x);
    }

    public static MemoryAddress pre_subtractblack_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_subtractblack_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void pre_subtractblack_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.pre_subtractblack_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback pre_subtractblack_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(pre_subtractblack_cb$get(segment));
    }

    public static VarHandle pre_scalecolors_cb$VH() {
        return libraw_callbacks_t.pre_scalecolors_cb$VH;
    }

    public static MemoryAddress pre_scalecolors_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_scalecolors_cb$VH.get(seg);
    }

    public static void pre_scalecolors_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.pre_scalecolors_cb$VH.set(seg, x);
    }

    public static MemoryAddress pre_scalecolors_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_scalecolors_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void pre_scalecolors_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.pre_scalecolors_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback pre_scalecolors_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(pre_scalecolors_cb$get(segment));
    }

    public static VarHandle pre_preinterpolate_cb$VH() {
        return libraw_callbacks_t.pre_preinterpolate_cb$VH;
    }

    public static MemoryAddress pre_preinterpolate_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_preinterpolate_cb$VH.get(seg);
    }

    public static void pre_preinterpolate_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.pre_preinterpolate_cb$VH.set(seg, x);
    }

    public static MemoryAddress pre_preinterpolate_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_preinterpolate_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void pre_preinterpolate_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.pre_preinterpolate_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback pre_preinterpolate_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(pre_preinterpolate_cb$get(segment));
    }

    public static VarHandle pre_interpolate_cb$VH() {
        return libraw_callbacks_t.pre_interpolate_cb$VH;
    }

    public static MemoryAddress pre_interpolate_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_interpolate_cb$VH.get(seg);
    }

    public static void pre_interpolate_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.pre_interpolate_cb$VH.set(seg, x);
    }

    public static MemoryAddress pre_interpolate_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_interpolate_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void pre_interpolate_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.pre_interpolate_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback pre_interpolate_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(pre_interpolate_cb$get(segment));
    }

    public static VarHandle interpolate_bayer_cb$VH() {
        return libraw_callbacks_t.interpolate_bayer_cb$VH;
    }

    public static MemoryAddress interpolate_bayer_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.interpolate_bayer_cb$VH.get(seg);
    }

    public static void interpolate_bayer_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.interpolate_bayer_cb$VH.set(seg, x);
    }

    public static MemoryAddress interpolate_bayer_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.interpolate_bayer_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void interpolate_bayer_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.interpolate_bayer_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback interpolate_bayer_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(interpolate_bayer_cb$get(segment));
    }

    public static VarHandle interpolate_xtrans_cb$VH() {
        return libraw_callbacks_t.interpolate_xtrans_cb$VH;
    }

    public static MemoryAddress interpolate_xtrans_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.interpolate_xtrans_cb$VH.get(seg);
    }

    public static void interpolate_xtrans_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.interpolate_xtrans_cb$VH.set(seg, x);
    }

    public static MemoryAddress interpolate_xtrans_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.interpolate_xtrans_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void interpolate_xtrans_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.interpolate_xtrans_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback interpolate_xtrans_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(interpolate_xtrans_cb$get(segment));
    }

    public static VarHandle post_interpolate_cb$VH() {
        return libraw_callbacks_t.post_interpolate_cb$VH;
    }

    public static MemoryAddress post_interpolate_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.post_interpolate_cb$VH.get(seg);
    }

    public static void post_interpolate_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.post_interpolate_cb$VH.set(seg, x);
    }

    public static MemoryAddress post_interpolate_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.post_interpolate_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void post_interpolate_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.post_interpolate_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback post_interpolate_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(post_interpolate_cb$get(segment));
    }

    public static VarHandle pre_converttorgb_cb$VH() {
        return libraw_callbacks_t.pre_converttorgb_cb$VH;
    }

    public static MemoryAddress pre_converttorgb_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_converttorgb_cb$VH.get(seg);
    }

    public static void pre_converttorgb_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.pre_converttorgb_cb$VH.set(seg, x);
    }

    public static MemoryAddress pre_converttorgb_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.pre_converttorgb_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void pre_converttorgb_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.pre_converttorgb_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback pre_converttorgb_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(pre_converttorgb_cb$get(segment));
    }

    public static VarHandle post_converttorgb_cb$VH() {
        return libraw_callbacks_t.post_converttorgb_cb$VH;
    }

    public static MemoryAddress post_converttorgb_cb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.post_converttorgb_cb$VH.get(seg);
    }

    public static void post_converttorgb_cb$set(MemorySegment seg, MemoryAddress x) {
        libraw_callbacks_t.post_converttorgb_cb$VH.set(seg, x);
    }

    public static MemoryAddress post_converttorgb_cb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_callbacks_t.post_converttorgb_cb$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void post_converttorgb_cb$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_callbacks_t.post_converttorgb_cb$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static process_step_callback post_converttorgb_cb(MemorySegment segment) {
        return process_step_callback.ofAddress(post_converttorgb_cb$get(segment));
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


