package codility.user_stats;
/*
 * @created on 25.04.2023
 * @author sahin
 */

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {


}

class VisitCounter {

    Map<Long, Long> count(Map<String, UserStats>... visits) {

        return Arrays.stream(visits)
                .filter(Objects::nonNull)
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> isLong(entry.getKey()))
                .filter(entry -> entry.getValue() != null && entry.getValue().getVisitCount().isPresent())
                .collect(Collectors.groupingBy(
                        entry -> Long.parseLong(entry.getKey()),
                        Collectors.summingLong(entry -> entry.getValue().getVisitCount().get())
                ));
    }

    private boolean isLong(String val) {
        try {
            Long.parseLong(val);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
