package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_p1_makernotes_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record PhaseOneMetadata(String software, String systemType, String firmwareString, String systemModel) {
    /**
     * Load the Phase One makernotes from the given memory segment.
     *
     * @param data the Phase One makernotes memory segment
     * @return the Phase One makernotes
     */
    public static PhaseOneMetadata load(MemorySegment data) {
        String software = StringUtil.readNullTerminatedString(libraw_p1_makernotes_t.Software$slice(data).toByteArray());
        String systemType = StringUtil.readNullTerminatedString(libraw_p1_makernotes_t.SystemType$slice(data).toByteArray());
        String firmwareString = StringUtil.readNullTerminatedString(libraw_p1_makernotes_t.FirmwareString$slice(data).toByteArray());
        String systemModel = StringUtil.readNullTerminatedString(libraw_p1_makernotes_t.SystemModel$slice(data).toByteArray());

        return new PhaseOneMetadata(software, systemType, firmwareString, systemModel);
    }
}
