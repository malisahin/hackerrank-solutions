package data_structures.arrays.beatiful_days_at_the_movies;
/*
 * @created on 18.04.2023
 * @author sahin
 */

public class Solution {


    public static void main(String[] args) {

        System.out.println(beautifulDays(20, 23, 6));
     //   reverseDigits(120);
    }

    public static int beautifulDays(int i, int j, int k) {

        int divisions = 0;

        for (; i <= j; i++) {

            int reversed = reverseDigits(i);
            int divided = i - reversed;
            int absoluteValue = divided >= 0 ? divided : (-1) * divided;
            if (absoluteValue % k == 0) {
                divisions++;
            }
        }
        return divisions;
    }

    static int reverseDigits(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return reversed;

    }


}
