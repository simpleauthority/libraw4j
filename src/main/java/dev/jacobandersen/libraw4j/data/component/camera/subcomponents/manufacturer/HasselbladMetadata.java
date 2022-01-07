package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_hasselblad_makernotes_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record HasselbladMetadata(int baseISO, double gain, String sensor, String sensorUnit, String hostBody,
                                 int sensorCode, int sensorSubCode, int coatingCode, int uncropped, String captureSequenceInitiator,
                                 String sensorUnitConnector, int format, int[] nifdCm, int[] recommendedCrop, double[] mnColorMatrix) {

    /**
     * Load the Hasselblad makernotes from the given memory segment.
     *
     * @param data the Hasselblad makernotes memory segment
     * @return the Hasselblad makernotes
     */
    public static HasselbladMetadata load(MemorySegment data) {
        int baseISO = libraw_hasselblad_makernotes_t.BaseISO$get(data);
        double gain = libraw_hasselblad_makernotes_t.Gain$get(data);
        String sensor = StringUtil.readNullTerminatedString(libraw_hasselblad_makernotes_t.Sensor$slice(data).toByteArray());
        String sensorUnit = StringUtil.readNullTerminatedString(libraw_hasselblad_makernotes_t.SensorUnit$slice(data).toByteArray());
        String hostBody = StringUtil.readNullTerminatedString(libraw_hasselblad_makernotes_t.HostBody$slice(data).toByteArray());
        int sensorCode = libraw_hasselblad_makernotes_t.SensorCode$get(data);
        int sensorSubCode = libraw_hasselblad_makernotes_t.SensorSubCode$get(data);
        int coatingCode = libraw_hasselblad_makernotes_t.CoatingCode$get(data);
        int uncropped = libraw_hasselblad_makernotes_t.uncropped$get(data);
        String captureSequenceInitiator = StringUtil.readNullTerminatedString(libraw_hasselblad_makernotes_t.CaptureSequenceInitiator$slice(data).toByteArray());
        String sensorUnitConnector = StringUtil.readNullTerminatedString(libraw_hasselblad_makernotes_t.SensorUnitConnector$slice(data).toByteArray());
        int format = libraw_hasselblad_makernotes_t.format$get(data);
        int[] nifdCm = libraw_hasselblad_makernotes_t.nIFD_CM$slice(data).toIntArray();
        int[] recommendedCrop = libraw_hasselblad_makernotes_t.RecommendedCrop$slice(data).toIntArray();
        double[] mnColorMatrix = libraw_hasselblad_makernotes_t.mnColorMatrix$slice(data).toDoubleArray();

        return new HasselbladMetadata(baseISO, gain, sensor, sensorUnit, hostBody, sensorCode, sensorSubCode,
                coatingCode, uncropped, captureSequenceInitiator, sensorUnitConnector, format, nifdCm,
                recommendedCrop, mnColorMatrix);
    }
}
