package integerSum;

import java.util.*;
import java.util.stream.Collectors;

public class ListOperation {
    public static int integerSum(List<String> input) {
        return Arrays.stream(Optional.ofNullable(input)
                        .stream()
                        .filter(Objects::nonNull)
                        .map(Object::toString)
                        .collect(Collectors.joining(","))
                        .replaceAll("[^-0-9]+", " ")
                        .trim()
                        .split(" "))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}