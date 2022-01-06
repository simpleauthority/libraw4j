package dev.jacobandersen.libraw4j.data.component.camera;

import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.CameraMetadata;
import dev.jacobandersen.libraw4j.data.constants.CameraMaker;
import dev.jacobandersen.libraw4j.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_data_t;
import org.libraw.libraw_iparams_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record CameraDetails(String make, String normalizedMake, String model, String normalizedModel, int makerIndex,
                            CameraMaker maker, CameraMetadata metadata) {
    /**
     * Load camera details from the given memory address.
     *
     * @param librawData The segment of memory containing the libraw data.
     * @return the loaded camera details
     */
    public static CameraDetails load(MemorySegment librawData) {
        MemorySegment librawImageParams = libraw_data_t.idata$slice(librawData);

        String make = StringUtil.readNullTerminatedString(libraw_iparams_t.make$slice(librawImageParams).toByteArray());
        String normalizedMake = StringUtil.readNullTerminatedString(libraw_iparams_t.normalized_make$slice(librawImageParams).toByteArray());
        String model = StringUtil.readNullTerminatedString(libraw_iparams_t.model$slice(librawImageParams).toByteArray());
        String normalizedModel = StringUtil.readNullTerminatedString(libraw_iparams_t.normalized_model$slice(librawImageParams).toByteArray());
        int makerIndex = libraw_iparams_t.maker_index$get(librawImageParams);
        CameraMaker maker = CameraMaker.fromValue(makerIndex);
        CameraMetadata metadata = CameraMetadata.load(librawData);

        return new CameraDetails(make, normalizedMake, model, normalizedModel, makerIndex, maker, metadata);
    }
}
