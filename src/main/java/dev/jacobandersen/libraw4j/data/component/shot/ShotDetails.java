package dev.jacobandersen.libraw4j.data.component.shot;

import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_data_t;
import org.libraw.libraw_shootinginfo_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ShotDetails(short driveMode, short focusMode, short meteringMode, short autofocusPoint,
                          short exposureMode, short exposureProgram, short imageStabilization,
                          String bodySerialNumber, String internalBodySerialNumber) {

    /**
     * Loads shot details from the given memory segment.
     *
     * @param librawData The segment of memory containing the libraw data.
     * @return the shot details.
     */
    public static ShotDetails load(MemorySegment librawData) {
        MemorySegment data = libraw_data_t.shootinginfo$slice(librawData);

        short driveMode = libraw_shootinginfo_t.DriveMode$get(data);
        short focusMode = libraw_shootinginfo_t.FocusMode$get(data);
        short meteringMode = libraw_shootinginfo_t.MeteringMode$get(data);
        short autofocusPoint = libraw_shootinginfo_t.AFPoint$get(data);
        short exposureMode = libraw_shootinginfo_t.ExposureMode$get(data);
        short exposureProgram = libraw_shootinginfo_t.ExposureProgram$get(data);
        short imageStabilization = libraw_shootinginfo_t.ImageStabilization$get(data);
        String bodySerialNumber = StringUtil.readNullTerminatedString(libraw_shootinginfo_t.BodySerial$slice(data).toByteArray());
        String internalBodySerialNumber = StringUtil.readNullTerminatedString(libraw_shootinginfo_t.InternalBodySerial$slice(data).toByteArray());

        return new ShotDetails(
                driveMode, focusMode, meteringMode, autofocusPoint, exposureMode, exposureProgram,
                imageStabilization, bodySerialNumber, internalBodySerialNumber
        );
    }
}