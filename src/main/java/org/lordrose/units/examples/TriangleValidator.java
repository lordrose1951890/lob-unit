package org.lordrose.units.examples;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TriangleValidator {

    public int validate(int firstEdge, int secondEdge, int thirdEdge) {
        List<Integer> sorted = List.of(firstEdge, secondEdge, thirdEdge).stream()
                .sorted()
                .collect(Collectors.toList());

        if (sorted.get(0) <= 0) {
            throw new InvalidTriangleException();
        } else if (sorted.get(0) + sorted.get(1) <= sorted.get(2)) {
            throw new InvalidTriangleException();
        }

        Set<Integer> equalEdges = new HashSet<>(sorted);

        return equalEdges.size();
    }

    public static class InvalidTriangleException extends RuntimeException {
    }
}
