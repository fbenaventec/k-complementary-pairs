package es.fbenavente.kcomplementaypairs.commandline;

import es.fbenavente.kcomplementaypairs.commandline.KComplementaryPairsCommandLine;
import es.fbenavente.kcomplementaypairs.exception.ArgumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class KComplementaryPairsCommandLineTest {

    @Test
    public void when_calls_main_program_without_parameters_expected_an_exception() {
        assertThrows(ArgumentException.class, KComplementaryPairsCommandLine::main);
    }

    @Test
    public void when_calls_main_program_with_invalid_k_expected_an_exception() {
        assertThrows(ArgumentException.class, () -> KComplementaryPairsCommandLine.main("d" ,"1,2,3"));
    }

    @Test
    public void when_calls_main_program_with_invalid_value_expected_an_exception() {
        assertThrows(ArgumentException.class, () -> KComplementaryPairsCommandLine.main("3", "n,2,3"));
    }

    @SuppressWarnings("squid:S2699")
    @Test
    public void when_calls_main_program_with_valid_parameters_expected_no_errors() throws ArgumentException {
        KComplementaryPairsCommandLine.main("3", "1,2,3");
    }
}
