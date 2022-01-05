package dev.jacobandersen.libraw4j.core.data.component.shot;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import org.libraw.libraw_data_t;
import org.libraw.libraw_shootinginfo_t;

import java.nio.charset.StandardCharsets;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ShotDetails(short driveMode, short focusMode, short meteringMode, short autofocusPoint,
                          short exposureMode, short exposureProgram, short imageStabilization,
                          String bodySerialNumber, String internalBodySerialNumber) {
    public static ShotDetails load(MemoryAddress libraw, ResourceScope scope) {
        MemorySegment data = libraw_data_t.shootinginfo$slice(libraw_data_t.ofAddress(libraw, scope));

        short driveMode = libraw_shootinginfo_t.DriveMode$get(data);
        short focusMode = libraw_shootinginfo_t.FocusMode$get(data);
        short meteringMode = libraw_shootinginfo_t.MeteringMode$get(data);
        short autofocusPoint = libraw_shootinginfo_t.AFPoint$get(data);
        short exposureMode = libraw_shootinginfo_t.ExposureMode$get(data);
        short exposureProgram = libraw_shootinginfo_t.ExposureProgram$get(data);
        short imageStabilization = libraw_shootinginfo_t.ImageStabilization$get(data);
        String bodySerialNumber = new String(libraw_shootinginfo_t.BodySerial$slice(data).toByteArray(), StandardCharsets.UTF_8);
        String internalBodySerialNumber = new String(libraw_shootinginfo_t.InternalBodySerial$slice(data).toByteArray(), StandardCharsets.UTF_8);

        return new ShotDetails(
                driveMode, focusMode, meteringMode, autofocusPoint, exposureMode, exposureProgram,
                imageStabilization, bodySerialNumber, internalBodySerialNumber
        );
    }
}