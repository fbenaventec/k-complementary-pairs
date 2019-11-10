package es.fbenavente.kcomplementaypairs;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode
public class Pair<T> {
    private final T i;
    private final T j;
}
