package data_structures.arrays.left_rotation;

/**
 * @author mali.sahin
 * @since 23.04.2019.
 */

import util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private static void rotate(int rotate, int[] values) {
        rotate = rotate >= values.length ? rotate % values.length : rotate;

        List<Integer> rotatedValues = new ArrayList<>();

        int[] firstValues = Arrays.copyOfRange(values, 0, rotate);
        int[] secondValues = Arrays.copyOfRange(values, rotate, values.length);

        Arrays.stream(secondValues).forEach(rotatedValues::add);
        Arrays.stream(firstValues).forEach(rotatedValues::add);
        rotatedValues.forEach(value -> System.out.print(value + " "));
    }

    public static void main(String[] args) {


        int n = Util.getIntValue(0, 10);

        int d = Util.getIntValue(0, n);

        int[] a = Util.getIntArray(0, 100, n);

        rotate(d, a);


    }
}
