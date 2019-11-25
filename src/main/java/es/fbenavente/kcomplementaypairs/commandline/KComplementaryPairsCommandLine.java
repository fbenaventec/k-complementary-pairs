package es.fbenavente.kcomplementaypairs.commandline;

import es.fbenavente.kcomplementaypairs.KComplementaryPairs;
import es.fbenavente.kcomplementaypairs.domain.Pair;
import es.fbenavente.kcomplementaypairs.ensure.Ensure;
import es.fbenavente.kcomplementaypairs.exception.ArgumentException;

import java.util.ArrayList;
import java.util.List;

import static es.fbenavente.kcomplementaypairs.ensure.Ensure.ensureThatArrayLengthIsGreaterOrEqualThan;
import static es.fbenavente.kcomplementaypairs.exception.ErrorCatalog.ARGUMENTS_MISSING;
import static es.fbenavente.kcomplementaypairs.exception.ErrorCatalog.K_SHOULD_BE_AN_INTEGER;

public class KComplementaryPairsCommandLine {

    private static final String VALUES_SEPARATOR = "\\s*,\\s*";

    @SuppressWarnings("squid:S106")
    public static void main (String ... args) throws ArgumentException {
        KComplementaryPairs kComplementaryPairs = new KComplementaryPairs();
        ensureThatArrayLengthIsGreaterOrEqualThan(args, 2, ARGUMENTS_MISSING, ArgumentException.class);
        int k = parseK(args[0]);
        List<Integer> values = parseValues(args[1]);
        List<Pair<Integer>> result = kComplementaryPairs.getKComplementaryPairs(values, k);
        System.out.println(result);
    }

    private static int parseK(String argument) throws ArgumentException {
        Ensure.ensureThatIsInteger(argument, K_SHOULD_BE_AN_INTEGER, ArgumentException.class);
        return Integer.parseInt(argument);
    }

    private static List<Integer> parseValues(String argument) throws ArgumentException {
        String [] valuesArray = argument.split(VALUES_SEPARATOR);
        List<Integer> values = new ArrayList<>();
        for (String value: valuesArray) {
            Ensure.ensureThatIsInteger(value, K_SHOULD_BE_AN_INTEGER, ArgumentException.class);
            values.add(Integer.parseInt(value));
        }
        return values;
    }
}
