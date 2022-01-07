package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_makernotes_t;

/**
 * A record holding all manufacturer-specific metadata. Not all fields contain data. Check the camera maker first.
 *
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ManufacturerMetadata(CanonMetadata canon, FujiMetadata fuji, HasselbladMetadata hasselblad,
                                   KodakMetadata kodak, NikonMetadata nikon, OlympusMetadata olympus,
                                   PanasonicMetadata panasonic, PentaxMetadata pentax, PhaseOneMetadata phaseOne,
                                   SamsungMetadata samsung, SonyMetadata sony) {

    /**
     * Loads the manufacturer metadata from the given memory segment.
     *
     * @param makernotes the makernotes memory segment
     * @return the manufacturer metadata
     */
    public static ManufacturerMetadata load(MemorySegment makernotes) {
        CanonMetadata canon = CanonMetadata.load(libraw_makernotes_t.canon$slice(makernotes));
        FujiMetadata fuji = FujiMetadata.load(libraw_makernotes_t.fuji$slice(makernotes));
        HasselbladMetadata hasselblad = HasselbladMetadata.load(libraw_makernotes_t.hasselblad$slice(makernotes));
        KodakMetadata kodak = KodakMetadata.load(libraw_makernotes_t.kodak$slice(makernotes));
        NikonMetadata nikon = NikonMetadata.load(libraw_makernotes_t.nikon$slice(makernotes));
        OlympusMetadata olympus = OlympusMetadata.load(libraw_makernotes_t.olympus$slice(makernotes));
        PanasonicMetadata panasonic = PanasonicMetadata.load(libraw_makernotes_t.panasonic$slice(makernotes));
        PentaxMetadata pentax = PentaxMetadata.load(libraw_makernotes_t.pentax$slice(makernotes));
        PhaseOneMetadata phaseOne = PhaseOneMetadata.load(libraw_makernotes_t.phaseone$slice(makernotes));
        SamsungMetadata samsung = SamsungMetadata.load(libraw_makernotes_t.samsung$slice(makernotes));
        SonyMetadata sony = SonyMetadata.load(libraw_makernotes_t.sony$slice(makernotes));

        return new ManufacturerMetadata(canon, fuji, hasselblad, kodak, nikon, olympus, panasonic, pentax, phaseOne, samsung, sony);
    }
}
