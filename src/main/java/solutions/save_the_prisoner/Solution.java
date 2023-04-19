package solutions.save_the_prisoner;
/*
 * @created on 19.04.2023
 * @author sahin
 */


import java.util.Arrays;

public class Solution {

    public static int saveThePrisoner(int n, int m, int s) {
        int lastPrisoner = (s + m - 1) % n;
        if (lastPrisoner == 0) {
            lastPrisoner = n;
        }
        //return lastPrisoner;

        return  (s - 1 + m - 1) % n + 1;

       // int result = (s - 1 + m - 1) % n + 1; // calculate the last prisoner to get a candy

    }

    public static void main(String[] args) {

        /*System.out.println(saveThePrisoner(5, 2, 1));
        System.out.println(saveThePrisoner(5, 2, 2));
        System.out.println(saveThePrisoner(352926151, 380324688, 94730870));*/
        System.out.println(saveThePrisoner(499999999, 999999998, 2));
    }
}
