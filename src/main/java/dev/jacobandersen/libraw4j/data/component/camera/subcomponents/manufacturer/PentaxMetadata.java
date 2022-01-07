package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_pentax_makernotes_t;
import org.tinylog.Logger;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record PentaxMetadata(short focusMode, short autofocusPointSelected, int autofocusPointsInFocus,
                             short focusPosition, byte[] driveMode, short autofocusAdjustment, byte multiExposure,
                             short rawQuality, PentaxQuality quality) {

    /**
     * Load the Pentax makernotes from the given memory segment.
     *
     * @param data the Pentax makernotes memory segment
     * @return the Pentax makernotes
     */
    public static PentaxMetadata load(MemorySegment data) {
        short focusMode = libraw_pentax_makernotes_t.FocusMode$get(data);
        short autofocusPointSelected = libraw_pentax_makernotes_t.AFPointSelected$get(data);
        int autofocusPointsInFocus = libraw_pentax_makernotes_t.AFPointsInFocus$get(data);
        short focusPosition = libraw_pentax_makernotes_t.FocusPosition$get(data);
        byte[] driveMode = libraw_pentax_makernotes_t.DriveMode$slice(data).toByteArray();
        short autofocusAdjustment = libraw_pentax_makernotes_t.AFAdjustment$get(data);
        byte multiExposure = libraw_pentax_makernotes_t.MultiExposure$get(data);
        short rawQuality = libraw_pentax_makernotes_t.Quality$get(data);
        PentaxQuality quality = PentaxQuality.fromValue(rawQuality);

        return new PentaxMetadata(focusMode, autofocusPointSelected, autofocusPointsInFocus, focusPosition, driveMode,
                autofocusAdjustment, multiExposure, rawQuality, quality);
    }

    public enum PentaxQuality {
        RAW(4),
        RAW_PIXEL_SHIFT(7),
        RAW_DYNAMIC_PIXEL_SHIFT(8),
        UNKNOWN(-1);

        private int value;

        PentaxQuality(int value) {
            this.value = value;
        }

        public static PentaxQuality fromValue(int value) {
            for (PentaxQuality quality : values()) {
                if (quality.value == value) {
                    return quality;
                }
            }

            Logger.warn("Unknown Pentax quality value: {}", value);
            return UNKNOWN;
        }
    }
}
