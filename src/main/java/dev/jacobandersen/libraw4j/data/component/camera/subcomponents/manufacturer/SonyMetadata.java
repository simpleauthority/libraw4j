package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_sony_info_t;
import org.tinylog.Logger;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record SonyMetadata(short cameraType, byte sony0x9400Version, byte sony0x9400ReleaseMode2,
                           int sony0x9400SequenceImageNumber, byte sony0x9400SequenceLength1,
                           int sony0x9400SequenceFileNumber,
                           byte sony0x9400SequenceLength2, int autofocusAreaModeSetting, short[] flexibleSpotPosition,
                           int autofocusPointSelected, int[] autofocusPointsUsed, int autofocusTracking,
                           int autofocusType,
                           short[] focusLocation, int autofocusMicroadjustmentValue, int autofocusMicroadjustmentOn,
                           byte autofocusMicroadjustmentRegisteredLenses, short variableLowPassFilter,
                           int longExposureNoiseReduction, short highISONoiseReduction, short[] hdr,
                           short group2010, short realISOOffset, short meteringModeOffset, short exposureProgramOffset,
                           short releaseMode2Offset, int minoltaCamId, float firmware, short imageCount3Offset,
                           int imageCount3, int electronicFrontCurtainShutter, short meteringMode2, String sonyDateTime,
                           int shotNumberSincePowerUp, short pixelShiftGroupPrefix, int pixelShiftGroupId,
                           byte numberShotsInPixelShiftGroup,
                           int numberInPixelShiftGroup, short prdImageHeight, short prdImageWidth, short prdRawBitDepth,
                           short rawPrdStorageMethod, SonyPrdStorageMethod prdStorageMethod, short rawPrdBayerPattern,
                           short rawSonyRawFileType, SonySonyRawFileType sonySonyRawFileType, short rawRawFileType,
                           SonyRawFileType rawFileType, int rawQuality, SonyQuality quality, short rawFileFormat,
                           SonyFileFormat fileFormat) {

    /**
     * Load the Sony makernotes from the given memory segment.
     *
     * @param data the Sony makernotes memory segment
     * @return the Sony makernotes
     */
    public static SonyMetadata load(MemorySegment data) {
        short cameraType = libraw_sony_info_t.CameraType$get(data);
        byte sony0x9400Version = libraw_sony_info_t.Sony0x9400_version$get(data);
        byte sony0x9400ReleaseMode2 = libraw_sony_info_t.Sony0x9400_ReleaseMode2$get(data);
        int sony0x9400SequenceImageNumber = libraw_sony_info_t.Sony0x9400_SequenceImageNumber$get(data);
        byte sony0x9400SequenceLength1 = libraw_sony_info_t.Sony0x9400_SequenceLength1$get(data);
        int sony0x9400SequenceFileNumber = libraw_sony_info_t.Sony0x9400_SequenceFileNumber$get(data);
        byte sony0x9400SequenceLength2 = libraw_sony_info_t.Sony0x9400_SequenceLength2$get(data);
        int autofocusAreaModeSetting = libraw_sony_info_t.AFAreaModeSetting$get(data);
        short[] flexibleSpotPosition = libraw_sony_info_t.FlexibleSpotPosition$slice(data).toShortArray();
        int autofocusPointSelected = libraw_sony_info_t.AFPointSelected$get(data);
        int[] autofocusPointsUsed = libraw_sony_info_t.AFPointsUsed$slice(data).toIntArray();
        int autofocusTracking = libraw_sony_info_t.AFTracking$get(data);
        int autofocusType = libraw_sony_info_t.AFType$get(data);
        short[] focusLocation = libraw_sony_info_t.FocusLocation$slice(data).toShortArray();
        int autofocusMicroadjustmentValue = libraw_sony_info_t.AFMicroAdjValue$get(data);
        int autofocusMicroadjustmentOn = libraw_sony_info_t.AFMicroAdjOn$get(data);
        byte autofocusMicroadjustmentRegisteredLenses = libraw_sony_info_t.AFMicroAdjRegisteredLenses$get(data);
        short variableLowPassFilter = libraw_sony_info_t.VariableLowPassFilter$get(data);
        int longExposureNoiseReduction = libraw_sony_info_t.LongExposureNoiseReduction$get(data);
        short highISONoiseReduction = libraw_sony_info_t.HighISONoiseReduction$get(data);
        short[] hdr = libraw_sony_info_t.HDR$slice(data).toShortArray();
        short group2010 = libraw_sony_info_t.group2010$get(data);
        short realISOOffset = libraw_sony_info_t.real_iso_offset$get(data);
        short meteringModeOffset = libraw_sony_info_t.MeteringMode_offset$get(data);
        short exposureProgramOffset = libraw_sony_info_t.ExposureProgram_offset$get(data);
        short releaseMode2Offset = libraw_sony_info_t.ReleaseMode2_offset$get(data);
        int minoltaCamId = libraw_sony_info_t.MinoltaCamID$get(data);
        float firmware = libraw_sony_info_t.firmware$get(data);
        short imageCount3Offset = libraw_sony_info_t.ImageCount3_offset$get(data);
        int imageCount3 = libraw_sony_info_t.ImageCount3$get(data);
        int electronicFrontCurtainShutter = libraw_sony_info_t.ElectronicFrontCurtainShutter$get(data);
        short meteringMode2 = libraw_sony_info_t.MeteringMode2$get(data);
        String sonyDateTime = StringUtil.readNullTerminatedString(libraw_sony_info_t.SonyDateTime$slice(data).toByteArray());
        int shotNumberSincePowerUp = libraw_sony_info_t.ShotNumberSincePowerUp$get(data);
        short pixelShiftGroupPrefix = libraw_sony_info_t.PixelShiftGroupPrefix$get(data);
        int pixelShiftGroupId = libraw_sony_info_t.PixelShiftGroupID$get(data);
        byte numberOfShotsInPixelShiftGroup = libraw_sony_info_t.nShotsInPixelShiftGroup$get(data);
        byte numberInPixelShiftGroup = libraw_sony_info_t.numInPixelShiftGroup$get(data);
        short prdImageHeight = libraw_sony_info_t.prd_ImageHeight$get(data);
        short prdImageWidth = libraw_sony_info_t.prd_ImageWidth$get(data);
        short prdRawBitDepth = libraw_sony_info_t.prd_RawBitDepth$get(data);
        short rawPrdStorageMethod = libraw_sony_info_t.prd_StorageMethod$get(data);
        SonyPrdStorageMethod prdStorageMethod = SonyPrdStorageMethod.valueOf(rawPrdStorageMethod);
        short prdBayerPattern = libraw_sony_info_t.prd_BayerPattern$get(data);
        short rawSonyRawFileType = libraw_sony_info_t.SonyRawFileType$get(data);
        SonySonyRawFileType sonyRawFileType = SonySonyRawFileType.valueOf(rawSonyRawFileType);
        short rawRawFileType = libraw_sony_info_t.RAWFileType$get(data);
        SonyRawFileType rawFileType = SonyRawFileType.valueOf(rawRawFileType);
        int rawQuality = libraw_sony_info_t.Quality$get(data);
        SonyQuality quality = SonyQuality.fromValue(rawQuality);
        short rawFileFormat = libraw_sony_info_t.FileFormat$get(data);
        SonyFileFormat fileFormat = SonyFileFormat.fromValue(rawFileFormat);

        return new SonyMetadata(cameraType, sony0x9400Version, sony0x9400ReleaseMode2, sony0x9400SequenceImageNumber,
                sony0x9400SequenceLength1, sony0x9400SequenceFileNumber, sony0x9400SequenceLength2, autofocusAreaModeSetting,
                flexibleSpotPosition, autofocusPointSelected, autofocusPointsUsed, autofocusTracking, autofocusType,
                focusLocation, autofocusMicroadjustmentValue, autofocusMicroadjustmentOn, autofocusMicroadjustmentRegisteredLenses,
                variableLowPassFilter, longExposureNoiseReduction, highISONoiseReduction, hdr, group2010, realISOOffset,
                meteringModeOffset, exposureProgramOffset, releaseMode2Offset, minoltaCamId, firmware, imageCount3Offset,
                imageCount3, electronicFrontCurtainShutter, meteringMode2, sonyDateTime, shotNumberSincePowerUp, pixelShiftGroupPrefix,
                pixelShiftGroupId, numberOfShotsInPixelShiftGroup, numberInPixelShiftGroup, prdImageHeight, prdImageWidth, prdRawBitDepth,
                rawPrdStorageMethod, prdStorageMethod, prdBayerPattern, rawSonyRawFileType, sonyRawFileType, rawRawFileType,
                rawFileType, rawQuality, quality, rawFileFormat, fileFormat);
    }

    public enum SonyPrdStorageMethod {
        PADDED(82),
        LINEAR(89),
        UNKNOWN(-1);

        SonyPrdStorageMethod(int value) {
        }

        public static SonyPrdStorageMethod valueOf(int value) {
            return switch (value) {
                case 82 -> PADDED;
                case 89 -> LINEAR;
                default -> UNKNOWN;
            };
        }
    }

    public enum SonySonyRawFileType {
        UNCOMPRESSED_14_BIT(0),
        UNCOMPRESSED_12_BIT(1),
        COMPRESSED(2),
        LOSSLESS_COMPRESSED(3),
        UNKNOWN(-1);

        SonySonyRawFileType(int value) {
        }

        public static SonySonyRawFileType valueOf(int value) {
            return switch (value) {
                case 0 -> UNCOMPRESSED_14_BIT;
                case 1 -> UNCOMPRESSED_12_BIT;
                case 2 -> COMPRESSED;
                case 3 -> LOSSLESS_COMPRESSED;
                default -> UNKNOWN;
            };
        }
    }

    public enum SonyRawFileType {
        COMPRESSED(0),
        UNCOMPRESSED(1),
        UNKNOWN(-1);

        SonyRawFileType(int value) {
        }

        public static SonyRawFileType valueOf(int value) {
            return switch (value) {
                case 0 -> COMPRESSED;
                case 1 -> UNCOMPRESSED;
                default -> UNKNOWN;
            };
        }
    }

    public enum SonyQuality {
        RAW(0, 6),
        COMPRESSED_RAW(7, 8),
        UNKNOWN(-1);

        private final int[] values;

        SonyQuality(int... values) {
            this.values = values;
        }

        public static SonyQuality fromValue(int value) {
            for (SonyQuality quality : values()) {
                for (int v : quality.values) {
                    if (v == value) {
                        return quality;
                    }
                }
            }

            Logger.warn("Unknown quality value: " + value);
            return UNKNOWN;
        }
    }

    public enum SonyFileFormat {
        SR2(1000),
        ARW1(2000),
        ARW2(3000),
        ARW21(3100),
        ARW22(3200),
        ARW23(3300),
        ARW231(3310),
        ARW232(3320),
        ARW233(3330),
        ARW235(3350),
        UNKNOWN(-1);

        private final int value;

        SonyFileFormat(int value) {
            this.value = value;
        }

        public static SonyFileFormat fromValue(int value) {
            for (SonyFileFormat format : values()) {
                if (format.value == value) {
                    return format;
                }
            }

            Logger.warn("Unknown file format value: " + value);
            return UNKNOWN;
        }
    }
}
