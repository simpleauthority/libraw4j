package dev.jacobandersen.libraw4j.core;

import com.google.common.base.Preconditions;
import dev.jacobandersen.libraw4j.core.data.LibRawImage;
import dev.jacobandersen.libraw4j.core.exception.LibRawException;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
import org.jetbrains.annotations.NotNull;
import org.libraw.libraw_h;
import org.tinylog.Logger;

import java.io.File;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public class LibRawImageLoader {
    static {
        LibRaw.loadNatives();
    }

    /**
     * Loads a raw image from the specified file.
     *
     * @param file the file to load
     * @return the loaded image
     * @throws IllegalStateException if the image could not be loaded
     */
    public static LibRawImage load(@NotNull File file) throws IllegalStateException {
        Preconditions.checkNotNull(file, "file");

        Logger.info("Loading raw image from file: {}", file.getAbsolutePath());

        try (ResourceScope scope = ResourceScope.newConfinedScope()) {
            Logger.info("Preparing LibRaw...");
            MemoryAddress libraw = libraw_h.libraw_init(0);

            Logger.info("Opening raw file with LibRaw...");
            int openFileRes = libraw_h.libraw_open_file(libraw, CLinker.toCString(file.getAbsolutePath(), scope));
            if (openFileRes != 0) {
                throw new LibRawException("Failed to open raw file: " + file.getAbsolutePath());
            }

            Logger.info("Unpacking raw image with LibRaw...");
            libraw_h.libraw_unpack(libraw);
            libraw_h.libraw_unpack_thumb(libraw);

            Logger.info("Raw image unpacked. Collecting data...");
            LibRawImage image = new LibRawImage(libraw, scope);

            Logger.info("Raw image data collected. Closing LibRaw...");
            libraw_h.libraw_close(libraw);

            Logger.info("LibRaw closed. Returning image...");
            return image;
        } catch (Exception ex) {
            throw new IllegalStateException(
                    "Raw image did not load successfully! There may be errors in the log.",
                    ex
            );
        }
    }
}
