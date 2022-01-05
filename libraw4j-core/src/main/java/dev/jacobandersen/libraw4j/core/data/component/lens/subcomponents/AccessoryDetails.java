package dev.jacobandersen.libraw4j.core.data.component.lens.subcomponents;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record AccessoryDetails(long teleconverterId, String teleconverter, long adapterId, String adapter,
                               long attachmentId, String attachment) {
}
