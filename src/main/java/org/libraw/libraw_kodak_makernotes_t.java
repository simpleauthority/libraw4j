// Generated by jextract

package org.libraw;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_SHORT;

public class libraw_kodak_makernotes_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
            C_SHORT.withName("BlackLevelTop"),
            C_SHORT.withName("BlackLevelBottom"),
            C_SHORT.withName("offset_left"),
            C_SHORT.withName("offset_top"),
            C_SHORT.withName("clipBlack"),
            C_SHORT.withName("clipWhite"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(3, C_FLOAT)).withName("romm_camDaylight"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(3, C_FLOAT)).withName("romm_camTungsten"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(3, C_FLOAT)).withName("romm_camFluorescent"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(3, C_FLOAT)).withName("romm_camFlash"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(3, C_FLOAT)).withName("romm_camCustom"),
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(3, C_FLOAT)).withName("romm_camAuto"),
            C_SHORT.withName("val018percent"),
            C_SHORT.withName("val100percent"),
            C_SHORT.withName("val170percent"),
            C_SHORT.withName("MakerNoteKodak8a"),
            C_FLOAT.withName("ISOCalibrationGain"),
            C_FLOAT.withName("AnalogISO")
    );
    static final VarHandle BlackLevelTop$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("BlackLevelTop"));
    static final VarHandle BlackLevelBottom$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("BlackLevelBottom"));
    static final VarHandle offset_left$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("offset_left"));
    static final VarHandle offset_top$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("offset_top"));
    static final VarHandle clipBlack$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("clipBlack"));
    static final VarHandle clipWhite$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("clipWhite"));
    static final VarHandle val018percent$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("val018percent"));
    static final VarHandle val100percent$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("val100percent"));
    static final VarHandle val170percent$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("val170percent"));
    static final VarHandle MakerNoteKodak8a$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("MakerNoteKodak8a"));
    static final VarHandle ISOCalibrationGain$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("ISOCalibrationGain"));
    static final VarHandle AnalogISO$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("AnalogISO"));

    public static MemoryLayout $LAYOUT() {
        return libraw_kodak_makernotes_t.$struct$LAYOUT;
    }

    public static VarHandle BlackLevelTop$VH() {
        return libraw_kodak_makernotes_t.BlackLevelTop$VH;
    }

    public static short BlackLevelTop$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.BlackLevelTop$VH.get(seg);
    }

    public static void BlackLevelTop$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.BlackLevelTop$VH.set(seg, x);
    }

    public static short BlackLevelTop$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.BlackLevelTop$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void BlackLevelTop$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.BlackLevelTop$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle BlackLevelBottom$VH() {
        return libraw_kodak_makernotes_t.BlackLevelBottom$VH;
    }

    public static short BlackLevelBottom$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.BlackLevelBottom$VH.get(seg);
    }

    public static void BlackLevelBottom$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.BlackLevelBottom$VH.set(seg, x);
    }

    public static short BlackLevelBottom$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.BlackLevelBottom$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void BlackLevelBottom$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.BlackLevelBottom$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle offset_left$VH() {
        return libraw_kodak_makernotes_t.offset_left$VH;
    }

    public static short offset_left$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.offset_left$VH.get(seg);
    }

    public static void offset_left$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.offset_left$VH.set(seg, x);
    }

    public static short offset_left$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.offset_left$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void offset_left$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.offset_left$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle offset_top$VH() {
        return libraw_kodak_makernotes_t.offset_top$VH;
    }

    public static short offset_top$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.offset_top$VH.get(seg);
    }

    public static void offset_top$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.offset_top$VH.set(seg, x);
    }

    public static short offset_top$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.offset_top$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void offset_top$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.offset_top$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle clipBlack$VH() {
        return libraw_kodak_makernotes_t.clipBlack$VH;
    }

    public static short clipBlack$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.clipBlack$VH.get(seg);
    }

    public static void clipBlack$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.clipBlack$VH.set(seg, x);
    }

    public static short clipBlack$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.clipBlack$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void clipBlack$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.clipBlack$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle clipWhite$VH() {
        return libraw_kodak_makernotes_t.clipWhite$VH;
    }

    public static short clipWhite$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.clipWhite$VH.get(seg);
    }

    public static void clipWhite$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.clipWhite$VH.set(seg, x);
    }

    public static short clipWhite$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.clipWhite$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void clipWhite$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.clipWhite$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment romm_camDaylight$slice(MemorySegment seg) {
        return seg.asSlice(12, 36);
    }

    public static MemorySegment romm_camTungsten$slice(MemorySegment seg) {
        return seg.asSlice(48, 36);
    }

    public static MemorySegment romm_camFluorescent$slice(MemorySegment seg) {
        return seg.asSlice(84, 36);
    }

    public static MemorySegment romm_camFlash$slice(MemorySegment seg) {
        return seg.asSlice(120, 36);
    }

    public static MemorySegment romm_camCustom$slice(MemorySegment seg) {
        return seg.asSlice(156, 36);
    }

    public static MemorySegment romm_camAuto$slice(MemorySegment seg) {
        return seg.asSlice(192, 36);
    }

    public static VarHandle val018percent$VH() {
        return libraw_kodak_makernotes_t.val018percent$VH;
    }

    public static short val018percent$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.val018percent$VH.get(seg);
    }

    public static void val018percent$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.val018percent$VH.set(seg, x);
    }

    public static short val018percent$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.val018percent$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void val018percent$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.val018percent$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle val100percent$VH() {
        return libraw_kodak_makernotes_t.val100percent$VH;
    }

    public static short val100percent$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.val100percent$VH.get(seg);
    }

    public static void val100percent$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.val100percent$VH.set(seg, x);
    }

    public static short val100percent$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.val100percent$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void val100percent$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.val100percent$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle val170percent$VH() {
        return libraw_kodak_makernotes_t.val170percent$VH;
    }

    public static short val170percent$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.val170percent$VH.get(seg);
    }

    public static void val170percent$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.val170percent$VH.set(seg, x);
    }

    public static short val170percent$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.val170percent$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void val170percent$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.val170percent$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle MakerNoteKodak8a$VH() {
        return libraw_kodak_makernotes_t.MakerNoteKodak8a$VH;
    }

    public static short MakerNoteKodak8a$get(MemorySegment seg) {
        return (short) libraw_kodak_makernotes_t.MakerNoteKodak8a$VH.get(seg);
    }

    public static void MakerNoteKodak8a$set(MemorySegment seg, short x) {
        libraw_kodak_makernotes_t.MakerNoteKodak8a$VH.set(seg, x);
    }

    public static short MakerNoteKodak8a$get(MemorySegment seg, long index) {
        return (short) libraw_kodak_makernotes_t.MakerNoteKodak8a$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void MakerNoteKodak8a$set(MemorySegment seg, long index, short x) {
        libraw_kodak_makernotes_t.MakerNoteKodak8a$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle ISOCalibrationGain$VH() {
        return libraw_kodak_makernotes_t.ISOCalibrationGain$VH;
    }

    public static float ISOCalibrationGain$get(MemorySegment seg) {
        return (float) libraw_kodak_makernotes_t.ISOCalibrationGain$VH.get(seg);
    }

    public static void ISOCalibrationGain$set(MemorySegment seg, float x) {
        libraw_kodak_makernotes_t.ISOCalibrationGain$VH.set(seg, x);
    }

    public static float ISOCalibrationGain$get(MemorySegment seg, long index) {
        return (float) libraw_kodak_makernotes_t.ISOCalibrationGain$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ISOCalibrationGain$set(MemorySegment seg, long index, float x) {
        libraw_kodak_makernotes_t.ISOCalibrationGain$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle AnalogISO$VH() {
        return libraw_kodak_makernotes_t.AnalogISO$VH;
    }

    public static float AnalogISO$get(MemorySegment seg) {
        return (float) libraw_kodak_makernotes_t.AnalogISO$VH.get(seg);
    }

    public static void AnalogISO$set(MemorySegment seg, float x) {
        libraw_kodak_makernotes_t.AnalogISO$VH.set(seg, x);
    }

    public static float AnalogISO$get(MemorySegment seg, long index) {
        return (float) libraw_kodak_makernotes_t.AnalogISO$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void AnalogISO$set(MemorySegment seg, long index, float x) {
        libraw_kodak_makernotes_t.AnalogISO$VH.set(seg.asSlice(index * sizeof()), x);
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


