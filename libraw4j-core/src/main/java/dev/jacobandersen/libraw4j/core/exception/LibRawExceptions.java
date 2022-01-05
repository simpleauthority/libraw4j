package dev.jacobandersen.libraw4j.core.exception;

import org.tinylog.Logger;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public enum LibRawExceptions {
    NONE(0, LibRawException.class, "An unknown error occurred in LibRaw."),
    ALLOC(1, LibRawExceptionAllocation.class, "An error occurred while allocating memory."),
    DECODE_RAW(2, LibRawExceptionDecodeRaw.class, "An error occurred while decoding raw data."),
    DECODE_JPEG(3, LibRawExceptionDecodeJpeg.class, "An error occurred while decoding JPEG data."),
    IO_EOF(4, LibRawExceptionIOEOF.class, "An error occurred while reading from the input stream."),
    IO_CORRUPT(5, LibRawExceptionIOCorruptFile.class, "The input file is corrupt."),
    CANCELLED_BY_CALLBACK(6, LibRawExceptionCancelledByCallback.class, "The operation was cancelled by the user."),
    BAD_CROP(7, LibRawExceptionBadCrop.class, "The crop rectangle is invalid."),
    IO_BADFILE(8, LibRawExceptionIOBadFile.class, "The input file is not a valid raw file."),
    DECODE_JPEG2000(9, LibRawExceptionDecodeJpeg2000.class, "An error occurred while decoding JPEG2000 data."),
    TOOBIG(10, LibRawExceptionTooBig.class, "The input file is too big."),
    MEMPOOL(11, LibRawExceptionMemPool.class, "An error occurred in the memory pool.");

    private final int code;
    private final Class<? extends LibRawException> exceptionClass;
    private final String defaultMessage;

    LibRawExceptions(int code, Class<? extends LibRawException> exceptionClass, String defaultMessage) {
        this.code = code;
        this.exceptionClass = exceptionClass;
        this.defaultMessage = defaultMessage;
    }

    private static LibRawExceptions getByCode(int code) {
        for (LibRawExceptions e : LibRawExceptions.values()) {
            if (e.code == code) {
                return e;
            }
        }

        Logger.warn("Unknown LibRawException code: {}", code);
        return NONE;
    }

    public static void throwByCode(int code) {
        throwByCode(code, null);
    }

    public static void throwByCode(int code, String message) throws LibRawException {
        LibRawExceptions constant = getByCode(code);

        LibRawException exception = null;

        try {
            exception = getByCode(code).exceptionClass.getConstructor(String.class)
                    .newInstance(message == null ? constant.defaultMessage : message);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException exceptionWhileFindingException) {
            // This is an authentic bruh moment.
            Logger.error(exceptionWhileFindingException, "An error occurred while finding the LibRaw exception class.");
        }

        if (exception == null) {
            Logger.warn("An unknown LibRawException occurred with code {}.", code);
        } else {
            throw exception;
        }
    }
}
