package dev.jacobandersen.libraw4j.core.data.component.image;

import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageBasicData;
import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageColorData;
import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageGpsData;
import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageSizeDetails;
import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageThumbnail;
import jdk.incubator.foreign.MemorySegment;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ImageDetails(ImageBasicData basic, ImageColorData colors, ImageGpsData gps, ImageSizeDetails size,
                           ImageThumbnail thumbnail) {
    /**
     * Loads image details from the given memory address.
     *
     * @param librawData The segment of memory containing the libraw data.
     * @return the loaded image details
     */
    public static ImageDetails load(MemorySegment librawData) {
        ImageBasicData basic = ImageBasicData.load(librawData);
        ImageColorData colors = ImageColorData.load(librawData);
        ImageGpsData gps = ImageGpsData.load(librawData);
        ImageSizeDetails size = ImageSizeDetails.load(librawData);
        ImageThumbnail thumbnail = ImageThumbnail.load(librawData);

        return new ImageDetails(basic, colors, gps, size, thumbnail);
    }
}
