package dev.jacobandersen.libraw4j.util;

import java.nio.charset.StandardCharsets;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public class StringUtil {
    public static String readNullTerminatedString(byte[] bytes) {
        int nullIndex = 0;
        while (nullIndex < bytes.length && bytes[nullIndex] != 0) nullIndex++;
        return new String(bytes, 0, nullIndex, StandardCharsets.UTF_8);
    }
}
