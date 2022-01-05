package dev.jacobandersen.libraw4j.core.exception;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public class LibRawExceptionCancelledByCallback extends LibRawException {
    public LibRawExceptionCancelledByCallback(String message) {
        super(message);
    }
}
