package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since
 */
public class ImageThumbnail {
    private final DataFormat format;
    private final short width;
    private final short height;
    private final int length;
    private final int colors;
    private final byte[] data;

    private ImageThumbnail(DataFormat format, short width, short height, int length, int colors, byte[] data) {
        this.format = format;
        this.width = width;
        this.height = height;
        this.length = length;
        this.colors = colors;
        this.data = data;
    }

    static ImageThumbnail load() {
        // TODO: implement
        return null;
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
