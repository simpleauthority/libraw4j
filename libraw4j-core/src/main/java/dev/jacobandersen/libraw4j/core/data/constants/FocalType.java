package dev.jacobandersen.libraw4j.core.data.constants;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum FocalType {
    UNDEFINED(0),
    PRIME(1),
    ZOOM(2),
    ZOOM_CONSTANT_APERTURE(3),
    ZOOM_VARIABLE_APERTURE(4);

    private final int value;

    FocalType(int value) {
        this.value = value;
    }

    public static FocalType fromValue(int value) {
        for (FocalType focalType : FocalType.values()) {
            if (focalType.value == value) {
                return focalType;
            }
        }

        throw new IllegalArgumentException("No matching FocalType for value: " + value);
    }
}
