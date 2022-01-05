package dev.jacobandersen.libraw4j.core.data.component.camera.subcomponents;

import dev.jacobandersen.libraw4j.core.data.constants.ColorSpace;
import dev.jacobandersen.libraw4j.core.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_data_t;
import org.libraw.libraw_makernotes_t;
import org.libraw.libraw_metadata_common_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record CameraMetadata(float flashExposureCompensation, float flashGuideNumber, float cameraTemperature,
                             float sensorTemperature, float sensorTemperature2, float lensTemperature,
                             float ambientTemperature, float batteryTemperature, float exifAmbientTemperature,
                             float exifHumidity, float exifPressure, float exifWaterDepth, float exifAcceleration,
                             float exifCameraElevationAngle, float realISO, float exifExposureIndex,
                             short rawColorSpace,
                             ColorSpace colorSpace, String firmware) {
    /**
     * Loads the camera metadata from the given memory segment.
     *
     * @param librawData The segment of memory containing the libraw data.
     * @return the camera metadata.
     */
    public static CameraMetadata load(MemorySegment librawData) {
        MemorySegment data = libraw_data_t.makernotes$slice(librawData);

        MemorySegment common = libraw_makernotes_t.common$slice(data);
        float flashExposureCompensation = libraw_metadata_common_t.FlashEC$get(common);
        float flashGuideNumber = libraw_metadata_common_t.FlashGN$get(common);
        float cameraTemperature = libraw_metadata_common_t.CameraTemperature$get(common);
        float sensorTemperature = libraw_metadata_common_t.SensorTemperature$get(common);
        float sensorTemperature2 = libraw_metadata_common_t.SensorTemperature2$get(common);
        float lensTemperature = libraw_metadata_common_t.LensTemperature$get(common);
        float ambientTemperature = libraw_metadata_common_t.AmbientTemperature$get(common);
        float batteryTemperature = libraw_metadata_common_t.BatteryTemperature$get(common);
        float exifAmbientTemperature = libraw_metadata_common_t.exifAmbientTemperature$get(common);
        float exifHumidity = libraw_metadata_common_t.exifHumidity$get(common);
        float exifPressure = libraw_metadata_common_t.exifPressure$get(common);
        float exifWaterDepth = libraw_metadata_common_t.exifWaterDepth$get(common);
        float exifAcceleration = libraw_metadata_common_t.exifAcceleration$get(common);
        float exifCameraElevationAngle = libraw_metadata_common_t.exifCameraElevationAngle$get(common);
        float realISO = libraw_metadata_common_t.real_ISO$get(common);
        float exifExposureIndex = libraw_metadata_common_t.exifExposureIndex$get(common);
        short rawColorSpace = libraw_metadata_common_t.ColorSpace$get(common);
        ColorSpace colorSpace = ColorSpace.fromValue(rawColorSpace);
        String firmware = StringUtil.readNullTerminatedString(libraw_metadata_common_t.firmware$slice(common).toByteArray());

        // TODO: manufacturer specific metadata

        return new CameraMetadata(
                flashExposureCompensation, flashGuideNumber, cameraTemperature, sensorTemperature, sensorTemperature2,
                lensTemperature, ambientTemperature, batteryTemperature, exifAmbientTemperature, exifHumidity,
                exifPressure, exifWaterDepth, exifAcceleration, exifCameraElevationAngle, realISO, exifExposureIndex,
                rawColorSpace, colorSpace, firmware
        );
    }
}
