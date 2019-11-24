package es.fbenavente.kcomplementaypairs;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.List;

public class KComplementaryPairsRequestHandler implements RequestHandler<KComplementaryPairsRequest, List<Pair<Integer>>> {
    private final KComplementaryPairs kComplementaryPairs = new KComplementaryPairs();
    @Override
    public List<Pair<Integer>> handleRequest(KComplementaryPairsRequest request, Context context) {
        return kComplementaryPairs.getKComplementaryPairs(request.getValues(), request.getK());
    }
}
