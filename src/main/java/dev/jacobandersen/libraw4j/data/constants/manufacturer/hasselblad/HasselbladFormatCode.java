package dev.jacobandersen.libraw4j.data.constants.manufacturer.hasselblad;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum HasselbladFormatCode {
    UNKNOWN(0),
    THREEFR(1),
    FFF(2),
    IMACON(3),
    HASSELBLAD_DNG(4),
    ADOBE_DNG(5),
    ADOBE_DNG_FROM_PHOCUS_DNG(6);

    private final int value;

    HasselbladFormatCode(int value) {
        this.value = value;
    }

    public static HasselbladFormatCode fromValue(int value) {
        for (HasselbladFormatCode code : values()) {
            if (code.value == value) {
                return code;
            }
        }

        throw new IllegalArgumentException("Unknown HasselbladFormatCode value: " + value);
    }
}
