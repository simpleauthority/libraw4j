package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_olympus_makernotes_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record OlympusMetadata(int[] sensorCalibration, short[] focusMode, short autoFocus, short autofocusPoint,
                              int[] autofocusAreas, double[] autofocusPointSelected, short autofocusResult,
                              short[] driveMode, short colorSpace, byte autofocusFineTune, short[] autofocusFineAdjustment,
                              String cameraType2) {

    /**
     * Load the Olympus makernotes from the given memory segment.
     *
     * @param data the Olympus makernotes memory segment
     * @return the Olympus makernotes
     */
    public static OlympusMetadata load(MemorySegment data) {
        int[] sensorCalibration = libraw_olympus_makernotes_t.SensorCalibration$slice(data).toIntArray();
        short[] focusMode = libraw_olympus_makernotes_t.FocusMode$slice(data).toShortArray();
        short autoFocus = libraw_olympus_makernotes_t.AutoFocus$get(data);
        short autofocusPoint = libraw_olympus_makernotes_t.AFPoint$get(data);
        int[] autofocusAreas = libraw_olympus_makernotes_t.AFAreas$slice(data).toIntArray();
        double[] autofocusPointSelected = libraw_olympus_makernotes_t.AFPointSelected$slice(data).toDoubleArray();
        short autofocusResult = libraw_olympus_makernotes_t.AFResult$get(data);
        short[] driveMode = libraw_olympus_makernotes_t.DriveMode$slice(data).toShortArray();
        short colorSpace = libraw_olympus_makernotes_t.ColorSpace$get(data);
        byte autofocusFineTune = libraw_olympus_makernotes_t.AFFineTune$get(data);
        short[] autofocusFineAdjustment = libraw_olympus_makernotes_t.AFFineTuneAdj$slice(data).toShortArray();
        String cameraType2 = StringUtil.readNullTerminatedString(libraw_olympus_makernotes_t.CameraType2$slice(data).toByteArray());

        return new OlympusMetadata(sensorCalibration, focusMode, autoFocus, autofocusPoint, autofocusAreas,
                autofocusPointSelected, autofocusResult, driveMode, colorSpace, autofocusFineTune,
                autofocusFineAdjustment, cameraType2);
    }
}
