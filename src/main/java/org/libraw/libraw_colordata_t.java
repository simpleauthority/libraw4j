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
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;

public class libraw_colordata_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(65536, C_SHORT).withName("curve"),
            MemoryLayout.sequenceLayout(4104, C_INT).withName("cblack"),
            C_INT.withName("black"),
            C_INT.withName("data_maximum"),
            C_INT.withName("maximum"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(4, C_LONG).withName("linear_max"),
            C_FLOAT.withName("fmaximum"),
            C_FLOAT.withName("fnorm"),
            MemoryLayout.sequenceLayout(8, MemoryLayout.sequenceLayout(8, C_SHORT)).withName("white"),
            MemoryLayout.sequenceLayout(4, C_FLOAT).withName("cam_mul"),
            MemoryLayout.sequenceLayout(4, C_FLOAT).withName("pre_mul"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(4, C_FLOAT)).withName("cmatrix"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(4, C_FLOAT)).withName("ccm"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(4, C_FLOAT)).withName("rgb_cam"),
            MemoryLayout.sequenceLayout(4, MemoryLayout.sequenceLayout(3, C_FLOAT)).withName("cam_xyz"),
            MemoryLayout.structLayout(
                    C_INT.withName("format"),
                    C_INT.withName("key_off"),
                    C_INT.withName("tag_21a"),
                    C_INT.withName("t_black"),
                    C_INT.withName("split_col"),
                    C_INT.withName("black_col"),
                    C_INT.withName("split_row"),
                    C_INT.withName("black_row"),
                    C_FLOAT.withName("tag_210")
            ).withName("phase_one_data"),
            C_FLOAT.withName("flash_used"),
            C_FLOAT.withName("canon_ev"),
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("model2"),
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("UniqueCameraModel"),
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("LocalizedCameraModel"),
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("ImageUniqueID"),
            MemoryLayout.sequenceLayout(17, C_CHAR).withName("RawDataUniqueID"),
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("OriginalRawFileName"),
            MemoryLayout.paddingLayout(24),
            C_POINTER.withName("profile"),
            C_INT.withName("profile_length"),
            MemoryLayout.sequenceLayout(8, C_INT).withName("black_stat"),
            MemoryLayout.sequenceLayout(2, MemoryLayout.structLayout(
                    C_INT.withName("parsedfields"),
                    C_SHORT.withName("illuminant"),
                    MemoryLayout.paddingLayout(16),
                    MemoryLayout.sequenceLayout(4, MemoryLayout.sequenceLayout(4, C_FLOAT)).withName("calibration"),
                    MemoryLayout.sequenceLayout(4, MemoryLayout.sequenceLayout(3, C_FLOAT)).withName("colormatrix"),
                    MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(4, C_FLOAT)).withName("forwardmatrix")
            )).withName("dng_color"),
            MemoryLayout.structLayout(
                    C_INT.withName("parsedfields"),
                    MemoryLayout.sequenceLayout(4104, C_INT).withName("dng_cblack"),
                    C_INT.withName("dng_black"),
                    MemoryLayout.sequenceLayout(4104, C_FLOAT).withName("dng_fcblack"),
                    C_FLOAT.withName("dng_fblack"),
                    MemoryLayout.sequenceLayout(4, C_INT).withName("dng_whitelevel"),
                    MemoryLayout.sequenceLayout(4, C_INT).withName("default_crop"),
                    C_INT.withName("preview_colorspace"),
                    MemoryLayout.sequenceLayout(4, C_FLOAT).withName("analogbalance"),
                    MemoryLayout.sequenceLayout(4, C_FLOAT).withName("asshotneutral"),
                    C_FLOAT.withName("baseline_exposure"),
                    C_FLOAT.withName("LinearResponseLimit")
            ).withName("dng_levels"),
            MemoryLayout.sequenceLayout(256, MemoryLayout.sequenceLayout(4, C_INT)).withName("WB_Coeffs"),
            MemoryLayout.sequenceLayout(64, MemoryLayout.sequenceLayout(5, C_FLOAT)).withName("WBCT_Coeffs"),
            C_INT.withName("as_shot_wb_applied"),
            MemoryLayout.sequenceLayout(2, MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(9, C_FLOAT).withName("romm_cam")
            )).withName("P1_color"),
            C_INT.withName("raw_bps"),
            C_INT.withName("ExifColorSpace")
    );
    static final VarHandle black$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("black"));
    static final VarHandle data_maximum$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("data_maximum"));
    static final VarHandle maximum$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("maximum"));
    static final VarHandle fmaximum$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("fmaximum"));
    static final VarHandle fnorm$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("fnorm"));
    static final VarHandle flash_used$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("flash_used"));
    static final VarHandle canon_ev$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("canon_ev"));
    static final VarHandle profile$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("profile")));
    static final VarHandle profile_length$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("profile_length"));
    static final VarHandle as_shot_wb_applied$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("as_shot_wb_applied"));
    static final VarHandle raw_bps$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("raw_bps"));
    static final VarHandle ExifColorSpace$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ExifColorSpace"));

    public static MemoryLayout $LAYOUT() {
        return libraw_colordata_t.$struct$LAYOUT;
    }

    public static MemorySegment curve$slice(MemorySegment seg) {
        return seg.asSlice(0, 131072);
    }

    public static MemorySegment cblack$slice(MemorySegment seg) {
        return seg.asSlice(131072, 16416);
    }

    public static VarHandle black$VH() {
        return libraw_colordata_t.black$VH;
    }

    public static int black$get(MemorySegment seg) {
        return (int) libraw_colordata_t.black$VH.get(seg);
    }

    public static void black$set(MemorySegment seg, int x) {
        libraw_colordata_t.black$VH.set(seg, x);
    }

    public static int black$get(MemorySegment seg, long index) {
        return (int) libraw_colordata_t.black$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void black$set(MemorySegment seg, long index, int x) {
        libraw_colordata_t.black$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle data_maximum$VH() {
        return libraw_colordata_t.data_maximum$VH;
    }

    public static int data_maximum$get(MemorySegment seg) {
        return (int) libraw_colordata_t.data_maximum$VH.get(seg);
    }

    public static void data_maximum$set(MemorySegment seg, int x) {
        libraw_colordata_t.data_maximum$VH.set(seg, x);
    }

    public static int data_maximum$get(MemorySegment seg, long index) {
        return (int) libraw_colordata_t.data_maximum$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void data_maximum$set(MemorySegment seg, long index, int x) {
        libraw_colordata_t.data_maximum$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle maximum$VH() {
        return libraw_colordata_t.maximum$VH;
    }

    public static int maximum$get(MemorySegment seg) {
        return (int) libraw_colordata_t.maximum$VH.get(seg);
    }

    public static void maximum$set(MemorySegment seg, int x) {
        libraw_colordata_t.maximum$VH.set(seg, x);
    }

    public static int maximum$get(MemorySegment seg, long index) {
        return (int) libraw_colordata_t.maximum$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void maximum$set(MemorySegment seg, long index, int x) {
        libraw_colordata_t.maximum$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment linear_max$slice(MemorySegment seg) {
        return seg.asSlice(147504, 32);
    }

    public static VarHandle fmaximum$VH() {
        return libraw_colordata_t.fmaximum$VH;
    }

    public static float fmaximum$get(MemorySegment seg) {
        return (float) libraw_colordata_t.fmaximum$VH.get(seg);
    }

    public static void fmaximum$set(MemorySegment seg, float x) {
        libraw_colordata_t.fmaximum$VH.set(seg, x);
    }

    public static float fmaximum$get(MemorySegment seg, long index) {
        return (float) libraw_colordata_t.fmaximum$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void fmaximum$set(MemorySegment seg, long index, float x) {
        libraw_colordata_t.fmaximum$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle fnorm$VH() {
        return libraw_colordata_t.fnorm$VH;
    }

    public static float fnorm$get(MemorySegment seg) {
        return (float) libraw_colordata_t.fnorm$VH.get(seg);
    }

    public static void fnorm$set(MemorySegment seg, float x) {
        libraw_colordata_t.fnorm$VH.set(seg, x);
    }

    public static float fnorm$get(MemorySegment seg, long index) {
        return (float) libraw_colordata_t.fnorm$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void fnorm$set(MemorySegment seg, long index, float x) {
        libraw_colordata_t.fnorm$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment white$slice(MemorySegment seg) {
        return seg.asSlice(147544, 128);
    }

    public static MemorySegment cam_mul$slice(MemorySegment seg) {
        return seg.asSlice(147672, 16);
    }

    public static MemorySegment pre_mul$slice(MemorySegment seg) {
        return seg.asSlice(147688, 16);
    }

    public static MemorySegment cmatrix$slice(MemorySegment seg) {
        return seg.asSlice(147704, 48);
    }

    public static MemorySegment ccm$slice(MemorySegment seg) {
        return seg.asSlice(147752, 48);
    }

    public static MemorySegment rgb_cam$slice(MemorySegment seg) {
        return seg.asSlice(147800, 48);
    }

    public static MemorySegment cam_xyz$slice(MemorySegment seg) {
        return seg.asSlice(147848, 48);
    }

    public static MemorySegment phase_one_data$slice(MemorySegment seg) {
        return seg.asSlice(147896, 36);
    }

    public static VarHandle flash_used$VH() {
        return libraw_colordata_t.flash_used$VH;
    }

    public static float flash_used$get(MemorySegment seg) {
        return (float) libraw_colordata_t.flash_used$VH.get(seg);
    }

    public static void flash_used$set(MemorySegment seg, float x) {
        libraw_colordata_t.flash_used$VH.set(seg, x);
    }

    public static float flash_used$get(MemorySegment seg, long index) {
        return (float) libraw_colordata_t.flash_used$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void flash_used$set(MemorySegment seg, long index, float x) {
        libraw_colordata_t.flash_used$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle canon_ev$VH() {
        return libraw_colordata_t.canon_ev$VH;
    }

    public static float canon_ev$get(MemorySegment seg) {
        return (float) libraw_colordata_t.canon_ev$VH.get(seg);
    }

    public static void canon_ev$set(MemorySegment seg, float x) {
        libraw_colordata_t.canon_ev$VH.set(seg, x);
    }

    public static float canon_ev$get(MemorySegment seg, long index) {
        return (float) libraw_colordata_t.canon_ev$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void canon_ev$set(MemorySegment seg, long index, float x) {
        libraw_colordata_t.canon_ev$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment model2$slice(MemorySegment seg) {
        return seg.asSlice(147940, 64);
    }

    public static MemorySegment UniqueCameraModel$slice(MemorySegment seg) {
        return seg.asSlice(148004, 64);
    }

    public static MemorySegment LocalizedCameraModel$slice(MemorySegment seg) {
        return seg.asSlice(148068, 64);
    }

    public static MemorySegment ImageUniqueID$slice(MemorySegment seg) {
        return seg.asSlice(148132, 64);
    }

    public static MemorySegment RawDataUniqueID$slice(MemorySegment seg) {
        return seg.asSlice(148196, 17);
    }

    public static MemorySegment OriginalRawFileName$slice(MemorySegment seg) {
        return seg.asSlice(148213, 64);
    }

    public static VarHandle profile$VH() {
        return libraw_colordata_t.profile$VH;
    }

    public static MemoryAddress profile$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_colordata_t.profile$VH.get(seg);
    }

    public static void profile$set(MemorySegment seg, MemoryAddress x) {
        libraw_colordata_t.profile$VH.set(seg, x);
    }

    public static MemoryAddress profile$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) libraw_colordata_t.profile$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void profile$set(MemorySegment seg, long index, MemoryAddress x) {
        libraw_colordata_t.profile$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle profile_length$VH() {
        return libraw_colordata_t.profile_length$VH;
    }

    public static int profile_length$get(MemorySegment seg) {
        return (int) libraw_colordata_t.profile_length$VH.get(seg);
    }

    public static void profile_length$set(MemorySegment seg, int x) {
        libraw_colordata_t.profile_length$VH.set(seg, x);
    }

    public static int profile_length$get(MemorySegment seg, long index) {
        return (int) libraw_colordata_t.profile_length$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void profile_length$set(MemorySegment seg, long index, int x) {
        libraw_colordata_t.profile_length$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment black_stat$slice(MemorySegment seg) {
        return seg.asSlice(148292, 32);
    }

    public static MemorySegment dng_color$slice(MemorySegment seg) {
        return seg.asSlice(148324, 336);
    }

    public static MemorySegment dng_levels$slice(MemorySegment seg) {
        return seg.asSlice(148660, 32920);
    }

    public static MemorySegment WB_Coeffs$slice(MemorySegment seg) {
        return seg.asSlice(181580, 4096);
    }

    public static MemorySegment WBCT_Coeffs$slice(MemorySegment seg) {
        return seg.asSlice(185676, 1280);
    }

    public static VarHandle as_shot_wb_applied$VH() {
        return libraw_colordata_t.as_shot_wb_applied$VH;
    }

    public static int as_shot_wb_applied$get(MemorySegment seg) {
        return (int) libraw_colordata_t.as_shot_wb_applied$VH.get(seg);
    }

    public static void as_shot_wb_applied$set(MemorySegment seg, int x) {
        libraw_colordata_t.as_shot_wb_applied$VH.set(seg, x);
    }

    public static int as_shot_wb_applied$get(MemorySegment seg, long index) {
        return (int) libraw_colordata_t.as_shot_wb_applied$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void as_shot_wb_applied$set(MemorySegment seg, long index, int x) {
        libraw_colordata_t.as_shot_wb_applied$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment P1_color$slice(MemorySegment seg) {
        return seg.asSlice(186960, 72);
    }

    public static VarHandle raw_bps$VH() {
        return libraw_colordata_t.raw_bps$VH;
    }

    public static int raw_bps$get(MemorySegment seg) {
        return (int) libraw_colordata_t.raw_bps$VH.get(seg);
    }

    public static void raw_bps$set(MemorySegment seg, int x) {
        libraw_colordata_t.raw_bps$VH.set(seg, x);
    }

    public static int raw_bps$get(MemorySegment seg, long index) {
        return (int) libraw_colordata_t.raw_bps$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void raw_bps$set(MemorySegment seg, long index, int x) {
        libraw_colordata_t.raw_bps$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle ExifColorSpace$VH() {
        return libraw_colordata_t.ExifColorSpace$VH;
    }

    public static int ExifColorSpace$get(MemorySegment seg) {
        return (int) libraw_colordata_t.ExifColorSpace$VH.get(seg);
    }

    public static void ExifColorSpace$set(MemorySegment seg, int x) {
        libraw_colordata_t.ExifColorSpace$VH.set(seg, x);
    }

    public static int ExifColorSpace$get(MemorySegment seg, long index) {
        return (int) libraw_colordata_t.ExifColorSpace$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ExifColorSpace$set(MemorySegment seg, long index, int x) {
        libraw_colordata_t.ExifColorSpace$VH.set(seg.asSlice(index * sizeof()), x);
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


