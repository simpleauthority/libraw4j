package dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer;

import dev.jacobandersen.libraw4j.data.constants.CameraMaker;
import dev.jacobandersen.libraw4j.data.constants.CameraMaker2Metadata;
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
    public static ManufacturerMetadata load(CameraMaker cameraMaker, MemorySegment makernotes) {
        CanonMetadata canon = null;
        FujiMetadata fuji = null;
        HasselbladMetadata hasselblad = null;
        KodakMetadata kodak = null;
        NikonMetadata nikon = null;
        OlympusMetadata olympus = null;
        PanasonicMetadata panasonic = null;
        PentaxMetadata pentax = null;
        PhaseOneMetadata phaseOne = null;
        SamsungMetadata samsung = null;
        SonyMetadata sony = null;

        Class<?> metadataClass = CameraMaker2Metadata.metadataClassByCameraMaker(cameraMaker);
        if (metadataClass != null) {
            switch (metadataClass.getSimpleName()) {
                case "CanonMetadata" -> canon = CanonMetadata.load(libraw_makernotes_t.canon$slice(makernotes));
                case "FujiMetadata" -> fuji = FujiMetadata.load(libraw_makernotes_t.fuji$slice(makernotes));
                case "HasselbladMetadata" -> hasselblad = HasselbladMetadata.load(libraw_makernotes_t.hasselblad$slice(makernotes));
                case "KodakMetadata" -> kodak = KodakMetadata.load(libraw_makernotes_t.kodak$slice(makernotes));
                case "NikonMetadata" -> nikon = NikonMetadata.load(libraw_makernotes_t.nikon$slice(makernotes));
                case "OlympusMetadata" -> olympus = OlympusMetadata.load(libraw_makernotes_t.olympus$slice(makernotes));
                case "PanasonicMetadata" -> panasonic = PanasonicMetadata.load(libraw_makernotes_t.panasonic$slice(makernotes));
                case "PentaxMetadata" -> pentax = PentaxMetadata.load(libraw_makernotes_t.pentax$slice(makernotes));
                case "PhaseOneMetadata" -> phaseOne = PhaseOneMetadata.load(libraw_makernotes_t.phaseone$slice(makernotes));
                case "SamsungMetadata" -> samsung = SamsungMetadata.load(libraw_makernotes_t.samsung$slice(makernotes));
                case "SonyMetadata" -> sony = SonyMetadata.load(libraw_makernotes_t.sony$slice(makernotes));
                default -> throw new IllegalStateException("Unexpected value: " + metadataClass.getSimpleName());
            }
        }

        return new ManufacturerMetadata(canon, fuji, hasselblad, kodak, nikon,
                olympus, panasonic, pentax, phaseOne, samsung, sony);
    }
}
