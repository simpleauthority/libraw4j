package dev.jacobandersen.libraw4j.core.data.manufacturer.kodak;

/**
 * @author Jacob Andersen
 * @since
 */
public enum KodakSensor {
    UnknownSensor(0),
    M1(1),
    M15(2),
    M16(3),
    M17(4),
    M2(5),
    M23(6),
    M24(7),
    M3(8),
    M5(9),
    M6(10),
    C14(11),
    X14(12),
    M11(13);

    private final int value;

    KodakSensor(int value) {
        this.value = value;
    }

    public static KodakSensor fromValue(int value) {
        for (KodakSensor sensor : KodakSensor.values()) {
            if (sensor.value == value) {
                return sensor;
            }
        }

        throw new IllegalArgumentException("Unknown sensor value: " + value);
    }
}
