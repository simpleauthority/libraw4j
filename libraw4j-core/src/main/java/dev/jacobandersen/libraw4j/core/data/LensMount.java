package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum LensMount {
    UNKNOWN(0),
    ALPA(1),
    C(2),  // C-mount
    CANON_EF(3),
    CANON_EF_M(4),
    CANON_EF_S(5),
    CANON_RF(6),
    CONTAX_N(7),
    CONTAX645(8),
    FT(9), // original 4/3
    MFT(10), // micro 4/3
    FUJI_GF(11), // Fujifilm GFX cameras, G mount
    FUJI_GX(12), // Fujifilm GX680
    FUJI_X(13),
    HASSELBLAD_H(14), // Hasselblad Hn cameras, HC & HCD lenses
    HASSELBLAD_V(15),
    HASSELBLAD_XCD(16), // Hasselblad Xn cameras, XCD lenses
    LEICA_M(17),  // Leica rangefinder bayonet
    LEICA_R(18), // Leica SLRs, 'R' for reflex
    LEICA_S(19), // LIBRAW_FORMAT_LeicaS 'MF'
    LEICA_SL(20),  // lens, mounts on 'L' throat, FF
    LEICA_TL(21), // lens, mounts on 'L' throat, APS-C
    LPS_L(22), // Leica/Panasonic/Sigma camera mount, takes L, SL and TL lenses
    MAMIYA67(23), // Mamiya RB67, RZ67
    MAMIYA645(24),
    MINOLTA_A(25),
    NIKON_CX(26), // Nikon 1 series
    NIKON_F(27),
    NIKON_Z(28),
    PENTAX_645(29),
    PENTAX_K(30),
    PENTAX_Q(31),
    RICOHMODULE(32),
    ROLLEI_BAYONET(33), // used in Rollei Hy-6: Leaf AFi, Sinar Hy6 models
    SAMSUNG_NX_M(34),
    SAMSUNG_NX(35),
    SIGMA_X3F(36),
    SONY_E(37),
    LF(38),
    DIGITALBACK(39),
    FIXEDLENS(40), // lens is fixed
    INTERCHANGEABLE_UNKNOWN(41), // definitely interchangeable but unknown mount
    THELASTONE(42);  // no idea what this is but it's in the libraw headers

    private final int value;

    LensMount(int value) {
        this.value = value;
    }

    public static LensMount fromValue(int value) {
        for (LensMount mount : values()) {
            if (mount.value == value) {
                return mount;
            }
        }

        throw new IllegalArgumentException("Unknown lens mount value: " + value);
    }
}
