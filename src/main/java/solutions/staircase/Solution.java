package solutions.staircase;

import util.Util;

/**
 * @author mali.sahin
 * @since 3/18/19.
 */
public class Solution {

  // Complete the staircase function below.
  static void staircase(int numberOfLines) {
    for (int i = 1; i <= numberOfLines; i++) {
      for (int k = 1; k <= numberOfLines - i; k++) {
        System.out.print(' ');
      }
      for (int k = 1; k <= i; k++) {
        System.out.print('#');
      }
      System.out.println();
    }

  }


  public static void main(String[] args) {
    staircase(Util.getPositiveIntValue(100));
  }
}
