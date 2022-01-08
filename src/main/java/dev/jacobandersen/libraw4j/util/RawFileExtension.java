package dev.jacobandersen.libraw4j.util;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum RawFileExtension {
    // Hasselblad
    HASSELBLAD_3FR("3fr"),
    // Arri Alexa
    ARI("ari"),
    // Sony
    ARW("arw"),
    SRF("srf"),
    SR2("sr2"),
    // Casio
    BAY("bay"),
    // Blackmagic Design
    BRAW("braw"),
    // Cintel
    CRI("cri"),
    // Canon
    CRW("crw"),
    CR2("cr2"),
    CR3("cr3"),
    // Phase One
    CAP("cap"),
    IIQ("iiq"),
    EIP("eip"),
    // Kodak
    DCS("dcs"),
    DCR("dcr"),
    DRF("drf"),
    K25("k25"),
    KDC("kdc"),
    // Adobe
    DNG("dng"),
    // Epson
    ERF("erf"),
    // Imacon/Hasselblad
    FFF("fff"),
    // GoPro
    GPR("gpr"),
    // JPEG XS
    JXS("jxs"),
    // Mamiya
    MEF("mef"),
    // Minolta, Agfa
    MDC("mdc"),
    // Leaf
    MOS("mos"),
    // Minolta, Konica Minolta
    MRW("mrw"),
    // Nikon
    NEF("nef"),
    NRW("nrw"),
    // Olympus
    ORF("orf"),
    // Pentax
    PEF("pef"),
    PTX("ptx"),
    // Logitech
    PXN("pxn"),
    // RED Digital Cinema
    R3D("R3D"),
    // Fuji
    RAF("raf"),
    // Panasonic
    RAW("raw"),
    RW2("rw2"),
    // Rawzor
    RWZ("rwz"),
    // Samsung
    SRW("srw"),
    // intoPIX
    TCO("tco"),
    // Sigma
    X3F("x3f");

    private final String extension;

    RawFileExtension(final String extension) {
        this.extension = extension;
    }

    public final String getExtension() {
        return extension;
    }

    public static List<String> getExtensions() {
        return Arrays.stream(RawFileExtension.values()).map(RawFileExtension::getExtension).toList();
    }
}
