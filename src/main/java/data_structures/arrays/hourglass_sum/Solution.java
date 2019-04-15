package data_structures.arrays.hourglass_sum;

/**
 * @author mali.sahin
 * @since 4/15/19.
 */


import util.Util;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Solution {

  // Complete the hourglassSum function below.
  static int hourglassSum(int[][] arr) {
    if (arr.length < 3)
      return 0;

    Set<int[]> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
      for (int k = 0; k < arr[i].length; k++) {
        if (arr.length - 1 >= i + 2 && arr[i].length - 1 >= k + 2) {
          int[] pocket = new int[]{
              arr[i][k], arr[i][k + 1] + arr[i][k + 2],
              arr[i + 1][k + 1],
              arr[i + 2][k], arr[i + 2][k + 1], arr[i + 2][k + 2]};
          System.out.println(" " + arr[i][k] + ", " + arr[i][k + 1] + ", " + arr[i][k + 2] + ", " +
              arr[i + 1][k + 1] + ", " +
              arr[i + 2][k] + ", " + arr[i + 2][k + 1] + ", " + arr[i + 2][k + 2]);
          set.add(pocket);
        }
      }
    }
    final int[] max = {-100};
    set.forEach(arrays -> {
      int total = 0;
      for (int item : arrays) {
        total += item;
      }
      if (total >= max[0])
        max[0] = total;
    });
    return max[0];
  }


  public static void main(String[] args) throws IOException {

    int i = Util.getIntValue(0, 6);
    int k = Util.getIntValue(0, 6);

    int[][] arr = new int[i][k];

    for (int j = 0; j < i; j++) {
      for (int l = 0; l < k; l++)
        arr[j][l] = Util.getIntValue(-9, 10);
    }

    arr = new int[][]
        {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };
    arr = new int[][]{
        {-1, -1, 0, -9, -2, -2},
        {-2, -1, -6, -8, -2, -5},
        {-1, -1, -1, -2, -3, -4},
        {-1, -9, -2, -4, -4, -5},
        {-7, -3, -3, -2, -9, -9},
        {-1, -3, -1, -2, -4, -5}
    };

    arr = new int[][]{
        {0, -4, -6, 0, -7, -6},
        {-1, -2, -6, -8, -3, -1},
        {-8, -4, -2, -8, -8, -6},
        {-3, -1, -2, -5, -7, -4},
        {-3, -5, -3, -6, -6, -6},
        {-3, -6, 0, -8, -6, -7}
    };


    int result = hourglassSum(arr);
    System.out.println(result);

  }
}
