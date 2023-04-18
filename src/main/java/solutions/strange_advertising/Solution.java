package solutions.strange_advertising;
/*
 * @created on 18.04.2023
 * @author sahin
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }


    public static int viralAdvertising(int n) {

        int cumulative = 0;

        int shared = 5;
        System.out.println("Day   Shared   Liked   Cumulative");
        for (int day = 1; day <= n; day++) {
            int liked = shared / 2;
            cumulative += liked;
            System.out.println(day + "       " + shared + "       " + liked + "       " + cumulative);
            shared = liked * 3;
        }
        return cumulative;

    }

}
