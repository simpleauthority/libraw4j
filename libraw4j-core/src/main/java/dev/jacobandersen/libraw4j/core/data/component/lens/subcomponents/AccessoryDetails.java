package dev.jacobandersen.libraw4j.core.data.component.lens.subcomponents;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record AccessoryDetails(long teleconverterId, String teleconverter, long adapterId, String adapter,
                               long attachmentId, String attachment) {
    /**
     * The raw id of the teleconverter attached to the lens.
     * @return the teleconverter id or 0 if none is attached
     */
    @Override
    public long teleconverterId() {
        return teleconverterId;
    }

    /**
     * The name of the teleconverter attached to the lens.
     * @return the teleconverter name or empty if none is attached
     */
    @Override
    public String teleconverter() {
        return teleconverter;
    }

    /**
     * The raw id of the adapter attached to the lens.
     * @return the adapter id or 0 if none is attached
     */
    @Override
    public long adapterId() {
        return adapterId;
    }

    /**
     * The name of the adapter attached to the lens.
     * @return the adapter name or empty if none is attached
     */
    @Override
    public String adapter() {
        return adapter;
    }

    /**
     * The raw id of the attachment attached to the lens.
     * @return the attachment id or 0 if none is attached
     */
    @Override
    public long attachmentId() {
        return attachmentId;
    }

    /**
     * The name of the attachment attached to the lens.
     * @return the attachment name or empty if none is attached
     */
    @Override
    public String attachment() {
        return attachment;
    }
}
