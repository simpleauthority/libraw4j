package dev.jacobandersen.libraw4j.data.component.image.subcomponents;

import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_data_t;
import org.libraw.libraw_thumbnail_t;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ImageThumbnail(DataFormat format, short width, short height, int length, int colors, byte[] imageBytes) {
    /**
     * Loads the embedded thumbnail from the give memory segment.
     *
     * @param librawData The segment of memory containing the libraw data.
     * @return the thumbnail data.
     */
    public static ImageThumbnail load(MemorySegment librawData) {
        MemorySegment data = libraw_data_t.thumbnail$slice(librawData);

        int thumbnailFormatIndex = libraw_thumbnail_t.tformat$get(data);
        DataFormat thumbnailFormat = DataFormat.fromValue(thumbnailFormatIndex);
        short width = libraw_thumbnail_t.twidth$get(data);
        short height = libraw_thumbnail_t.theight$get(data);
        int length = libraw_thumbnail_t.tlength$get(data);
        int colors = libraw_thumbnail_t.tcolors$get(data);
        byte[] imageBytes = libraw_thumbnail_t.thumb$get(data).asSegment(length, data.scope()).toByteArray();

        return new ImageThumbnail(thumbnailFormat, width, height, length, colors, imageBytes);
    }

    public BufferedImage asBufferedImage() throws IOException {
        return ImageIO.read(new ByteArrayInputStream(imageBytes));
    }

    public enum DataFormat {
        // Format unknown or thumbnail was not read yet
        UNKNOWN(0),

        // Extracted from RAW if available
        JPEG(1),
        BITMAP(2),

        // Only by setting LIBRAW_PROCESSING_USE_PPM16_THUMBS
        BITMAP16(3),

        // Unsupported
        LAYER(4),
        ROLLEI(5);

        private final int value;

        DataFormat(int value) {
            this.value = value;
        }

        static DataFormat fromValue(int value) {
            for (DataFormat format : values()) {
                if (format.value == value) {
                    return format;
                }
            }

            throw new IllegalArgumentException("Unknown data format: " + value);
        }
    }
}
