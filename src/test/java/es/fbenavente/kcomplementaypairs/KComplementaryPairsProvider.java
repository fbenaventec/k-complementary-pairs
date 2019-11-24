package es.fbenavente.kcomplementaypairs;

import es.fbenavente.kcomplementaypairs.domain.Pair;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class KComplementaryPairsProvider implements ArgumentsProvider {

    @Override
    public Stream<Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(
                        asList(1, 5, 9),
                        10,
                        asList(new Pair<>(0, 2))),
                Arguments.of(
                        asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                        10,
                        asList(
                                new Pair<>(1, 9),
                                new Pair<>(2, 8),
                                new Pair<>(3, 7),
                                new Pair<>(4, 6)
                        )
                )
        );
    }
}