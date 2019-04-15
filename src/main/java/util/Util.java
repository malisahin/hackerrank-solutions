package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author mali.sahin
 * @since 3/18/19.
 */
public class Util {

  public static int getPositiveIntValue(int maxValue) {
    int estimate = Util.getIntValue(maxValue);
    return estimate < 0 ? estimate * -1 : estimate;
  }

  public static int getIntValue(int maxValue) {
    return new Random().nextInt() % maxValue + 1;
  }

  public static int getIntValue(int min, int max) {
    return new Random().nextInt(max - min) + min;
  }

  public static List<Integer> getIntList(int min, int max, int length) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      list.add(getIntValue(min, max));
    }
    return list;
  }

  public static int[] getIntArray(int min, int max, int length) {
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      array[i] = getIntValue(min, max);
    }
    return array;
  }

  public static int[] getIntArray(int maxValue, int lengthOfArray) {
    int[] array = new int[lengthOfArray];
    for (int i = 0; i < lengthOfArray; i++) {
      array[i] = Util.getPositiveIntValue(maxValue);
    }
    return array;
  }
}
