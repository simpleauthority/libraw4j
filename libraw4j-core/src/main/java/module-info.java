module dev.jacobandersen.libraw4j.core {
    // Needed at runtime
    requires org.libraw;
    requires org.tinylog.api;
    requires com.google.common;
    requires jdk.incubator.foreign;

    // Needed at compile time
    requires org.jetbrains.annotations;

    exports dev.jacobandersen.libraw4j.core;
    exports dev.jacobandersen.libraw4j.core.data;
    exports dev.jacobandersen.libraw4j.core.data.manufacturer.sony;
    exports dev.jacobandersen.libraw4j.core.data.manufacturer.kodak;
    exports dev.jacobandersen.libraw4j.core.data.manufacturer.hasselblad;
    exports dev.jacobandersen.libraw4j.core.data.manufacturer.canon;
}