package dev.jacobandersen.libraw4j.data.constants;

import org.tinylog.Logger;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum CameraFormat {
    UNKNOWN(0),
    APSC(1),
    FF(2),
    MF(3),
    APSH(4),
    ONE_INCH(5),
    ONE_OVER_2_THIRDS_INCH(6),  /* 1/2.3" */
    ONE_OVER_1_SEVENTHS_INCH(7),  /* 1/1.7" */
    FT(8),           /* sensor size in FT & mFT cameras */
    CROP645(9),      /* 44X33mm */
    LEICAS(10),       /* 'MF' Leicas */
    SIX_FORTY_FIVE(11),
    SIX_SIX(12),
    SIX_NINE(13),
    LF(14),
    LEICA_DMR(15),
    SIX_SEVEN(16),
    SIGMA_APSC(16),    /* DP1, DP2, SD15, SD14, SD10, SD9 */
    SIGMA_MERRILL(17), /* SD1,  'SD1 Merrill',  'DP1 Merrill',  'DP2 Merrill' */
    SIGMA_APSH(18),    /* 'SD Quattro H' */
    THREE_SIX_FOUR_EIGHT(19),         /* DALSA FTF4052C (Mamiya ZD) */
    SIX_EIGHT(20);           /* Fujifilm GX680 */

    private final int value;

    CameraFormat(int value) {
        this.value = value;
    }

    public static CameraFormat fromValue(int value) {
        for (CameraFormat format : values()) {
            if (format.value == value) {
                return format;
            }
        }

        Logger.warn("Unknown camera format value: {}", value);
        return UNKNOWN;
    }
}
