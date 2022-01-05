package dev.jacobandersen.libraw4j.core.data.component.image.subcomponents;

import dev.jacobandersen.libraw4j.core.data.constants.AspectRatio;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_data_t;
import org.libraw.libraw_image_sizes_t;

/**
 * Holds data regarding the size of a raw image loaded by LibRaw.
 *
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ImageSizeDetails(short rawHeight, short rawWidth, short meaningfulHeight, short meaningfulWidth,
                               short outputHeight, short outputWidth, short topMargin, short leftMargin,
                               double pixelAspect, AspectRatio aspectRatio, int flip, Orientation orientation) {
    /**
     * Loads the image size details from the given memory segment.
     *
     * @param librawData The segment of memory containing the libraw data.
     * @return The image size details.
     */
    public static ImageSizeDetails load(MemorySegment librawData) {
        MemorySegment data = libraw_data_t.sizes$slice(librawData);

        short rawHeight = libraw_image_sizes_t.raw_height$get(data);
        short rawWidth = libraw_image_sizes_t.raw_width$get(data);
        short meaningfulHeight = libraw_image_sizes_t.height$get(data);
        short meaningfulWidth = libraw_image_sizes_t.width$get(data);
        short outputHeight = libraw_image_sizes_t.iheight$get(data);
        short outputWidth = libraw_image_sizes_t.iwidth$get(data);
        short topMargin = libraw_image_sizes_t.top_margin$get(data);
        short leftMargin = libraw_image_sizes_t.left_margin$get(data);
        double pixelAspect = libraw_image_sizes_t.pixel_aspect$get(data);
        AspectRatio aspectRatio = AspectRatio.fromValue(pixelAspect);
        int flip = libraw_image_sizes_t.flip$get(data);
        Orientation orientation = Orientation.fromValue(flip);

        return new ImageSizeDetails(
                rawHeight, rawWidth, meaningfulHeight, meaningfulWidth, outputHeight, outputWidth, topMargin,
                leftMargin, pixelAspect, aspectRatio, flip, orientation
        );
    }

    /**
     * Represents how an image should be rotated (if at all) for display.
     */
    public enum Orientation {
        NO_ROTATION(0),
        ROTATE_180(3),
        ROTATE_90_CCW(5),
        ROTATE_90_CW(6);

        private final int value;

        Orientation(int value) {
            this.value = value;
        }

        /**
         * Finds the orientation based on the value.
         *
         * @param value the value to find the orientation for
         * @return the orientation
         * @throws IllegalArgumentException if the value is not a valid orientation
         */
        static Orientation fromValue(int value) throws IllegalArgumentException {
            for (Orientation orientation : values()) {
                if (orientation.value == value) {
                    return orientation;
                }
            }

            throw new IllegalArgumentException("No orientation with value " + value);
        }
    }
}
