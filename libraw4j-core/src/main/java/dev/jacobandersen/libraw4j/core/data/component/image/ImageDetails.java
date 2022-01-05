package dev.jacobandersen.libraw4j.core.data.component.image;

import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageBasicData;
import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageColorData;
import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageGpsData;
import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageSizeDetails;
import dev.jacobandersen.libraw4j.core.data.component.image.subcomponents.ImageThumbnail;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ImageDetails(ImageBasicData basic, ImageColorData colors, ImageGpsData gps, ImageSizeDetails size,
                           ImageThumbnail thumbnail) {
    /**
     * Loads image details from the given memory address.
     *
     * @param libraw the libraw instance
     * @param scope  the scope to use
     * @return the loaded image details
     */
    public static ImageDetails load(MemoryAddress libraw, ResourceScope scope) {
        ImageBasicData basic = ImageBasicData.load(libraw, scope);
        ImageColorData colors = ImageColorData.load(libraw, scope);
        ImageGpsData gps = ImageGpsData.load(libraw, scope);
        ImageSizeDetails size = ImageSizeDetails.load(libraw, scope);
        ImageThumbnail thumbnail = ImageThumbnail.load(libraw, scope);

        return new ImageDetails(basic, colors, gps, size, thumbnail);
    }
}
