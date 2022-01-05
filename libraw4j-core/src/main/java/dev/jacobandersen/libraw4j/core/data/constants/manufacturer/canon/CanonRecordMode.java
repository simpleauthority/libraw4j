package dev.jacobandersen.libraw4j.core.data.constants.manufacturer.canon;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum CanonRecordMode {
    UNDEFINED(0),
    JPEG(1),
    CRW_THM(2),
    AVI_THM(3),
    TIF(4),
    TIF_JPEG(5),
    CR2(6),
    CR2_JPEG(7),
    UNKNOWN(8),
    MOV(9),
    MP4(10),
    CRM(11),
    CR3(12),
    CR3_JPEG(13),
    HEIF(14),
    CR3_HEIF(15);

    private final int value;

    CanonRecordMode(int value) {
        this.value = value;
    }

    public static CanonRecordMode fromValue(int value) {
        for (CanonRecordMode mode : values()) {
            if (mode.value == value) {
                return mode;
            }
        }

        throw new IllegalArgumentException("No CanonRecordMode with value " + value);
    }
}
