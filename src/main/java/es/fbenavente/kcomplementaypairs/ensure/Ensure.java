package es.fbenavente.kcomplementaypairs.ensure;

import es.fbenavente.kcomplementaypairs.exception.CustomExceptionFactory;

public class Ensure {

    private Ensure() {

    }

    public static <T extends Exception> void ensureThatArrayLengthIsGreaterOrEqualThan(
            String[] array,
            int expectedSize,
            String message,
            Class<T> exceptionClass) throws T {
        int currentSize = array != null ? array.length : 0;
        if (currentSize < expectedSize) {
            throw CustomExceptionFactory.instanceOf(exceptionClass, message);
        }
    }

    public static <T extends Exception> void ensureThatIsInteger(
            String value,
            String message,
            Class<T> exceptionClass) throws T {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException numberFormatException) {
            // TODO replace this ensure by other not based on exceptions
            throw CustomExceptionFactory.instanceOf(exceptionClass, message, numberFormatException);
        }
    }
}
