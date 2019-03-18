package solutions.birthday_cake_candles;

import util.Util;

/**
 * @author mali.sahin
 * @since 3/18/19.
 */
public class Solution {
  // Complete the birthdayCakeCandles function below.
  static int birthdayCakeCandles(int[] array) {
    int maxValue = 0;
    for (int item : array) {
      if (item > maxValue)
        maxValue = item;
    }
    int countOfValue = 0;
    for (int item : array) {
      if (item == maxValue)
        countOfValue += 1;
    }
    System.out.println(countOfValue);
    return countOfValue;
  }


  public static void main(String[] args) {

    int[] ar = Util.getIntArray(10000, 100);
    birthdayCakeCandles(ar);

  }
}
