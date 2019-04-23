package data_structures.arrays.array_manipulation;

/**
 * @author mali.sahin
 * @since 23.04.2019.
 */

import java.io.IOException;
import java.util.Arrays;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int[] array = new int[n];
        Arrays.stream(queries).map(query -> {
            int from = query[0] - 1;
            int to = query[1] - 1;
            int value = query[2];
            for (int i = from; i <= to; i++) {
                array[i] += value;
            }
            return 1;
        }).count();
        return Arrays.stream(array).max().getAsInt();
    }


    public static void main(String[] args) throws IOException {

        int n = 5;

        int m = 3;

        int[][] queries = new int[][]{
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };


        long result = arrayManipulation(n, queries);
        System.out.println(result);

    }
}

