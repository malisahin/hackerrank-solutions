package data_structures.arrays.reverse_array;

/**
 * @author mali.sahin
 * @since 4/15/19.
 */

import util.Util;

import java.io.IOException;

public class Solution {

  // Complete the reverseArray function below.
  static int[] reverseArra(int[] array) {
    int[] reversedArray = new int[array.length];
    for (int i = array.length - 1; i >= 0; i++) {
      reversedArray[i] = array[array.length - (i - 1)];
    }
    return reversedArray;
  }

  static int[] reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
    return array;
  }

  public static void main(String[] args) throws IOException {
    int lengthOfArray = Util.getIntValue(1, 1000);

    int[] arr = Util.getIntArray(1, 10000, lengthOfArray);

    // int[] res = reverseArray(arr);

    lengthOfArray = 4;
    arr = new int[]{1, 4, 3, 2};

    reverseArray(arr);
  }
}
