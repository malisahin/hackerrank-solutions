package util;

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
        return (new Random()).nextInt() % maxValue + 1;
    }

    public static int[] getIntArray(int maxValue, int lengthOfArray) {
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = Util.getPositiveIntValue(maxValue);
        }
        return array;
    }
}
