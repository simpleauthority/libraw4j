package dev.jacobandersen.libraw4j.core.data.component.image.subcomponents;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import org.libraw.libraw_colordata_t;
import org.libraw.libraw_data_t;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_SHORT;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ImageColorData(short[] toneCurve, int[] perChannelBlack, int black, int dataMaxPixelValue,
                             int maxPixelValue, long[] perChannelLinearMax, float maxFloatPixelValue,
                             float floatNormalizationCoefficient, short[][] whites, float[] asShotWhiteBalance,
                             float[] daylightWhiteBalance, float[][] colorMatrix, float[][] colorCorrectionMatrix,
                             float[][] camera2srgb, float[][] rgb2xyz, float flashUsed, float canonEv,
                             int[] blackLevelStats, int[][] whiteBalanceCoefficients,
                             float[][] whiteBalanceColorTemperatureCoefficients, int asShotWbApplied, int exifColorSpace) {
    public static ImageColorData load(MemoryAddress libraw, ResourceScope scope) {
        MemorySegment data = libraw_data_t.color$slice(libraw_data_t.ofAddress(libraw, scope));

        short[] toneCurve = libraw_colordata_t.curve$slice(data).toShortArray();
        int[] perChannelBlack = libraw_colordata_t.cblack$slice(data).toIntArray();
        int black = libraw_colordata_t.black$get(data);
        int dataMaxPixelValue = libraw_colordata_t.data_maximum$get(data);
        int maxPixelValue = libraw_colordata_t.maximum$get(data);
        long[] perChannelLinearMax = libraw_colordata_t.linear_max$slice(data).toLongArray();
        float maxFloatPixelValue = libraw_colordata_t.fmaximum$get(data);
        float floatNormalizationCoefficient = libraw_colordata_t.fnorm$get(data);
        short[][] whites = libraw_colordata_t.white$slice(data).elements(MemoryLayout.sequenceLayout(8, C_SHORT)).map(MemorySegment::toShortArray).toArray(short[][]::new);
        float[] asShotWhiteBalance = libraw_colordata_t.cam_mul$slice(data).toFloatArray();
        float[] daylightWhiteBalance = libraw_colordata_t.pre_mul$slice(data).toFloatArray();
        float[][] colorMatrix = libraw_colordata_t.cmatrix$slice(data).elements(MemoryLayout.sequenceLayout(4, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float[][] colorCorrectionMatrix = libraw_colordata_t.ccm$slice(data).elements(MemoryLayout.sequenceLayout(4, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float[][] camera2srgb = libraw_colordata_t.rgb_cam$slice(data).elements(MemoryLayout.sequenceLayout(4, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float[][] rgb2xyz = libraw_colordata_t.cam_xyz$slice(data).elements(MemoryLayout.sequenceLayout(3, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        float flashUsed = libraw_colordata_t.flash_used$get(data);
        float canonEv = libraw_colordata_t.canon_ev$get(data);
        int[] blackLevelStats = libraw_colordata_t.black_stat$slice(data).toIntArray();
        int[][] whiteBalanceCoefficients = libraw_colordata_t.WB_Coeffs$slice(data).elements(MemoryLayout.sequenceLayout(4, C_INT)).map(MemorySegment::toIntArray).toArray(int[][]::new);
        float[][] whiteBalanceColorTemperatureCoefficients = libraw_colordata_t.WBCT_Coeffs$slice(data).elements(MemoryLayout.sequenceLayout(5, C_FLOAT)).map(MemorySegment::toFloatArray).toArray(float[][]::new);
        int asShotWbApplied = libraw_colordata_t.as_shot_wb_applied$get(data);
        int exifColorSpace = libraw_colordata_t.ExifColorSpace$get(data);

        return new ImageColorData(
                toneCurve, perChannelBlack, black, dataMaxPixelValue, maxPixelValue, perChannelLinearMax,
                maxFloatPixelValue, floatNormalizationCoefficient, whites, asShotWhiteBalance, daylightWhiteBalance,
                colorMatrix, colorCorrectionMatrix, camera2srgb, rgb2xyz, flashUsed, canonEv, blackLevelStats,
                whiteBalanceCoefficients, whiteBalanceColorTemperatureCoefficients, asShotWbApplied, exifColorSpace
        );
    }
}
