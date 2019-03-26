package solutions.breaking_best_and_worst_records;

/**
 * @author mali.sahin
 * @since 3/26/19.
 */

import util.Util;

import java.io.IOException;

public class Solution {

  // Complete the breakingRecords function below.
  static int[] breakingRecords(int[] scores) {
    int minScoreChanges = 0;
    int maxScoreChanges = 0;
    int minScore;
    int maxScore;

    if (scores.length == 0)
      return new int[]{};

    maxScore = scores[0];
    minScore = scores[0];

    for (int score : scores) {
      if (score > maxScore) {
        maxScore = score;
        maxScoreChanges += 1;
      }
      if (score < minScore) {
        minScore = score;
        minScoreChanges += 1;
      }
    }

    return new int[]{maxScoreChanges, minScoreChanges};
  }


  public static void main(String[] args) throws IOException {

    int numberOfGames = Util.getPositiveIntValue(1000);

    //int[] scores = Util.getIntArray(100000, numberOfGames);


    int[] scores = new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1};
    int[] result = breakingRecords(scores);

    int[] scores2 = new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
    int[] result2 = breakingRecords(scores2);

  }
}
