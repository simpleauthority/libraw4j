package dev.jacobandersen.libraw4j.data.constants;

import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.CanonMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.FujiMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.HasselbladMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.KodakMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.NikonMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.OlympusMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.PanasonicMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.PentaxMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.PhaseOneMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.SamsungMetadata;
import dev.jacobandersen.libraw4j.data.component.camera.subcomponents.manufacturer.SonyMetadata;
import org.tinylog.Logger;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum CameraMaker2Metadata {
    CANON(CameraMaker.CANON, CanonMetadata.class),
    FUJIFILM(CameraMaker.FUJIFILM, FujiMetadata.class),
    HASSELBLAD(CameraMaker.HASSELBLAD, HasselbladMetadata.class),
    KODAK(CameraMaker.KODAK, KodakMetadata.class),
    NIKON(CameraMaker.NIKON, NikonMetadata.class),
    OLYMPUS(CameraMaker.OLYMPUS, OlympusMetadata.class),
    PANASONIC(CameraMaker.PANASONIC, PanasonicMetadata.class),
    PENTAX(CameraMaker.PENTAX, PentaxMetadata.class),
    PHASEONE(CameraMaker.PHASEONE, PhaseOneMetadata.class),
    SAMSUNG(CameraMaker.SAMSUNG, SamsungMetadata.class),
    SONY(CameraMaker.SONY, SonyMetadata.class);

    private final CameraMaker maker;
    private final Class<?> metadataClass;

    CameraMaker2Metadata(CameraMaker maker, Class<?> metadataClass) {
        this.maker = maker;
        this.metadataClass = metadataClass;
    }

    public static Class<?> metadataClassByCameraMaker(CameraMaker cameraMaker) {
        for (CameraMaker2Metadata maker : values()) {
            if (maker.maker == cameraMaker) {
                return maker.metadataClass;
            }
        }

        Logger.warn("No metadata class found for camera maker: {}", cameraMaker);
        return null;
    }
}
