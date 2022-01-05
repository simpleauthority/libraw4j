package dev.jacobandersen.libraw4j.core.data.component.image.subcomponents;

import dev.jacobandersen.libraw4j.core.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_data_t;
import org.libraw.libraw_imgother_t;

import java.time.Instant;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ImageBasicData(float isoSpeed, float shutterSpeed, float aperture, float focalLength, Instant shootTime,
                             int shotOrder, String description, String author) {
    /**
     * Loads the basic image data from the given memory segment.
     *
     * @param librawData The segment of memory containing the libraw data.
     * @return The loaded basic image data.
     */
    public static ImageBasicData load(MemorySegment librawData) {
        MemorySegment data = libraw_data_t.other$slice(librawData);

        float isoSpeed = libraw_imgother_t.iso_speed$get(data);
        float shutterSpeed = libraw_imgother_t.shutter$get(data);
        float aperture = libraw_imgother_t.aperture$get(data);
        float focalLength = libraw_imgother_t.focal_len$get(data);
        long shootTime = libraw_imgother_t.timestamp$get(data);
        int shotOrder = libraw_imgother_t.shot_order$get(data);
        String description = StringUtil.readNullTerminatedString(libraw_imgother_t.desc$slice(data).toByteArray());
        String author = StringUtil.readNullTerminatedString(libraw_imgother_t.artist$slice(data).toByteArray());

        return new ImageBasicData(isoSpeed, shutterSpeed, aperture, focalLength, Instant.ofEpochSecond(shootTime),
                shotOrder, description, author);
    }
}
