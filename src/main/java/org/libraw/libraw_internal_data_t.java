// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;

public class libraw_internal_data_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                    C_POINTER.withName("input"),
                    C_POINTER.withName("output"),
                    C_INT.withName("input_internal"),
                    MemoryLayout.paddingLayout(32),
                    C_POINTER.withName("meta_data"),
                    C_LONG_LONG.withName("profile_offset"),
                    C_LONG_LONG.withName("toffset"),
                    MemoryLayout.sequenceLayout(4, C_INT).withName("pana_black")
            ).withName("internal_data"),
            MemoryLayout.structLayout(
                    C_INT.withName("mix_green"),
                    C_INT.withName("raw_color"),
                    C_INT.withName("zero_is_bad"),
                    C_SHORT.withName("shrink"),
                    C_SHORT.withName("fuji_width")
            ).withName("internal_output_params"),
            MemoryLayout.structLayout(
                    C_POINTER.withName("histogram"),
                    C_POINTER.withName("oprof")
            ).withName("output_data"),
            MemoryLayout.structLayout(
                    C_INT.withName("olympus_exif_cfa"),
                    MemoryLayout.paddingLayout(32),
                    C_LONG_LONG.withName("unique_id"),
                    C_LONG_LONG.withName("OlyID"),
                    C_INT.withName("tiff_nifds"),
                    C_INT.withName("tiff_flip"),
                    C_INT.withName("metadata_blocks"),
                    MemoryLayout.paddingLayout(32)
            ).withName("identify_data"),
            MemoryLayout.structLayout(
                    C_SHORT.withName("order"),
                    MemoryLayout.sequenceLayout(4, C_SHORT).withName("sraw_mul"),
                    MemoryLayout.sequenceLayout(3, C_SHORT).withName("cr2_slice"),
                    C_INT.withName("kodak_cbpp"),
                    MemoryLayout.paddingLayout(32),
                    C_LONG_LONG.withName("strip_offset"),
                    C_LONG_LONG.withName("data_offset"),
                    C_LONG_LONG.withName("meta_offset"),
                    C_INT.withName("data_size"),
                    C_INT.withName("meta_length"),
                    C_INT.withName("thumb_misc"),
                    C_INT.withName("fuji_layout"),
                    C_INT.withName("tiff_samples"),
                    C_INT.withName("tiff_bps"),
                    C_INT.withName("tiff_compress"),
                    C_INT.withName("tiff_sampleformat"),
                    C_INT.withName("zero_after_ff"),
                    C_INT.withName("tile_width"),
                    C_INT.withName("tile_length"),
                    C_INT.withName("load_flags"),
                    C_INT.withName("data_error"),
                    C_INT.withName("hasselblad_parser_flag"),
                    C_LONG_LONG.withName("posRAFData"),
                    C_INT.withName("lenRAFData"),
                    C_INT.withName("fuji_total_lines"),
                    C_INT.withName("fuji_total_blocks"),
                    C_INT.withName("fuji_block_width"),
                    C_INT.withName("fuji_bits"),
                    C_INT.withName("fuji_raw_type"),
                    C_INT.withName("pana_encoding"),
                    C_INT.withName("pana_bpp"),
                    MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
                            C_INT.withName("version"),
                            C_INT.withName("f_width"),
                            C_INT.withName("f_height"),
                            C_INT.withName("tileWidth"),
                            C_INT.withName("tileHeight"),
                            C_INT.withName("nBits"),
                            C_INT.withName("nPlanes"),
                            C_INT.withName("cfaLayout"),
                            C_INT.withName("encType"),
                            C_INT.withName("imageLevels"),
                            C_INT.withName("hasTileCols"),
                            C_INT.withName("hasTileRows"),
                            C_INT.withName("mdatHdrSize"),
                            C_INT.withName("MediaSize"),
                            C_LONG_LONG.withName("MediaOffset"),
                            C_INT.withName("MediaType"),
                            MemoryLayout.paddingLayout(32)
                    )).withName("crx_header"),
                    C_INT.withName("crx_track_selected"),
                    C_SHORT.withName("CR3_CTMDtag"),
                    C_SHORT.withName("CR3_Version"),
                    C_INT.withName("CM_found"),
                    C_INT.withName("is_NikonTransfer"),
                    C_INT.withName("is_Sony"),
                    C_INT.withName("is_pana_raw"),
                    C_INT.withName("is_4K_RAFdata"),
                    C_INT.withName("is_PentaxRicohMakernotes"),
                    MemoryLayout.sequenceLayout(20, C_INT).withName("dng_frames"),
                    C_SHORT.withName("raw_stride"),
                    MemoryLayout.paddingLayout(48)
            ).withName("unpacker_data")
    );

    public static MemoryLayout $LAYOUT() {
        return libraw_internal_data_t.$struct$LAYOUT;
    }

    public static MemorySegment internal_data$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }

    public static MemorySegment internal_output_params$slice(MemorySegment seg) {
        return seg.asSlice(64, 16);
    }

    public static MemorySegment output_data$slice(MemorySegment seg) {
        return seg.asSlice(80, 16);
    }

    public static MemorySegment identify_data$slice(MemorySegment seg) {
        return seg.asSlice(96, 40);
    }

    public static MemorySegment unpacker_data$slice(MemorySegment seg) {
        return seg.asSlice(136, 1416);
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


