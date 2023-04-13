package solutions.hurdle_race;
/*
 * @created on 13.04.2023
 * @author sahin
 */

import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Integer maxValue = Collections.max(height);

        if (k >= maxValue)
            return 0;

        return maxValue - k;

    }
}
