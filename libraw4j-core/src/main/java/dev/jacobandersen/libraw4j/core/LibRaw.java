package dev.jacobandersen.libraw4j.core;

import dev.jacobandersen.libraw4j.core.util.NativeUtil;
import dev.jacobandersen.libraw4j.core.util.OperatingSystemUtil;
import org.tinylog.Logger;

/**
 * This class is used for loading LibRaw's native library for the specific operating system.
 *
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public final class LibRaw {
    private static boolean nativesLoaded = false;

    /**
     * Try to load the native libraries required for LibRaw to work.
     * If this fails, this library is useless. As such, the application will not be able to run.
     * To prevent further issues, we simply exit the application.
     */
    public static void loadNatives() {
        try {
            loadNatives0();
        } catch (Exception ex) {
            Logger.error(ex);
            System.exit(1);
        }
    }

    private static void loadNatives0() throws Exception {
        if (nativesLoaded) {
            // Native libraries already loaded
            return;
        }

        Logger.info("Loading native libraries...");

        if (OperatingSystemUtil.isWindows()) {
            NativeUtil.loadLibraryFromJar("lib/windows/x64/libraw.dll");
        } else if (OperatingSystemUtil.isMac()) {
            NativeUtil.loadLibraryFromJar("lib/mac/x64/libraw_r.20.dylib");
        } else if (OperatingSystemUtil.isUnix()) {
            NativeUtil.loadLibraryFromJar(("/lib/linux/x64/libraw_r.20.so"));
        } else {
            throw new IllegalStateException(String.format("Unsupported operating system %s!", OperatingSystemUtil.OS));
        }

        Logger.info("Native libraries loaded.");

        nativesLoaded = true;
    }
}
