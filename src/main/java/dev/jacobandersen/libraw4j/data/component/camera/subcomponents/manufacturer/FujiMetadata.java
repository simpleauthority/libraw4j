package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_fuji_info_t;
import org.tinylog.Logger;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record FujiMetadata(float exposureMidPointShift, short dynamicRange, short filmMode, short dynamicRangeSetting,
                           short developmentDynamicRange, short autoDynamicRange, short dynamicRangePriority,
                           short dynamicRangePriorityAuto, short dynamicRangePriorityFixed,
                           float brightnessCompensation,
                           short focusMode, short autofocusMode, short[] focusPixel, short[] imageStabilization,
                           short flashMode, short whiteBalancePreset, short rawShutterType, FujiShutterType shutterType,
                           short exrMode, short macro, int rating, short rawCropMode, FujiCropMode cropMode,
                           short frameRate,
                           short frameWidth, short frameHeight, String serialSignature, String rafVersion,
                           short rafDataVersion,
                           short rawDriveMode, FujiDriveMode driveMode) {

    /**
     * Loads the Fuji makernotes from the given memory segment.
     *
     * @param data the Fuji makernotes memory segment
     * @return the loaded Fuji makernotes
     */
    public static FujiMetadata load(MemorySegment data) {
        float exposureMidPointShift = libraw_fuji_info_t.ExpoMidPointShift$get(data);
        short dynamicRange = libraw_fuji_info_t.DynamicRange$get(data);
        short filmMode = libraw_fuji_info_t.FilmMode$get(data);
        short dynamicRangeSetting = libraw_fuji_info_t.DynamicRangeSetting$get(data);
        short developmentDynamicRange = libraw_fuji_info_t.DevelopmentDynamicRange$get(data);
        short autoDynamicRange = libraw_fuji_info_t.AutoDynamicRange$get(data);
        short dynamicRangePriority = libraw_fuji_info_t.DRangePriority$get(data);
        short dynamicRangePriorityAuto = libraw_fuji_info_t.DRangePriorityAuto$get(data);
        short dynamicRangePriorityFixed = libraw_fuji_info_t.DRangePriorityFixed$get(data);
        float brightnessCompensation = libraw_fuji_info_t.BrightnessCompensation$get(data);
        short focusMode = libraw_fuji_info_t.FocusMode$get(data);
        short autofocusMode = libraw_fuji_info_t.AFMode$get(data);
        short[] focusPixel = libraw_fuji_info_t.FocusPixel$slice(data).toShortArray();
        short[] imageStabilization = libraw_fuji_info_t.ImageStabilization$slice(data).toShortArray();
        short flashMode = libraw_fuji_info_t.FlashMode$get(data);
        short whiteBalancePreset = libraw_fuji_info_t.WB_Preset$get(data);
        short rawShutterType = libraw_fuji_info_t.ShutterType$get(data);
        FujiShutterType shutterType = FujiShutterType.fromValue(rawShutterType);
        short exrMode = libraw_fuji_info_t.ExrMode$get(data);
        short macro = libraw_fuji_info_t.Macro$get(data);
        int rating = libraw_fuji_info_t.Rating$get(data);
        short rawCropMode = libraw_fuji_info_t.CropMode$get(data);
        FujiCropMode cropMode = FujiCropMode.fromValue(rawCropMode);
        short frameRate = libraw_fuji_info_t.FrameRate$get(data);
        short frameWidth = libraw_fuji_info_t.FrameWidth$get(data);
        short frameHeight = libraw_fuji_info_t.FrameHeight$get(data);
        String serialSignature = StringUtil.readNullTerminatedString(libraw_fuji_info_t.SerialSignature$slice(data).toByteArray());
        String rafVersion = StringUtil.readNullTerminatedString(libraw_fuji_info_t.RAFVersion$slice(data).toByteArray());
        short rafDataVersion = libraw_fuji_info_t.RAFDataVersion$get(data);
        short rawDriveMode = libraw_fuji_info_t.DriveMode$get(data);
        FujiDriveMode driveMode = FujiDriveMode.fromValue(rawDriveMode);

        return new FujiMetadata(exposureMidPointShift, dynamicRange, filmMode, dynamicRangeSetting,
                developmentDynamicRange, autoDynamicRange, dynamicRangePriority, dynamicRangePriorityAuto,
                dynamicRangePriorityFixed, brightnessCompensation, focusMode, autofocusMode, focusPixel,
                imageStabilization, flashMode, whiteBalancePreset, rawShutterType, shutterType, exrMode, macro,
                rating, rawCropMode, cropMode, frameRate, frameWidth, frameHeight, serialSignature, rafVersion,
                rafDataVersion, rawDriveMode, driveMode);
    }

    public enum FujiShutterType {
        MECHANICAL(0, "Mechanical"),
        ELECTRONIC(1, "Electronic"),
        ELECTRONIC_LONG_SHUTTER(2, "Electronic, long shutter speed"),
        ELECTRONIC_FRONT_CURTAIN(3, "Electronic, front curtain");

        private final int value;
        private final String description;

        FujiShutterType(int value, String description) {
            this.value = value;
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public static FujiShutterType fromValue(int value) {
            for (FujiShutterType type : values()) {
                if (type.value == value) {
                    return type;
                }
            }

            Logger.warn("Unknown Fuji shutter type: {}", value);
            return null;
        }
    }

    public enum FujiCropMode {
        FF_GFX(1, "FF on GFX"),
        SPORTS_FINDER(2, "Sports Finder (Mechanical Shutter)"),
        X125(4, "1.25x crop (Electronic Shutter, continuous high)");

        private final int value;
        private final String description;

        FujiCropMode(int value, String description) {
            this.value = value;
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public static FujiCropMode fromValue(int value) {
            for (FujiCropMode mode : values()) {
                if (mode.value == value) {
                    return mode;
                }
            }

            Logger.warn("Unknown Fuji crop mode: {}", value);
            return null;
        }
    }

    public enum FujiDriveMode {
        SINGLE_FRAME(0, "Single frame"),
        CONTINUOUS_LOW(1, "Continuous low"),
        CONTINUOUS_HIGH(2, "Continuous high");

        private final int value;
        private final String description;

        FujiDriveMode(int value, String description) {
            this.value = value;
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public static FujiDriveMode fromValue(int value) {
            for (FujiDriveMode mode : values()) {
                if (mode.value == value) {
                    return mode;
                }
            }

            Logger.warn("Unknown Fuji drive mode: {}", value);
            return null;
        }
    }
}
