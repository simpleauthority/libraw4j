package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_nikon_makernotes_t;
import org.libraw.libraw_sensor_highspeed_crop_t;
import org.tinylog.Logger;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record NikonMetadata(double exposureBracketValue, short activeDynamicLighting, short shootingMode,
                            byte[] imageStabilization, byte vibrationReduction, byte virtualRealityMode,
                            String focusMode, byte autofocusPoint, short autofocusPointsInFocus,
                            byte contrastDetectAutofocus, byte autofocusAreaMode, byte phaseDetectAutofocus,
                            byte primaryAutofocusPoint, byte[] autofocusPointsUsed, short autofocusImageWidth,
                            short autofocusImageHeight, short autofocusAreaXPosition, short autofocusAreaYPosition,
                            short autofocusAreaWidth, short autofocusAreaHeight, byte contrastDetectAutofocusInFocus,
                            String flashSetting, String flashType, byte[] flashExposureCompensation,
                            byte[] externalFlashExposureCompensation, byte[] flashExposureBracketValue, byte flashMode,
                            byte flashExposureCompensation2, byte flashExposureCompensation3,
                            byte flashExposureCompensation4,
                            byte flashSource, byte[] flashFirmware, byte externalFlashFlags,
                            byte flashControlCommanderMode,
                            byte flashOutputAndCompensation, byte flashFocalLength, byte flashGuideNumberDistance,
                            byte[] flashGroupControlMode, byte[] flashGroupOutputAndCompensation, byte flashColorFilter,
                            short nefCompression, int exposureMode, int exposureProgram, int nMEShots, int meGainOn,
                            double[] meWhiteBalance, byte autofocusFineTune, byte autofocusFineTuneIndex,
                            int autofocusFineTuneAdjustment, int lensDataVersion, int flashInfoVersion,
                            int colorBalanceVersion, byte key, short[] nefBitDepth, short rawHighSpeedCropFormat,
                            NikonHighSpeedCropFormat highSpeedCropFormat, short highSpeedCropLeft,
                            short highSpeedCropTop,
                            short highSpeedCropWidth, short highSpeedCropHeight, short sensorWidth,
                            short sensorHeight) {
    /**
     * Load the Nikon makernotes from the given memory segment.
     *
     * @param data the Nikon makernotes memory segment
     * @return the Nikon makernotes
     */
    public static NikonMetadata load(MemorySegment data) {
        double exposureBracketValue = libraw_nikon_makernotes_t.ExposureBracketValue$get(data);
        short activeDynamicLighting = libraw_nikon_makernotes_t.ActiveDLighting$get(data);
        short shootingMode = libraw_nikon_makernotes_t.ShootingMode$get(data);
        byte[] imageStabilization = libraw_nikon_makernotes_t.ImageStabilization$slice(data).toByteArray();
        byte vibrationReduction = libraw_nikon_makernotes_t.VibrationReduction$get(data);
        byte virtualRealityMode = libraw_nikon_makernotes_t.VRMode$get(data);
        String focusMode = StringUtil.readNullTerminatedString(libraw_nikon_makernotes_t.FocusMode$slice(data).toByteArray());
        byte autofocusPoint = libraw_nikon_makernotes_t.AFPoint$get(data);
        short autofocusPointsInFocus = libraw_nikon_makernotes_t.AFPointsInFocus$get(data);
        byte contrastDetectAutofocus = libraw_nikon_makernotes_t.ContrastDetectAF$get(data);
        byte autofocusAreaMode = libraw_nikon_makernotes_t.AFAreaMode$get(data);
        byte phaseDetectAutofocus = libraw_nikon_makernotes_t.PhaseDetectAF$get(data);
        byte primaryAutofocusPoint = libraw_nikon_makernotes_t.PrimaryAFPoint$get(data);
        byte[] autofocusPointsUsed = libraw_nikon_makernotes_t.AFPointsUsed$slice(data).toByteArray();
        short autofocusImageWidth = libraw_nikon_makernotes_t.AFImageWidth$get(data);
        short autofocusImageHeight = libraw_nikon_makernotes_t.AFImageHeight$get(data);
        short autofocusAreaXPosition = libraw_nikon_makernotes_t.AFAreaXPposition$get(data);
        short autofocusAreaYPosition = libraw_nikon_makernotes_t.AFAreaYPosition$get(data);
        short autofocusAreaWidth = libraw_nikon_makernotes_t.AFAreaWidth$get(data);
        short autofocusAreaHeight = libraw_nikon_makernotes_t.AFAreaHeight$get(data);
        byte contrastDetectAutofocusInFocus = libraw_nikon_makernotes_t.ContrastDetectAFInFocus$get(data);
        String flashSetting = StringUtil.readNullTerminatedString(libraw_nikon_makernotes_t.FlashSetting$slice(data).toByteArray());
        String flashType = StringUtil.readNullTerminatedString(libraw_nikon_makernotes_t.FlashType$slice(data).toByteArray());
        byte[] flashExposureCompensation = libraw_nikon_makernotes_t.FlashExposureCompensation$slice(data).toByteArray();
        byte[] externalFlashExposureCompensation = libraw_nikon_makernotes_t.ExternalFlashExposureComp$slice(data).toByteArray();
        byte[] flashExposureBracketValue = libraw_nikon_makernotes_t.FlashExposureBracketValue$slice(data).toByteArray();
        byte flashMode = libraw_nikon_makernotes_t.FlashMode$get(data);
        byte flashExposureCompensation2 = libraw_nikon_makernotes_t.FlashExposureCompensation2$get(data);
        byte flashExposureCompensation3 = libraw_nikon_makernotes_t.FlashExposureCompensation3$get(data);
        byte flashExposureCompensation4 = libraw_nikon_makernotes_t.FlashExposureCompensation4$get(data);
        byte flashSource = libraw_nikon_makernotes_t.FlashSource$get(data);
        byte[] flashFirmware = libraw_nikon_makernotes_t.FlashFirmware$slice(data).toByteArray();
        byte externalFlashFlags = libraw_nikon_makernotes_t.ExternalFlashFlags$get(data);
        byte flashControlCommanderMode = libraw_nikon_makernotes_t.FlashControlCommanderMode$get(data);
        byte flashOutputAndCompensation = libraw_nikon_makernotes_t.FlashOutputAndCompensation$get(data);
        byte flashFocalLength = libraw_nikon_makernotes_t.FlashFocalLength$get(data);
        byte flashGuideNumberDistance = libraw_nikon_makernotes_t.FlashGNDistance$get(data);
        byte[] flashGroupControlMode = libraw_nikon_makernotes_t.FlashGroupControlMode$slice(data).toByteArray();
        byte[] flashGroupOutputAndCompensation = libraw_nikon_makernotes_t.FlashGroupOutputAndCompensation$slice(data).toByteArray();
        byte flashColorFilter = libraw_nikon_makernotes_t.FlashColorFilter$get(data);
        short nefCompression = libraw_nikon_makernotes_t.NEFCompression$get(data);
        int exposureMode = libraw_nikon_makernotes_t.ExposureMode$get(data);
        int exposureProgram = libraw_nikon_makernotes_t.ExposureProgram$get(data);
        int nMEShots = libraw_nikon_makernotes_t.nMEshots$get(data);
        int meGainOn = libraw_nikon_makernotes_t.MEgainOn$get(data);
        double[] meWhiteBalance = libraw_nikon_makernotes_t.ME_WB$slice(data).toDoubleArray();
        byte autofocusFineTune = libraw_nikon_makernotes_t.AFFineTune$get(data);
        byte autofocusFineTuneIndex = libraw_nikon_makernotes_t.AFFineTuneIndex$get(data);
        int autofocusFineTuneAdjustment = libraw_nikon_makernotes_t.AFFineTuneAdj$get(data);
        int lensDataVersion = libraw_nikon_makernotes_t.LensDataVersion$get(data);
        int flashInfoVersion = libraw_nikon_makernotes_t.FlashInfoVersion$get(data);
        int colorBalanceVersion = libraw_nikon_makernotes_t.ColorBalanceVersion$get(data);
        byte key = libraw_nikon_makernotes_t.key$get(data);
        short[] nefBitDepth = libraw_nikon_makernotes_t.NEFBitDepth$slice(data).toShortArray();
        short rawHighSpeedCropFormat = libraw_nikon_makernotes_t.HighSpeedCropFormat$get(data);
        NikonHighSpeedCropFormat highSpeedCropFormat = NikonHighSpeedCropFormat.fromCode(rawHighSpeedCropFormat);
        MemorySegment sensorHighSpeedCrop = libraw_nikon_makernotes_t.SensorHighSpeedCrop$slice(data);
        short highSpeedCropLeft = libraw_sensor_highspeed_crop_t.cleft$get(sensorHighSpeedCrop);
        short highSpeedCropTop = libraw_sensor_highspeed_crop_t.ctop$get(sensorHighSpeedCrop);
        short highSpeedCropWidth = libraw_sensor_highspeed_crop_t.cwidth$get(sensorHighSpeedCrop);
        short highSpeedCropHeight = libraw_sensor_highspeed_crop_t.cheight$get(sensorHighSpeedCrop);
        short sensorWidth = libraw_nikon_makernotes_t.SensorWidth$get(data);
        short sensorHeight = libraw_nikon_makernotes_t.SensorHeight$get(data);

        return new NikonMetadata(exposureBracketValue, activeDynamicLighting, shootingMode, imageStabilization,
                vibrationReduction, virtualRealityMode, focusMode, autofocusPoint, autofocusPointsInFocus,
                contrastDetectAutofocus, autofocusAreaMode, phaseDetectAutofocus, primaryAutofocusPoint,
                autofocusPointsUsed, autofocusImageWidth, autofocusImageHeight, autofocusAreaXPosition,
                autofocusAreaYPosition, autofocusAreaWidth, autofocusAreaHeight, contrastDetectAutofocusInFocus,
                flashSetting, flashType, flashExposureCompensation, externalFlashExposureCompensation,
                flashExposureBracketValue, flashMode, flashExposureCompensation2, flashExposureCompensation3,
                flashExposureCompensation4, flashSource, flashFirmware, externalFlashFlags, flashControlCommanderMode,
                flashOutputAndCompensation, flashFocalLength, flashGuideNumberDistance, flashGroupControlMode,
                flashGroupOutputAndCompensation, flashColorFilter, nefCompression, exposureMode, exposureProgram,
                nMEShots, meGainOn, meWhiteBalance, autofocusFineTune, autofocusFineTuneIndex,
                autofocusFineTuneAdjustment, lensDataVersion, flashInfoVersion, colorBalanceVersion, key,
                nefBitDepth, rawHighSpeedCropFormat, highSpeedCropFormat, highSpeedCropLeft, highSpeedCropTop,
                highSpeedCropWidth, highSpeedCropHeight, sensorWidth, sensorHeight);

    }

    public enum NikonHighSpeedCropFormat {
        X13(1, "1.3x"),
        DX(2, "DX"),
        FIVE_TO_FOUR(3, "5:4"),
        THREE_TO_TWO(4, "3:2"),
        SIXTEEN_TO_NINE(6, "16:9"),
        FX_UNCROPPED(11, "FX uncropped"),
        DX_UNCROPPED(12, "DX uncropped"),
        ONE_TO_ONE(17, "1:1"),
        UNKNOWN(-1, "Unknown");

        private final int code;
        private final String name;

        NikonHighSpeedCropFormat(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static NikonHighSpeedCropFormat fromCode(int code) {
            for (NikonHighSpeedCropFormat format : NikonHighSpeedCropFormat.values()) {
                if (format.code == code) {
                    return format;
                }
            }

            Logger.warn("Unknown NikonHighSpeedCropFormat code: {}", code);
            return UNKNOWN;
        }
    }
}
