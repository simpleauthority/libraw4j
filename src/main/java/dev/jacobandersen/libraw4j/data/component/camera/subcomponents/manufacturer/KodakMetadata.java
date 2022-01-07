package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_kodak_makernotes_t;

import static jdk.incubator.foreign.CLinker.C_FLOAT;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record KodakMetadata(short blackLevelTop, short blackLevelBottom, short offsetLeft, short offsetTop,
                            short clipBlack, short clipWhite, float[][] rommCamDaylight, float[][] rommCamTungsten,
                            float[][] rommCamFluorescent, float[][] rommCamFlash, float[][] rommCamCustom,
                            float[][] rommCamAuto,
                            short val018Percent, short val100Percent, short val170Percent, short makerNoteKodak8a,
                            float isoCalibrationGain, float analogISO) {

    /**
     * Load the Kodak makernotes from the given memory segment.
     *
     * @param data the Kodak makernotes memory segment
     * @return the Kodak makernotes
     */
    public static KodakMetadata load(MemorySegment data) {
        short blackLevelTop = libraw_kodak_makernotes_t.BlackLevelTop$get(data);
        short blackLevelBottom = libraw_kodak_makernotes_t.BlackLevelBottom$get(data);
        short offsetLeft = libraw_kodak_makernotes_t.offset_left$get(data);
        short offsetTop = libraw_kodak_makernotes_t.offset_top$get(data);
        short clipBlack = libraw_kodak_makernotes_t.clipBlack$get(data);
        short clipWhite = libraw_kodak_makernotes_t.clipWhite$get(data);
        float[][] rommCamDaylight = libraw_kodak_makernotes_t.romm_camDaylight$slice(data).elements(MemoryLayout.sequenceLayout(3, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float[][] rommCamTungsten = libraw_kodak_makernotes_t.romm_camTungsten$slice(data).elements(MemoryLayout.sequenceLayout(3, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float[][] rommCamFluorescent = libraw_kodak_makernotes_t.romm_camFluorescent$slice(data).elements(MemoryLayout.sequenceLayout(3, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float[][] rommCamFlash = libraw_kodak_makernotes_t.romm_camFlash$slice(data).elements(MemoryLayout.sequenceLayout(3, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float[][] rommCamCustom = libraw_kodak_makernotes_t.romm_camCustom$slice(data).elements(MemoryLayout.sequenceLayout(3, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float[][] rommCamAuto = libraw_kodak_makernotes_t.romm_camAuto$slice(data).elements(MemoryLayout.sequenceLayout(3, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        short val018Percent = libraw_kodak_makernotes_t.val018percent$get(data);
        short val100Percent = libraw_kodak_makernotes_t.val100percent$get(data);
        short val170Percent = libraw_kodak_makernotes_t.val170percent$get(data);
        short makerNoteKodak8a = libraw_kodak_makernotes_t.MakerNoteKodak8a$get(data);
        float isoCalibrationGain = libraw_kodak_makernotes_t.ISOCalibrationGain$get(data);
        float analogISO = libraw_kodak_makernotes_t.AnalogISO$get(data);

        return new KodakMetadata(blackLevelTop, blackLevelBottom, offsetLeft, offsetTop, clipBlack, clipWhite,
                rommCamDaylight, rommCamTungsten, rommCamFluorescent, rommCamFlash, rommCamCustom, rommCamAuto,
                val018Percent, val100Percent, val170Percent, makerNoteKodak8a, isoCalibrationGain, analogISO);
    }

}
