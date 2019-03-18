package solutions.mini_max_sum;

import util.Util;

/**
 * @author mali.sahin
 * @since 3/18/19.
 */
public class Solution {
  // Complete the miniMaxSum function below.
  static void miniMaxSum(int[] array) {
    array = new int[]{7, 69, 2, 221, 8974};
    array = sortArray(array);
    long totalValue = 0;
    for (int item : array) {
      totalValue += item;
    }
    System.out.print((totalValue - array[array.length - 1]) + " " + (totalValue - array[0]));
  }

  private static int[] sortArray(int array[]) {
    for (int k = 0; k < array.length - 1; k++) {
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i + 1];
          array[i + 1] = array[i];
          array[i] = temp;
        }
      }
    }
    return array;
  }


  public static void main(String[] args) {
    int[] arr = Util.getIntArray(1000, 5);

    miniMaxSum(arr);
  }
}
