package es.fbenavente.kcomplementaypairs;

import es.fbenavente.kcomplementaypairs.domain.Pair;

import java.util.ArrayList;
import java.util.List;

public class KComplementaryPairs {
    public List<Pair<Integer>> getKComplementaryPairs(List<Integer> values, int k) {
        List<Pair<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            int iValue = values.get(i);
            for (int j = i + 1; j < values.size(); j++) {
                int jValue = values.get(j);
                if (isPairKComplementary(k, iValue, jValue)) {
                    pairs.add(new Pair<>(i, j));
                }
            }
        }
        return pairs;
    }

    private boolean isPairKComplementary(int k, int iValue, int jValue) {
        return k == iValue + jValue;
    }
}
