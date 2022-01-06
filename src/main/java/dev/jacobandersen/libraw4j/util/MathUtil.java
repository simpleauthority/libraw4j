package dev.jacobandersen.libraw4j.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public class MathUtil {
    /**
     * Rounds a double to the specified number of decimal places.
     * <p>https://stackoverflow.com/a/2808648/5616667</p>
     *
     * @param value  the value to round
     * @param places the number of decimal places to round to
     * @return the rounded value
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
