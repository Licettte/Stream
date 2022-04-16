package maximumElements;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class FindTheMaximumElements {

    public List<BigDecimal> getThreeMaximum(List<String> input) {
        return Optional.ofNullable(input)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(BigDecimal::new)
                .sorted(Collections.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
    }
}