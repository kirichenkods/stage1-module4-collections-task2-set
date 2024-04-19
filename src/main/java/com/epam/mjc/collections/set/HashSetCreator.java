package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer item : sourceList) {
            if (item % 2 == 0) {
                result.addAll(getEvenSequence(item));
            } else {
                result.add(item);
                result.add(item * 2);
            }
        }

        return result;
    }

    private HashSet<Integer> getEvenSequence(Integer item) {
        HashSet<Integer> result = new HashSet<>();
        while (item % 2 == 0) {
            result.add(item);
            item /= 2;
        }
        result.add(item);

        return result;
    }
}
