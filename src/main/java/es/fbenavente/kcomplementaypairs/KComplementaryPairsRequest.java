package es.fbenavente.kcomplementaypairs;

import lombok.Value;

import java.util.List;

@Value
public class KComplementaryPairsRequest {
    private final List<Integer> values;
    private final int k;
}
