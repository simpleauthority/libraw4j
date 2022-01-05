package dev.jacobandersen.libraw4j.core.data.component.image.subcomponents;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import org.libraw.libraw_h;
import org.libraw.libraw_imgother_t;

import java.nio.charset.StandardCharsets;
import java.time.Instant;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ImageBasicData(float isoSpeed, float shutterSpeed, float aperture, float focalLength, Instant shootTime,
                             int shotOrder, String description, String author) {
    public static ImageBasicData load(MemoryAddress libraw, ResourceScope scope) {
        MemorySegment data = libraw_imgother_t.ofAddress(libraw_h.libraw_get_imgother(libraw), scope);

        float isoSpeed = libraw_imgother_t.iso_speed$get(data);
        float shutterSpeed = libraw_imgother_t.shutter$get(data);
        float aperture = libraw_imgother_t.aperture$get(data);
        float focalLength = libraw_imgother_t.focal_len$get(data);
        long shootTime = libraw_imgother_t.timestamp$get(data);
        int shotOrder = libraw_imgother_t.shot_order$get(data);
        String description = new String(libraw_imgother_t.desc$slice(data).toByteArray(), StandardCharsets.UTF_8);
        String author = new String(libraw_imgother_t.artist$slice(data).toByteArray(), StandardCharsets.UTF_8);

        return new ImageBasicData(isoSpeed, shutterSpeed, aperture, focalLength, Instant.ofEpochSecond(shootTime),
                shotOrder, description, author);
    }
}
