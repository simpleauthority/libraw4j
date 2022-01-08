package dev.jacobandersen.libraw4j;

import dev.jacobandersen.libraw4j.data.LibRawImage;
import dev.jacobandersen.libraw4j.exception.LibRawException;
import dev.jacobandersen.libraw4j.exception.LibRawExceptions;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
import org.jetbrains.annotations.NotNull;
import org.libraw.libraw_data_t;
import org.libraw.libraw_h;

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
    public static LibRawImage load(@NotNull File file) throws LibRawException {
        try (ResourceScope scope = ResourceScope.newConfinedScope()) {
            MemoryAddress libraw = libraw_h.libraw_init(0);

            // Open the file with native library
            int openFileRes = libraw_h.libraw_open_file(libraw, CLinker.toCString(file.getAbsolutePath(), scope));
            if (openFileRes != 0) {
                throw LibRawExceptions.getByCode(openFileRes);
            }

            // Unpack the actual raw
            int unpackRes = libraw_h.libraw_unpack(libraw);
            if (unpackRes != 0) {
                throw LibRawExceptions.getByCode(unpackRes);
            }

            // Unpack the embedded thumbnail
            int unpackThumbRes = libraw_h.libraw_unpack_thumb(libraw);
            if (unpackThumbRes != 0) {
                throw LibRawExceptions.getByCode(unpackThumbRes);
            }

            // Read the memory and load it into a POJO
            LibRawImage image = new LibRawImage(libraw_data_t.ofAddress(libraw, scope));

            // Close the file via the native library
            libraw_h.libraw_close(libraw);

            return image;
        }
    }
}
