package duplicates;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {

    public static List<Integer> findAllDuplicates(List<Integer> integerList, int numberOfDuplicates) {
        return Optional.ofNullable(integerList)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(i -> Collections.frequency(integerList, i) == numberOfDuplicates)
                .filter(Objects::nonNull).distinct()
                .collect(Collectors.toList());
    }
}