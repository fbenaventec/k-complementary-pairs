package es.fbenavente.kcomplementaypairs.exception;

public class ErrorCatalog {
    public static final String ARGUMENTS_MISSING = "Missing arguments: K and values are mandatory, " +
            "expected k as first parameter (integer), and values as second (integers separated by comma).";
    public static final String K_SHOULD_BE_AN_INTEGER = "K parameter should be an integer.";
    public static final String VALUE_SHOULD_BE_AN_INTEGER = "Values parameter should be an integer.";
    private ErrorCatalog() {

    }
}
