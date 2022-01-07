package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_samsung_makernotes_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record SamsungMetadata(int[] imageSizeFull, int[] imageSizeCrop, int[] colorSpace, int[] key, double digitalGain,
                              int deviceType, String lensFirmware) {
    /**
     * Load the Samsung makernotes from the given memory segment.
     *
     * @param data the Samsung makernotes memory segment
     * @return the Samsung makernotes
     */
    public static SamsungMetadata load(MemorySegment data) {
        int[] imageSizeFull = libraw_samsung_makernotes_t.ImageSizeFull$slice(data).toIntArray();
        int[] imageSizeCrop = libraw_samsung_makernotes_t.ImageSizeCrop$slice(data).toIntArray();
        int[] colorSpace = libraw_samsung_makernotes_t.ColorSpace$slice(data).toIntArray();
        int[] key = libraw_samsung_makernotes_t.key$slice(data).toIntArray();
        double digitalGain = libraw_samsung_makernotes_t.DigitalGain$get(data);
        int deviceType = libraw_samsung_makernotes_t.DeviceType$get(data);
        String lensFirmware = StringUtil.readNullTerminatedString(libraw_samsung_makernotes_t.LensFirmware$slice(data).toByteArray());

        return new SamsungMetadata(imageSizeFull, imageSizeCrop, colorSpace, key, digitalGain, deviceType, lensFirmware);
    }
}
