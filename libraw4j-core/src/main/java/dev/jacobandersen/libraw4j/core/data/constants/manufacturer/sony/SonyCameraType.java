package dev.jacobandersen.libraw4j.core.data.constants.manufacturer.sony;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum SonyCameraType {
        DSC(1),
        DSLR(2),
        NEX(3),
        SLT(4),
        ILCE(5),
        ILCA(6);

    private final int value;

    SonyCameraType(int value) {
        this.value = value;
    }

    public static SonyCameraType fromValue(int value) {
        for (SonyCameraType type : values()) {
            if (type.value == value) {
                return type;
            }
        }

        throw new IllegalArgumentException("No SonyCameraType with value " + value);
    }
}
