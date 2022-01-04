package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public final class LensDetails {
    private final long id;
    private final String name;
    private final CameraFormat format;
    private final LensMount mount;
    private final String body;
    private final FocalType focalType;
    private final String namePrefix;
    private final String nameSuffix;
    private final float minimumFocalLength;
    private final float maximumFocalLength;
    private final float minimumApertureAtMinFocalLength;
    private final float minimumApertureAtMaxFocalLength;
    private final float maximumApertureAtMinFocalLength;
    private final float maximumApertureAtMaxFocalLength;
    private final float minimumAperture;
    private final float maximumAperture;
    private final float minimumFocusDistance;
    private final float numberOfFStops;

    private LensDetails(long id, String name, CameraFormat format, LensMount mount, String body, FocalType focalType, String namePrefix, String nameSuffix, float minimumFocalLength, float maximumFocalLength, float minimumApertureAtMinFocalLength, float minimumApertureAtMaxFocalLength, float maximumApertureAtMinFocalLength, float maximumApertureAtMaxFocalLength, float minimumAperture, float maximumAperture, float minimumFocusDistance, float numberOfFStops) {
        this.id = id;
        this.name = name;
        this.format = format;
        this.mount = mount;
        this.body = body;
        this.focalType = focalType;
        this.namePrefix = namePrefix;
        this.nameSuffix = nameSuffix;
        this.minimumFocalLength = minimumFocalLength;
        this.maximumFocalLength = maximumFocalLength;
        this.minimumApertureAtMinFocalLength = minimumApertureAtMinFocalLength;
        this.minimumApertureAtMaxFocalLength = minimumApertureAtMaxFocalLength;
        this.maximumApertureAtMinFocalLength = maximumApertureAtMinFocalLength;
        this.maximumApertureAtMaxFocalLength = maximumApertureAtMaxFocalLength;
        this.minimumAperture = minimumAperture;
        this.maximumAperture = maximumAperture;
        this.minimumFocusDistance = minimumFocusDistance;
        this.numberOfFStops = numberOfFStops;
    }

    static LensDetails load() {
        // TODO: implement
        return null;
    }
}
