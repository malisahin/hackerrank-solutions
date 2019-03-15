package solutions.plus_minus;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author mali.sahin
 * @since 15.03.2019.
 */
public class Solution {
    private static DecimalFormat df = new DecimalFormat("##.######");

    static void plusMinus(int[] valueList) {
        int denominator = valueList.length;
        double numberOfPositiveValues = 0;
        double numberOfNegativeValues = 0;
        double numberOfZeroValues = 0;
        for (int value : valueList) {
            if (value > 0) {
                numberOfPositiveValues += 1;
            } else if (value < 0) {
                numberOfNegativeValues += 1;
            } else {
                numberOfZeroValues += 1;
            }
        }
        if (denominator == 0) {
            System.out.println(df.format(0));
            System.out.println(df.format(0));
            System.out.println(df.format(0));
        } else {
            System.out.println(df.format(numberOfPositiveValues / denominator));
            System.out.println(df.format(numberOfNegativeValues / denominator));
            System.out.println(df.format(numberOfZeroValues / denominator));
        }

    }

    public static void main(String[] args) {
        Random random = new Random();
        int estimatedValue = random.nextInt() % 100;
        int numberOfValues = estimatedValue < 0 ? estimatedValue * -1 : estimatedValue;
        int[] valueList = new int[numberOfValues];


        for (int i = 0; i < valueList.length; i++) {
            valueList[i] = random.nextInt() % 100;
        }
        plusMinus(valueList);
    }
}
