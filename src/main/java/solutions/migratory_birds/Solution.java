package solutions.migratory_birds;

/**
 * @author mali.sahin
 * @since 4/15/19.
 */

import util.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  static Map<Integer, Integer> birds = new HashMap<>();

  // Complete the migratoryBirds function below.
  static int migratoryBirds(List<Integer> arr) {

    arr.forEach(Solution::addToMap);

    final int[] most = {0, 1};
    birds.forEach((key, value) -> {
      if (value > most[0]) {
        most[0] = value;
        most[1] = key;
      }
    });
    return most[1];
  }

  private static void addToMap(Integer value) {
    if (birds.containsKey(value)) {
      birds.put(value, birds.get(value) + 1);
    } else {
      birds.put(value, 1);
    }
  }

  public static void main(String[] args) {

    int countOfBirds = Util.getIntValue(5, 2 * 10000);
    List<Integer> birdList = Util.getIntList(1, 6, countOfBirds);

    int result = migratoryBirds(birdList);

    System.out.println(result);
  }
}
