package es.fbenavente.kcomplementaypairs.exception;


public class CustomExceptionFactory {
    public static <T extends Exception> T instanceOf(Class<T> exceptionClass, String message) {
        try {
            return exceptionClass.getConstructor(String.class).newInstance(message);
        } catch (Exception e) {
            throw new RuntimeException(message, e);
        }
    }

    public static <T extends Exception> T instanceOf(Class<T> exceptionClass, String message, Throwable throwable) {
        try {
            return exceptionClass.getConstructor(String.class, Throwable.class)
                    .newInstance(message, throwable);
        } catch (Exception e) {
            throw new RuntimeException(message, e);
        }
    }
}