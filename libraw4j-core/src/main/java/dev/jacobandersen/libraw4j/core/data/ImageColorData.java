package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since
 */
public class ImageColorData {
    private final short[] toneCurve;
    private final int black;
    private final int[] perChannelBlack;
    private final int dataMaxPixelValue;
    private final int maxPixelValue;
    private final long[] perChannelLinearMax;
    private final float maxFloatPixelValue;
    private final float floatNormalizationCoefficient;
    private final short[][] whites;
    private final float[][] rgb2xyz;
    private final float[] asShotWhiteBalance;
    private final float[] daylightWhiteBalance;
    private final float[][] colorMatrix;
    private final float[][] camera2srgb;
    private final float[][] colorCorrectionMatrix;
    private final float flashUsed;
    private final float canonEv;
    private final int[] blackLevelStats;
    // TODO: libraw_dng_color_t[2] -- color data from dng?
    // TODO: libraw_dng_levels_t -- dng levels?
    private final int[][] whiteBalanceCoefficients;
    private final float[][] whiteBalanceColorTemperatureCoefficients;
    private final int asShotWbApplied;
    private final int exifColorSpace;

    private ImageColorData(short[] toneCurve, int black, int[] perChannelBlack, int dataMaxPixelValue, int maxPixelValue, long[] perChannelLinearMax, float maxFloatPixelValue, float floatNormalizationCoefficient, short[][] whites, float[][] rgb2xyz, float[] asShotWhiteBalance, float[] daylightWhiteBalance, float[][] colorMatrix, float[][] camera2srgb, float[][] colorCorrectionMatrix, float flashUsed, float canonEv, int[] blackLevelStats, int[][] whiteBalanceCoefficients, float[][] whiteBalanceColorTemperatureCoefficients, int asShotWbApplied, int exifColorSpace) {
        this.toneCurve = toneCurve;
        this.black = black;
        this.perChannelBlack = perChannelBlack;
        this.dataMaxPixelValue = dataMaxPixelValue;
        this.maxPixelValue = maxPixelValue;
        this.perChannelLinearMax = perChannelLinearMax;
        this.maxFloatPixelValue = maxFloatPixelValue;
        this.floatNormalizationCoefficient = floatNormalizationCoefficient;
        this.whites = whites;
        this.rgb2xyz = rgb2xyz;
        this.asShotWhiteBalance = asShotWhiteBalance;
        this.daylightWhiteBalance = daylightWhiteBalance;
        this.colorMatrix = colorMatrix;
        this.camera2srgb = camera2srgb;
        this.colorCorrectionMatrix = colorCorrectionMatrix;
        this.flashUsed = flashUsed;
        this.canonEv = canonEv;
        this.blackLevelStats = blackLevelStats;
        this.whiteBalanceCoefficients = whiteBalanceCoefficients;
        this.whiteBalanceColorTemperatureCoefficients = whiteBalanceColorTemperatureCoefficients;
        this.asShotWbApplied = asShotWbApplied;
        this.exifColorSpace = exifColorSpace;
    }

    static ImageColorData load() {

        // TODO: implement
        return null;
    }
}
