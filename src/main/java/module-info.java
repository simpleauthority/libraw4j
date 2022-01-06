/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
module dev.jacobandersen.libraw4j {
    requires org.tinylog.api;
    requires org.tinylog.impl;
    requires java.desktop;
    requires jdk.incubator.foreign;
    requires org.jetbrains.annotations;

    exports dev.jacobandersen.libraw4j.data;
    exports dev.jacobandersen.libraw4j.data.constants;
    exports dev.jacobandersen.libraw4j.data.constants.manufacturer.sony;
    exports dev.jacobandersen.libraw4j.data.constants.manufacturer.kodak;
    exports dev.jacobandersen.libraw4j.data.constants.manufacturer.hasselblad;
    exports dev.jacobandersen.libraw4j.data.constants.manufacturer.canon;
    exports dev.jacobandersen.libraw4j.data.component.camera;
    exports dev.jacobandersen.libraw4j.data.component.image;
    exports dev.jacobandersen.libraw4j.data.component.image.subcomponents;
    exports dev.jacobandersen.libraw4j.data.component.lens;
    exports dev.jacobandersen.libraw4j.data.component.lens.subcomponents;
    exports dev.jacobandersen.libraw4j.data.component.shot;
    exports dev.jacobandersen.libraw4j.exception;
}