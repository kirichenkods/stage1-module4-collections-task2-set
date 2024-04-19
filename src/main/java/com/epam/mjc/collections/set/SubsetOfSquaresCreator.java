package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> result = new TreeSet<>();
        sourceList.forEach(elem -> {
            int squareElem = elem * elem;
            if (squareElem >= lowerBound && squareElem <= upperBound) {
                result.add(squareElem);
            }
        });

        return result;
    }
}
