package dev.jacobandersen.libraw4j.data.constants;

import org.tinylog.Logger;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum CameraMaker {
    UNKNOWN(0),
    AGFA(1),
    ALCATEL(2),
    APPLE(3),
    APTINA(4),
    AVT(5),
    BAUMER(6),
    BROADCOM(7),
    CANON(8),
    CASIO(9),
    CINE(10),
    CLAUSS(11),
    CONTAX(12),
    CREATIVE(13),
    DJI(14),
    DXO(15),
    EPSON(16),
    FOCULUS(17),
    FUJIFILM(18),
    GENERIC(19),
    GIONE(20),
    GITUP(21),
    GOOGLE(22),
    GOPRO(23),
    HASSELBLAD(24),
    HTC(25),
    I_MOBILE(26),
    IMACON(27),
    JK_IMAGING(28),
    KODAK(29),
    KONICA(30),
    LEAF(31),
    LEICA(32),
    LENOVO(33),
    LG(34),
    LOGITECH(35),
    MAMIYA(36),
    MATRIX(37),
    MEIZU(38),
    MICRON(39),
    MINOLTA(40),
    MOTOROLA(41),
    NGM(42),
    NIKON(43),
    NOKIA(44),
    OLYMPUS(45),
    OMNIVISON(46),
    PANASONIC(47),
    PARROT(48),
    PENTAX(49),
    PHASEONE(50),
    PHOTOCONTROL(51),
    PHOTRON(52),
    PIXELINK(53),
    POLAROID(54),
    RED(55),
    RICOH(56),
    ROLLEI(57),
    ROVERSHOT(58),
    SAMSUNG(59),
    SIGMA(60),
    SINAR(61),
    SMAL(62),
    SONY(63),
    ST_MICRO(64),
    THL(65),
    VLUU(66),
    XIAOMI(67),
    XIAOYI(68),
    YI(69),
    YUNEEC(70),
    ZEISS(71);

    private final int value;

    CameraMaker(int value) {
        this.value = value;
    }

    public static CameraMaker fromValue(int value) {
        for (CameraMaker maker : values()) {
            if (maker.value == value) {
                return maker;
            }
        }

        Logger.warn("Unknown camera maker value: {}", value);

        return UNKNOWN;
    }
}
