package data_structures.arrays.array_manipulation;

/**
 * @author mali.sahin
 * @since 23.04.2019.
 */

import java.io.IOException;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long outputArray[] = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            outputArray[a] += k;
            outputArray[b+1] -= k;
        }
        long max = getMax(outputArray);
        return max;
    }

    /**
     * @param inputArray
     * @return
     */
    private static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            max = Math.max(max, sum);
        }
        return max;
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

