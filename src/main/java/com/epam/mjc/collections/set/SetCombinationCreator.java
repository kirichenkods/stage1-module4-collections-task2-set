package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> result = new HashSet<>();
        firstSet.forEach(elem -> {
            if (secondSet.contains(elem) && !thirdSet.contains(elem)) {
                result.add(elem);
            }
        });
        thirdSet.forEach(elem -> {
            if (!firstSet.contains(elem) && !secondSet.contains(elem)) {
                result.add(elem);
            }
        });

        return result;
    }
}
