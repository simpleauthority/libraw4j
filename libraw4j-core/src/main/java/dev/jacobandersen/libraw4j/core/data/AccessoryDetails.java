package dev.jacobandersen.libraw4j.core.data;

/**
 * @author Jacob Andersen
 * @since
 */
public final class AccessoryDetails {
    private final long teleconverterId;
    private final String teleconverter;
    private final long adapterId;
    private final String adapter;
    private final long attachmentId;
    private final String attachment;

    private AccessoryDetails(long teleconverterId, String teleconverter, long adapterId, String adapter, long attachmentId, String attachment) {
        this.teleconverterId = teleconverterId;
        this.teleconverter = teleconverter;
        this.adapterId = adapterId;
        this.adapter = adapter;
        this.attachmentId = attachmentId;
        this.attachment = attachment;
    }

    static AccessoryDetails load() {

        // TODO: implement
        return null;
    }
}
