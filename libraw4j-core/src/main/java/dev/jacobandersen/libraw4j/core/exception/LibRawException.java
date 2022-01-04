package dev.jacobandersen.libraw4j.core.exception;

/**
 * Represents an error that occurred while processing a LibRaw image.
 *
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public class LibRawException extends RuntimeException {
    public LibRawException(String message) {
        super(message);
    }
}
