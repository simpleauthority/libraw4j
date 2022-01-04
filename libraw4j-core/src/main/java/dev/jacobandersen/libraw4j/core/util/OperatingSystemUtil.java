package dev.jacobandersen.libraw4j.core.util;

/**
 * Utility class for determining the current operating system.
 *
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public class OperatingSystemUtil {
    public static final String OS = System.getProperty("os.name").toLowerCase();

    public static boolean isWindows() {
        return OS.contains("win");
    }

    public static boolean isMac() {
        return OS.contains("mac");
    }

    public static boolean isUnix() {
        return OS.contains("nix") || OS.contains("nux") || OS.contains("aix");
    }
}
