package dev.jacobandersen.libraw4j.core.data;

import java.security.Timestamp;

/**
 * @author Jacob Andersen
 * @since
 */
public class ImageGpsData {
    private final GpsComponents latitude;
    private final GpsComponents longitude;
    private final Timestamp timestamp;
    private final float altitude;

    private ImageGpsData(GpsComponents latitude, GpsComponents longitude, Timestamp timestamp, float altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
        this.altitude = altitude;
    }

    static ImageGpsData load() {

        // TODO: implement
        return null;
    }

    public record GpsComponents(int degree, int minute, double second) {}
}
