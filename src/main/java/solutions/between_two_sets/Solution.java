package solutions.between_two_sets;

/**
 * @author mali.sahin
 * @since 3/22/19.
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {

  /*
   * Complete the getTotalX function below.
   */
  static int getTotalX(int[] a, int[] b) {
    final int[] arrayA = sortArray(a);
    final int[] arrayB = sortArray(b);

    List<Integer> stackList = new ArrayList<>();
    for (int stack = arrayA[arrayA.length - 1]; stack <= arrayB[0]; stack++) {
      stackList.add(stack);
    }

    stackList.removeIf(stack -> {
      int count = 0;
      for (int i = 0; i < arrayA.length; i++) {
        if (stack % arrayA[i] != 0) {
          count += 1;
        }
      }
      return count != 0;
    });

    stackList.removeIf(stack -> {
      int count = 0;
      for (int i = 0; i < arrayB.length; i++) {
        if (arrayB[i] % stack != 0) {
          count += 1;
        }
      }
      return count != 0;
    });

    return stackList.size();
  }

  private  static int[] sortArray(int array[]) {
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

    int[] a = new int[]{2, 4};
    int[] b = new int[]{16, 32, 96};


    int total = getTotalX(a, b);
    System.out.println(total);

  }
}

