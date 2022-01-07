package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_canon_makernotes_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record CanonMetadata(int colorDataVersion, int colorDataSubVersion, int specularWhiteLevel, int normalWhiteLevel,
                            int[] channelBlackLevel, int averageBlackLevel, int[] multishot, short meteringMode,
                            short spotMeteringMode,
                            byte flashMeteringMode, short flashExposureLock, short exposureMode,
                            short autoexposureSetting,
                            byte highlightTonePriority, short imageStabilization, short focusMode, short autofocusPoint,
                            short focusContinuous, short autofocusPointsInFocus30D, char[] autofocusPointsInFocus1D,
                            short autofocusPointsInFocus5D, short autofocusAreaMode, short numberOfAutofocusPoints,
                            short validAutofocusPoints, short autofocusImageWidth, short autofocusImageHeight,
                            short[] autofocusAreaWidths, short[] autofocusAreaHeights, short[] autofocusAreaXPositions,
                            short[] autofocusAreaYPositions, short[] autofocusPointsInFocus,
                            short[] autofocusPointsSelected,
                            short primaryAutofocusPoint, short flashMode, short flashActivity, short flashBits,
                            short manualFlashOutput, short flashOutput, short flashGuideNumber, short continuousDrive,
                            short sensorWidth, short sensorHeight, short sensorLeftBorder, short sensorTopBorder,
                            short sensorRightBorder, short sensorBottomBorder, short blackMaskLeftBorder,
                            short blackMaskTopBorder,
                            short blackMaskRightBorder, short blackMaskBottomBorder, int autofocusMicroadjustmentMode,
                            float autofocusMicroadjustmentValue, short makernotesFlip, short recordMode,
                            short srawQuality) {

    /**
     * Load the Canon makernotes from the given memory segment.
     *
     * @param data the Canon makernotes memory segment
     * @return the Canon makernotes
     */
    public static CanonMetadata load(MemorySegment data) {
        int colorDataVersion = libraw_canon_makernotes_t.ColorDataVer$get(data);
        int colorDataSubVersion = libraw_canon_makernotes_t.ColorDataSubVer$get(data);
        int specularWhiteLevel = libraw_canon_makernotes_t.SpecularWhiteLevel$get(data);
        int normalWhiteLevel = libraw_canon_makernotes_t.NormalWhiteLevel$get(data);
        int[] channelBlackLevel = libraw_canon_makernotes_t.ChannelBlackLevel$slice(data).toIntArray();
        int averageBlackLevel = libraw_canon_makernotes_t.AverageBlackLevel$get(data);
        int[] multishot = libraw_canon_makernotes_t.multishot$slice(data).toIntArray();
        short meteringMode = libraw_canon_makernotes_t.MeteringMode$get(data);
        short spotMeteringMode = libraw_canon_makernotes_t.SpotMeteringMode$get(data);
        byte flashMeteringMode = libraw_canon_makernotes_t.FlashMeteringMode$get(data);
        short flashExposureLock = libraw_canon_makernotes_t.FlashExposureLock$get(data);
        short exposureMode = libraw_canon_makernotes_t.ExposureMode$get(data);
        short autoexposureSetting = libraw_canon_makernotes_t.AESetting$get(data);
        byte highlightTonePriority = libraw_canon_makernotes_t.HighlightTonePriority$get(data);
        short imageStabilization = libraw_canon_makernotes_t.ImageStabilization$get(data);
        short focusMode = libraw_canon_makernotes_t.FocusMode$get(data);
        short autofocusPoint = libraw_canon_makernotes_t.AFPoint$get(data);
        short focusContinuous = libraw_canon_makernotes_t.FocusContinuous$get(data);
        short autofocusPointsInFocus30D = libraw_canon_makernotes_t.AFPointsInFocus30D$get(data);
        char[] autofocusPointsInFocus1D = libraw_canon_makernotes_t.AFPointsInFocus1D$slice(data).toCharArray();
        short autofocusPointsInFocus5D = libraw_canon_makernotes_t.AFPointsInFocus5D$get(data);
        short autofocusAreaMode = libraw_canon_makernotes_t.AFAreaMode$get(data);
        short numberOfAutofocusPoints = libraw_canon_makernotes_t.NumAFPoints$get(data);
        short validAutofocusPoints = libraw_canon_makernotes_t.ValidAFPoints$get(data);
        short autofocusImageWidth = libraw_canon_makernotes_t.AFImageWidth$get(data);
        short autofocusImageHeight = libraw_canon_makernotes_t.AFImageHeight$get(data);
        short[] autofocusAreaWidths = libraw_canon_makernotes_t.AFAreaWidths$slice(data).toShortArray();
        short[] autofocusAreaHeights = libraw_canon_makernotes_t.AFAreaHeights$slice(data).toShortArray();
        short[] autofocusAreaXPositions = libraw_canon_makernotes_t.AFAreaXPositions$slice(data).toShortArray();
        short[] autofocusAreaYPositions = libraw_canon_makernotes_t.AFAreaYPositions$slice(data).toShortArray();
        short[] autofocusPointsInFocus = libraw_canon_makernotes_t.AFPointsInFocus$slice(data).toShortArray();
        short[] autofocusPointsSelected = libraw_canon_makernotes_t.AFPointsSelected$slice(data).toShortArray();
        short primaryAFPoint = libraw_canon_makernotes_t.PrimaryAFPoint$get(data);
        short flashMode = libraw_canon_makernotes_t.FlashMode$get(data);
        short flashActivity = libraw_canon_makernotes_t.FlashActivity$get(data);
        short flashBits = libraw_canon_makernotes_t.FlashBits$get(data);
        short manualFlashOutput = libraw_canon_makernotes_t.ManualFlashOutput$get(data);
        short flashOutput = libraw_canon_makernotes_t.FlashOutput$get(data);
        short flashGuideNumber = libraw_canon_makernotes_t.FlashGuideNumber$get(data);
        short continuousDrive = libraw_canon_makernotes_t.ContinuousDrive$get(data);
        short sensorWidth = libraw_canon_makernotes_t.SensorWidth$get(data);
        short sensorHeight = libraw_canon_makernotes_t.SensorHeight$get(data);
        short sensorLeftBorder = libraw_canon_makernotes_t.SensorLeftBorder$get(data);
        short sensorTopBorder = libraw_canon_makernotes_t.SensorTopBorder$get(data);
        short sensorRightBorder = libraw_canon_makernotes_t.SensorRightBorder$get(data);
        short sensorBottomBorder = libraw_canon_makernotes_t.SensorBottomBorder$get(data);
        short blackMaskLeftBorder = libraw_canon_makernotes_t.BlackMaskLeftBorder$get(data);
        short blackMaskTopBorder = libraw_canon_makernotes_t.BlackMaskTopBorder$get(data);
        short blackMaskRightBorder = libraw_canon_makernotes_t.BlackMaskRightBorder$get(data);
        short blackMaskBottomBorder = libraw_canon_makernotes_t.BlackMaskBottomBorder$get(data);
        int autofocusMicroadjustmentMode = libraw_canon_makernotes_t.AFMicroAdjMode$get(data);
        float autofocusMicroadjustmentValue = libraw_canon_makernotes_t.AFMicroAdjValue$get(data);
        short makernotesFlip = libraw_canon_makernotes_t.MakernotesFlip$get(data);
        short recordMode = libraw_canon_makernotes_t.RecordMode$get(data);
        short srawQuality = libraw_canon_makernotes_t.SRAWQuality$get(data);

        return new CanonMetadata(colorDataVersion, colorDataSubVersion, specularWhiteLevel, normalWhiteLevel,
                channelBlackLevel, averageBlackLevel, multishot, meteringMode, spotMeteringMode, flashMeteringMode,
                flashExposureLock, exposureMode, autoexposureSetting, highlightTonePriority, imageStabilization,
                focusMode, autofocusPoint, focusContinuous, autofocusPointsInFocus30D, autofocusPointsInFocus1D,
                autofocusPointsInFocus5D, autofocusAreaMode, numberOfAutofocusPoints, validAutofocusPoints,
                autofocusImageWidth, autofocusImageHeight, autofocusAreaWidths, autofocusAreaHeights,
                autofocusAreaXPositions, autofocusAreaYPositions, autofocusPointsInFocus, autofocusPointsSelected,
                primaryAFPoint, flashMode, flashActivity, flashBits, manualFlashOutput, flashOutput, flashGuideNumber,
                continuousDrive, sensorWidth, sensorHeight, sensorLeftBorder, sensorTopBorder, sensorRightBorder,
                sensorBottomBorder, blackMaskLeftBorder, blackMaskTopBorder, blackMaskRightBorder, blackMaskBottomBorder,
                autofocusMicroadjustmentMode, autofocusMicroadjustmentValue, makernotesFlip, recordMode, srawQuality);
    }
}
