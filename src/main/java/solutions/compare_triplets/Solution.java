package solutions.compare_triplets;

/**
 * @author mali.sahin
 * @since 20.03.2019.
 */

import util.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> listA, List<Integer> listB) {
        List<Integer> totalList = new ArrayList<>();
        Integer countA = 0;
        Integer countB = 0;
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i) > listB.get(i))
                countA += 1;
            if (listA.get(i) < listB.get(i))
                countB += 1;
        }
        totalList.add(countA);
        totalList.add(countB);
        return totalList;
    }

    public static void main(String[] args) throws IOException {


        int[] arrayA = Util.getIntArray(100, 3);
        List<Integer> a = Arrays.stream(arrayA).boxed().collect(Collectors.toList());

        int[] arrayB = Util.getIntArray(100, 3);
        List<Integer> b = Arrays.stream(arrayB).boxed().collect(Collectors.toList());

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);

    }
}
