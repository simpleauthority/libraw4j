module dev.jacobandersen.libraw4j.core {
    // Needed at runtime
    requires org.libraw;
    requires org.tinylog.api;
    requires java.desktop;
    requires jdk.incubator.foreign;

    // Needed at compile time
    requires org.jetbrains.annotations;

    // Exports
    exports dev.jacobandersen.libraw4j.core;
    exports dev.jacobandersen.libraw4j.core.data;
    exports dev.jacobandersen.libraw4j.core.data.constants;
    exports dev.jacobandersen.libraw4j.core.data.constants.manufacturer.sony;
    exports dev.jacobandersen.libraw4j.core.data.constants.manufacturer.kodak;
    exports dev.jacobandersen.libraw4j.core.data.constants.manufacturer.hasselblad;
    exports dev.jacobandersen.libraw4j.core.data.constants.manufacturer.canon;
    exports dev.jacobandersen.libraw4j.core.data.component.camera;
    exports dev.jacobandersen.libraw4j.core.data.component.image;
    exports dev.jacobandersen.libraw4j.core.data.component.image.subcomponents;
    exports dev.jacobandersen.libraw4j.core.data.component.lens;
    exports dev.jacobandersen.libraw4j.core.data.component.lens.subcomponents;
    exports dev.jacobandersen.libraw4j.core.data.component.shot;
    exports dev.jacobandersen.libraw4j.core.exception;
}