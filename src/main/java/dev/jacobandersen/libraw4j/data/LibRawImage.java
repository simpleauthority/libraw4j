package dev.jacobandersen.libraw4j.data;

import dev.jacobandersen.libraw4j.data.component.camera.CameraDetails;
import dev.jacobandersen.libraw4j.data.component.image.ImageDetails;
import dev.jacobandersen.libraw4j.data.component.lens.LensDetails;
import dev.jacobandersen.libraw4j.data.component.shot.ShotDetails;
import jdk.incubator.foreign.MemorySegment;

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
     * @param librawData The segment of memory containing the libraw data.
     */
    public LibRawImage(MemorySegment librawData) {
        this(
                CameraDetails.load(librawData),
                LensDetails.load(librawData),
                ImageDetails.load(librawData),
                ShotDetails.load(librawData)
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

    @Override
    public String toString() {
        return "LibRawImage{" +
                "camera=" + camera +
                ", lens=" + lens +
                ", image=" + image +
                ", shot=" + shot +
                '}';
    }
}
