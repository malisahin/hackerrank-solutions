package solutions.divisible_sum_pairs;

/**
 * @author mali.sahin
 * @since 28.03.2019.
 */

import util.Util;

import java.io.IOException;

public class Solution {

  // Complete the divisibleSumPairs function below.
  static int divisibleSumPairs(int n, int k, int[] ar) {
    int countOfSuitValues = 0;
    for (int i = 0; i < ar.length; i++) {
      for (int j = i; j < ar.length; j++) {
        if (j > i && isDivisible(new int[]{ar[i], ar[j]}, k))
          countOfSuitValues += 1;
      }
    }
    return countOfSuitValues;
  }

  private static boolean isDivisible(int[] pair, int value) {
    int total = pair[0] + pair[1];
    return total % value == 0;
  }

  public static void main(String[] args) throws IOException {

    int n = Util.getPositiveIntValue(100);

    int k = Util.getPositiveIntValue(100);

    int[] ar = Util.getIntArray(100, n);

    int result = divisibleSumPairs(n, k, ar);
    System.out.println(result);

  }
}