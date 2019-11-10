package es.fbenavente.kcomplementaypairs;

import lombok.Value;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@Value
@RunWith(Parameterized.class)
public class KComplementaryPairsTest {

    private final List<Integer> array;
    private final int k;
    private final List<Pair<Integer>> expectedResults;

    @Parameters
    public static Collection<Object[]> data() {
        return asList(new Object[][]{
                {asList(1, 5, 9), 10, asList(new Pair<>(0, 2))}
        });
    }

    @Test
    public void given_integer_that_is_equals_to_the_sum_of_two_items_of_an_array_should_return_their_indexes() {
        KComplementaryPairs kComplementaryPairs = new KComplementaryPairs();

        List<Pair<Integer>> pairs = kComplementaryPairs.getKComplementaryPairs(array, k);

        assertThat(pairs, notNullValue());
        assertThat(pairs.size(), equalTo(1));
        assertThat(pairs, Matchers.containsInAnyOrder(expectedResults.toArray()));
    }
}