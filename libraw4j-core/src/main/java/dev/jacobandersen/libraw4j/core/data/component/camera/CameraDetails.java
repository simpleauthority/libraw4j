package dev.jacobandersen.libraw4j.core.data.component.camera;

import dev.jacobandersen.libraw4j.core.data.component.camera.subcomponents.CameraMetadata;
import dev.jacobandersen.libraw4j.core.data.constants.CameraMaker;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import org.libraw.libraw_h;
import org.libraw.libraw_iparams_t;

import java.nio.charset.StandardCharsets;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record CameraDetails(String make, String normalizedMake, String model, String normalizedModel, int makerIndex,
                            CameraMaker maker, CameraMetadata metadata) {
    /**
     * Load camera details from the given memory address.
     *
     * @param libraw the libraw instance
     * @param scope the scope to use
     *
     * @return the loaded camera details
     */
    public static CameraDetails load(MemoryAddress libraw, ResourceScope scope) {
        MemorySegment data = libraw_iparams_t.ofAddress(libraw_h.libraw_get_iparams(libraw), scope);

        String make = new String(libraw_iparams_t.make$slice(data).toByteArray(), StandardCharsets.UTF_8);
        String normalizedMake = new String(libraw_iparams_t.normalized_make$slice(data).toByteArray(), StandardCharsets.UTF_8);
        String model = new String(libraw_iparams_t.model$slice(data).toByteArray(), StandardCharsets.UTF_8);
        String normalizedModel = new String(libraw_iparams_t.normalized_model$slice(data).toByteArray(), StandardCharsets.UTF_8);
        int makerIndex = libraw_iparams_t.maker_index$get(data);
        CameraMaker maker = CameraMaker.fromValue(makerIndex);
        CameraMetadata metadata = CameraMetadata.load(libraw, scope);

        return new CameraDetails(make, normalizedMake, model, normalizedModel, makerIndex, maker, metadata);
    }

    /**
     * Get the make of the camera.
     *
     * @return the make of the camera
     */
    @Override
    public String make() {
        return make;
    }

    /**
     * Get the normalized make of the camera.
     * <p>The "primary" make.</p>
     * <p>From libraw: There is a huge number of identical cameras sold under different names, depending on the market
     * (e.g. multiple Panasonic or Canon models) and even some identical cameras sold under different brands (Panasonic
     * -> Leica, Sony -> Hasselblad). normalized_make contains primary vendor name (e.g. Panasonic for Leica re-branded
     * cameras).</p>
     *
     * @return the normalized make of the camera
     */
    @Override
    public String normalizedMake() {
        return normalizedMake;
    }

    /**
     * Get the model of the camera.
     *
     * @return the model of the camera
     */
    @Override
    public String model() {
        return model;
    }

    /**
     * Get the normalized model of the camera.
     * <p>The "primary" model.</p>
     *
     * @return the normalized model of the camera
     * @see #normalizedMake() for more information about normalization.
     */
    @Override
    public String normalizedModel() {
        return normalizedModel;
    }

    /**
     * Get the raw index of the camera maker. This is the index of the camera maker in the {@link CameraMaker} enum.
     * <p>This is provided in case resolution of the vendor fails. You probably want {@link #maker()}.</p>
     *
     * @return the raw index of the camera maker
     */
    public int makerIndex() {
        return makerIndex;
    }

    /**
     * Get the camera maker.
     *
     * @return the camera maker
     */
    public CameraMaker maker() {
        return maker;
    }
}
