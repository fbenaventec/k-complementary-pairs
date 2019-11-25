package es.fbenavente.kcomplementaypairs.exception;


public class CustomExceptionFactory {
    private CustomExceptionFactory() {

    }

    @SuppressWarnings("squid:S00112")
    public static <T extends Exception> T instanceOf(Class<T> exceptionClass, String message)  {
        // This implementation could be replaced by a switch based on catalog of custom exceptions, this change
        // has some advantages: it doesn't use reflection; it's not necessary launch a RuntimeException
        try {
            return exceptionClass.getConstructor(String.class).newInstance(message);
        } catch (Exception e) {
            throw new RuntimeException(message, e);
        }
    }

    @SuppressWarnings("squid:S00112")
    public static <T extends Exception> T instanceOf(Class<T> exceptionClass, String message, Throwable throwable) {
        // This implementation could be replaced by a switch based on catalog of custom exceptions, this change
        // has some advantages: it doesn't use reflection; it's not necessary launch a RuntimeException
        try {
            return exceptionClass.getConstructor(String.class, Throwable.class)
                    .newInstance(message, throwable);
        } catch (Exception e) {
            throw new RuntimeException(message, e);
        }
    }
}