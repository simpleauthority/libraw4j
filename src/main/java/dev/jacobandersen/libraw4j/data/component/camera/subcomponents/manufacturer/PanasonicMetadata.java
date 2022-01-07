package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_panasonic_makernotes_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record PanasonicMetadata(short compression, short blackLevelDim, float[] blackLevel,
                                int multishot, float gamma, int[] highISOMultiplier) {

    /**
     * Load the Panasonic makernotes from the given memory segment.
     *
     * @param data the Panasonic makernotes memory segment
     * @return the Panasonic makernotes
     */
    public static PanasonicMetadata load(MemorySegment data) {
        short compression = libraw_panasonic_makernotes_t.Compression$get(data);
        short blackLevelDim = libraw_panasonic_makernotes_t.BlackLevelDim$get(data);
        float[] blackLevel = libraw_panasonic_makernotes_t.BlackLevel$slice(data).toFloatArray();
        int multishot = libraw_panasonic_makernotes_t.Multishot$get(data);
        float gamma = libraw_panasonic_makernotes_t.gamma$get(data);
        int[] highISOMultiplier = libraw_panasonic_makernotes_t.HighISOMultiplier$slice(data).toIntArray();

        return new PanasonicMetadata(compression, blackLevelDim, blackLevel, multishot, gamma, highISOMultiplier);
    }
}
