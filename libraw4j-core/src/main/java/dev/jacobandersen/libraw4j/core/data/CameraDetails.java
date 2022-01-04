package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public final class CameraDetails {
    private final String make;
    private final String normalizedMake;
    private final String model;
    private final String normalizedModel;
    private final String vendor;
    private final LensDetails lensDetails;
    private final AccessoryDetails accessoryDetails;

    public CameraDetails(String make, String normalizedMake, String model, String normalizedModel, String vendor, LensDetails lensDetails, AccessoryDetails accessoryDetails) {
        this.make = make;
        this.normalizedMake = normalizedMake;
        this.model = model;
        this.normalizedModel = normalizedModel;
        this.vendor = vendor;
        this.lensDetails = lensDetails;
        this.accessoryDetails = accessoryDetails;
    }

    public static CameraDetails load() {

        // TODO: implement
        return null;
    }
}
