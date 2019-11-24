package es.fbenavente.kcomplementaypairs;


import es.fbenavente.kcomplementaypairs.domain.Pair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.iterableWithSize;

public class KComplementaryPairsTest {

    @ParameterizedTest
    @ArgumentsSource(KComplementaryPairsProvider.class)
    public void given_integer_that_is_equals_to_the_sum_of_two_items_of_an_array_should_return_their_indexes(
            List<Integer> array,
            int k,
            List<Pair<Integer>> expectedResults
    ) {
        KComplementaryPairs kComplementaryPairs = new KComplementaryPairs();

        List<Pair<Integer>> pairs = kComplementaryPairs.getKComplementaryPairs(array, k);

        assertThat(pairs, notNullValue());
        assertThat(pairs, iterableWithSize(expectedResults.size()));
        assertThat(pairs, containsInAnyOrder(expectedResults.toArray()));
    }
}