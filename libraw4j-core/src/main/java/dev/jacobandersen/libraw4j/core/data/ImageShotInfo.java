package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since
 */
public class ImageShotInfo {
    // TODO: these all depend on manufacturer? Hmmm...
    private final short driveMode;
    private final short focusMode;
    private final short meteringMode;
    private final short autofocusPoint;
    private final short exposureMode;
    private final short exposureProgram;
    private final short imageStabilization;
    private final String bodySerialNumber;
    private final String internalBodySerialNumber;

    private ImageShotInfo(short driveMode, short focusMode, short meteringMode, short autofocusPoint, short exposureMode, short exposureProgram, short imageStabilization, String bodySerialNumber, String internalBodySerialNumber) {
        this.driveMode = driveMode;
        this.focusMode = focusMode;
        this.meteringMode = meteringMode;
        this.autofocusPoint = autofocusPoint;
        this.exposureMode = exposureMode;
        this.exposureProgram = exposureProgram;
        this.imageStabilization = imageStabilization;
        this.bodySerialNumber = bodySerialNumber;
        this.internalBodySerialNumber = internalBodySerialNumber;
    }

    public static ImageShotInfo load() {
        // TODO: implement
        return null;
    }
}
