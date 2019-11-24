package es.fbenavente.kcomplementaypairs.domain;

import lombok.Data;

import java.util.List;

@Data
public class KComplementaryPairsRequest {
    private List<Integer> values;
    private int k;
}
