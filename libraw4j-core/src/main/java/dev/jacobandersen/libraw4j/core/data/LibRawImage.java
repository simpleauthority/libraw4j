package dev.jacobandersen.libraw4j.core.data;

import dev.jacobandersen.libraw4j.core.data.component.camera.CameraDetails;
import dev.jacobandersen.libraw4j.core.data.component.image.ImageDetails;
import dev.jacobandersen.libraw4j.core.data.component.lens.LensDetails;
import dev.jacobandersen.libraw4j.core.data.component.shot.ShotDetails;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

/**
 * Represents a raw image that has been loaded by LibRaw. This is the base class for the library.
 *
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public final class LibRawImage {
    private final CameraDetails camera;
    private final LensDetails lens;
    private final ImageDetails image;
    private final ShotDetails shot;

    /**
     * Reads a raw image from the given memory address and sets all the fields.
     *
     * @param libraw the libraw instance to use
     * @param scope the scope to use
     */
    public LibRawImage(MemoryAddress libraw, ResourceScope scope) {
        this(
                CameraDetails.load(libraw, scope),
                LensDetails.load(libraw, scope),
                ImageDetails.load(libraw, scope),
                ShotDetails.load(libraw, scope)
        );
    }

    public LibRawImage(CameraDetails camera, LensDetails lens, ImageDetails image, ShotDetails shot) {
        this.camera = camera;
        this.lens = lens;
        this.image = image;
        this.shot = shot;
    }

    public CameraDetails getCamera() {
        return camera;
    }

    public LensDetails getLens() {
        return lens;
    }

    public ImageDetails getImage() {
        return image;
    }

    public ShotDetails getShot() {
        return shot;
    }
}
