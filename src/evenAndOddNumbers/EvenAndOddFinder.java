package evenAndOddNumbers;

import java.util.*;
import java.util.stream.Collectors;

public class EvenAndOddFinder {
    Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        return Optional.ofNullable(input)
                .map(list -> list.stream()
                        .filter(Objects::nonNull)
                        .flatMap(Collection::stream)
                        .collect(Collectors.toSet())
                        .stream()
                        .filter(Objects::nonNull)
                        .filter(element -> !element.equals(""))
                        .collect(Collectors
                                .groupingBy(x -> {
                                            if (x.length() % 2 == 0) {
                                                return CharacterType.EVEN;
                                            }
                                            return CharacterType.ODD;
                                        },
                                        Collectors.toSet())))
                .orElse(Map.of(CharacterType.EVEN, new HashSet<>(), CharacterType.ODD, new HashSet<>()));
    }
}