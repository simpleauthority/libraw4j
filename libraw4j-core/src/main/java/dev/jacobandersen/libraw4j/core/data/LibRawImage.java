package dev.jacobandersen.libraw4j.core.data;

import com.google.common.base.Preconditions;
import dev.jacobandersen.libraw4j.core.LibRaw;
import dev.jacobandersen.libraw4j.core.exception.LibRawException;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
import org.jetbrains.annotations.NotNull;
import org.libraw.libraw_h;
import org.tinylog.Logger;

import java.io.File;

/**
 * Represents a raw image that has been loaded by LibRaw. This is the base class for the library.
 *
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public final class LibRawImage {
    private final CameraDetails camera;
    private final ImageDetails image;

    public LibRawImage(CameraDetails camera, ImageDetails image) {
        this.camera = camera;
        this.image = image;
    }

    public CameraDetails getCamera() {
        return camera;
    }

    public ImageDetails getImage() {
        return image;
    }
}
