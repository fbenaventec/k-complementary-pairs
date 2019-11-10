package es.fbenavente.kcomplementaypairs;

import lombok.Value;

@Value
public class Pair<T> {
    private final T i;
    private final T j;
}
