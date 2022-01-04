package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum AspectRatio {
    UNKNOWN(0),
    THREE_TO_TWO(1),
    ONE_TO_ONE(2),
    FOUR_TO_THREE(3),
    SIXTEEN_TO_NINE(4),
    FIVE_TO_FOUR(5),
    OTHER(6);

    private final int value;

    AspectRatio(int value) {
        this.value = value;
    }

    public static AspectRatio fromValue(int value) {
        for (AspectRatio aspectRatio : values()) {
            if (aspectRatio.value == value) {
                return aspectRatio;
            }
        }

        throw new IllegalArgumentException("No matching AspectRatio for value: " + value);
    }
}
