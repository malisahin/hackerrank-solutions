package solutions.counting_valleys;

/**
 * @author malisahin
 * @since 07-May-21
 */

public class Solution {

  public static void main(String[] args) {

    countingValleys(8, "UDDDUDUU");
  }


  public static int countingValleys(int steps, String path) {
    // Write your code here

    int valley = 0;
    int level = 0;

    final String[] pathArray = path.split("");

    for (int i = 0; i < steps; i++) {
      if (pathArray[i].equals("U")) {
        level++;
      } else if (pathArray[i].equals("D")) {
        if (level == 0) {
          valley++;
        }
        level--;
      }
    }
    return valley;
  }

}
