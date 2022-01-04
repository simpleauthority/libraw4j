package dev.jacobandersen.libraw4j.core.data;

/**
 * Holds data regarding the size of a raw image loaded by LibRaw.
 *
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public class ImageSizeDetails {
    private final short rawHeight;
    private final short rawWidth;
    private final short meaningfulHeight;
    private final short meaningfulWidth;
    private final short outputHeight;
    private final short outputWidth;
    private final short topMargin;
    private final short leftMargin;
    private final double aspectRatio;
    private final Orientation orientation;

    private ImageSizeDetails(short rawHeight, short rawWidth, short meaningfulHeight, short meaningfulWidth, short outputHeight, short outputWidth, short topMargin, short leftMargin, double aspectRatio, Orientation orientation) {
        this.rawHeight = rawHeight;
        this.rawWidth = rawWidth;
        this.meaningfulHeight = meaningfulHeight;
        this.meaningfulWidth = meaningfulWidth;
        this.outputHeight = outputHeight;
        this.outputWidth = outputWidth;
        this.topMargin = topMargin;
        this.leftMargin = leftMargin;
        this.aspectRatio = aspectRatio;
        this.orientation = orientation;
    }

    /**
     * Load the image size details from the given LibRawImage.
     *
     * @return the image size details
     */
    static ImageSizeDetails load() {
        // TODO: implement
        return null;
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
        static Orientation fromValue(int value) throws IllegalArgumentException{
            for (Orientation orientation : values()) {
                if (orientation.value == value) {
                    return orientation;
                }
            }

            throw new IllegalArgumentException("No orientation with value " + value);
        }
    }
}
