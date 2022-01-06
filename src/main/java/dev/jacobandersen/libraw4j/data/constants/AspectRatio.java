package dev.jacobandersen.libraw4j.data.constants;

import dev.jacobandersen.libraw4j.util.MathUtil;
import org.tinylog.Logger;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum AspectRatio {
    THREE_TO_TWO(1.5d),
    ONE_TO_ONE(1.0d),
    FOUR_TO_THREE(1.33d),
    SIXTEEN_TO_NINE(1.78d),
    FIVE_TO_FOUR(1.25d),
    OTHER(-1d);

    private final double aspect;

    AspectRatio(double aspect) {
        this.aspect = aspect;
    }

    public static AspectRatio fromValue(double aspect) {
        aspect = MathUtil.round(aspect, 2);

        for (AspectRatio value : values()) {
            if (value.aspect == aspect) {
                return value;
            }
        }

        Logger.warn("Unknown aspect ratio: {}", aspect);
        return OTHER;
    }
}
