package solutions.climbing_the_leaderboard;
/*
 * @created on 14.11.2022
 * @author sahin
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {


    public static void main(String[] args) {
        sorting(Arrays.asList(200, 185, 185, 317, 123, 5, 35, 317));
    }


    public static int findRank(List<Integer> sorted, Integer score) {
        for (int i = 0; i < sorted.size(); i++){
            int min = 0;
            int max = sorted.size();
            while (max > min){
                int mid = (min + max) / 2;
                if (sorted.get(mid) <= score)
                    max = mid;
                else
                    min = mid + 1;
            }
            return min + 1;
        }
        return sorted.size() + 1;

    }

    public static List<Integer> sorting(List<Integer> ranked) {
        return ranked.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        List<Integer> sorted = sorting(ranked);

        return player.stream().map(score -> findRank(sorted, score)).collect(Collectors.toList());
    }
}
