package solutions.a_very_big_some;

/**
 * @author mali.sahin
 * @since 3/15/19.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

  // Complete the aVeryBigSum function below.
  static long aVeryBigSum(long[] ar) {
    long total = 0;
    for (long item : ar) {
      total += item;
    }
    return total;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int arCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    long[] ar = new long[arCount];

    String[] arItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < arCount; i++) {
      long arItem = Long.parseLong(arItems[i]);
      ar[i] = arItem;
    }

    long result = aVeryBigSum(ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
