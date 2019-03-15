package solutions.diagonal_difference;

import java.io.IOException;
import java.util.Random;

/**
 * @author mali.sahin
 * @since 3/15/19.
 */
public class Solution {
  // Complete the diagonalDifference function below.
  static int diagonalDifference(int[][] matrix) {
    int ltr = 0;
    int rtl = 0;
    for (int i = 0; i < matrix.length; i++) {
      System.out.println("matrix[" + i + "][" + i + "]: " + matrix[i][i]);
      ltr += matrix[i][i];
      System.out.println("matrix[ " + (i) + "][" + (matrix.length - 1 - i) + "]: " + matrix[matrix.length - 1 - i][matrix.length - 1 - i]);
      rtl += matrix[i][matrix.length - 1 - i];
    }
    int result = ltr - rtl;
    return result < 0 ? result * -1 : result;
  }

  public static void main(String[] args) throws IOException {

    int n = 3;
    int[][] arr = new int[n][n];
    Random random = new Random();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = random.nextInt() % 100;
      }
    }
    int result = diagonalDifference(arr);
    System.out.println(result);
  }
}
