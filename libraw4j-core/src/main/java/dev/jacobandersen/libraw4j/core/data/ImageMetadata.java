package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public class ImageMetadata {
    private final float flashExposureCompensation;
    private final float flashGuideNumber;
    private final float cameraTemperature;
    private final float sensorTemperature;
    private final float sensorTemperature2;
    private final float lensTemperature;
    private final float ambientTemperature;
    private final float batteryTemperature;
    private final float exifAmbientTemperature;
    private final float exifHumidity;
    private final float exifPressure;
    private final float exifWaterDepth;
    private final float exifAcceleration;
    private final float exifCameraElevationAngle;
    private final float realISO;
    private final float exifExposureIndex;
    private final ColorSpace colorSpace;

    private ImageMetadata(float flashExposureCompensation, float flashGuideNumber, float cameraTemperature, float sensorTemperature, float sensorTemperature2, float lensTemperature, float ambientTemperature, float batteryTemperature, float exifAmbientTemperature, float exifHumidity, float exifPressure, float exifWaterDepth, float exifAcceleration, float exifCameraElevationAngle, float realISO, float exifExposureIndex, ColorSpace colorSpace) {
        this.flashExposureCompensation = flashExposureCompensation;
        this.flashGuideNumber = flashGuideNumber;
        this.cameraTemperature = cameraTemperature;
        this.sensorTemperature = sensorTemperature;
        this.sensorTemperature2 = sensorTemperature2;
        this.lensTemperature = lensTemperature;
        this.ambientTemperature = ambientTemperature;
        this.batteryTemperature = batteryTemperature;
        this.exifAmbientTemperature = exifAmbientTemperature;
        this.exifHumidity = exifHumidity;
        this.exifPressure = exifPressure;
        this.exifWaterDepth = exifWaterDepth;
        this.exifAcceleration = exifAcceleration;
        this.exifCameraElevationAngle = exifCameraElevationAngle;
        this.realISO = realISO;
        this.exifExposureIndex = exifExposureIndex;
        this.colorSpace = colorSpace;
    }

    static ImageMetadata load() {

        // TODO: implement
        return null;
    }
}
