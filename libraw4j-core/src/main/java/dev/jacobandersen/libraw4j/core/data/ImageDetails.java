package dev.jacobandersen.libraw4j.core.data;

import java.time.Instant;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public final class ImageDetails {
    private final float iso;
    private final float shutter;
    private final float aperture;
    private final float focalLength;
    private final Instant shootTime;
    private final int shotOrder;
    private final float flashExposureComp;
    private final String description;
    private final String author;
    private final ImageGpsData gps;
    private final ImageColorData colors;
    private final ImageSizeDetails size;
    private final ImageMetadata metadata;
    private final ImageThumbnail thumbnail;

    public ImageDetails(float iso, float shutter, float aperture, float focalLength, Instant shootTime, int shotOrder, float flashExposureComp, String description, String author, ImageGpsData gps, ImageColorData colors, ImageSizeDetails size, ImageMetadata metadata, ImageThumbnail thumbnail) {
        this.iso = iso;
        this.shutter = shutter;
        this.aperture = aperture;
        this.focalLength = focalLength;
        this.shootTime = shootTime;
        this.shotOrder = shotOrder;
        this.flashExposureComp = flashExposureComp;
        this.description = description;
        this.author = author;
        this.gps = gps;
        this.colors = colors;
        this.size = size;
        this.metadata = metadata;
        this.thumbnail = thumbnail;
    }

    public static ImageDetails load() {

        // TODO: implement
        return null;
    }
}
