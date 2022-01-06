package dev.jacobandersen.libraw4j.data.constants;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum ColorSpace {
    NOTFOUND(0),
    SRGB(1),
    ADOBE_RGB(2),
    WIDE_GAMUT_RGB(3),
    PRO_PHOTO_RGB(4),
    ICC(5),
    UNCALIBRATED(6), // Tag 0x0001 InteropIndex containing "R03" + Uncalibrated = Adobe RGB
    CAMERA_LINEAR_UNI_WB(7),
    CAMERA_LINEAR(8),
    CAMERA_GAMMA_UNI_WB(9),
    CAMERA_GAMMA(10),
    MONOCHROME_LINEAR(11),
    MONOCHROME_GAMMA(12),
    UNKNOWN(255);

    private final int value;

    ColorSpace(int value) {
        this.value = value;
    }

    public static ColorSpace fromValue(int value) {
        for (ColorSpace colorSpace : values()) {
            if (colorSpace.value == value) {
                return colorSpace;
            }
        }

        return UNKNOWN;
    }
}
