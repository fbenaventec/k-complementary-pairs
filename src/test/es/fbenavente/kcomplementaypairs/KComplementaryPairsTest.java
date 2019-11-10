package es.fbenavente.kcomplementaypairs;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class KComplementaryPairsTest {
    @Test
    public void given_integer_that_is_equals_to_the_sum_of_two_items_of_an_array_should_return_their_indexes() {
        KComplementaryPairs kComplementaryPairs = new KComplementaryPairs();

        List<Pair<Integer>> pairs = kComplementaryPairs.getKComplementaryPairs(Arrays.asList(1, 5, 9), 10);

        assertThat(pairs, notNullValue());
        assertThat(pairs.size(), equalTo(1));
        assertThat(pairs, hasItem(equalTo(new Pair(0,2))));
    }
}