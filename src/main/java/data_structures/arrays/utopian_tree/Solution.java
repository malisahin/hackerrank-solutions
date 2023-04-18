package data_structures.arrays.utopian_tree;
/*
 * @created on 18.04.2023
 * @author sahin
 */

public class Solution {

    public static void main(String[] args) {

        utopianTree(5);
    }

    public static int utopianTree(int n) {
        int totalHeight = 0;

        for (int period = 0; period <= n; period++) {
            if (period % 2 == 1) {
                totalHeight += totalHeight;
            } else {
                totalHeight += 1;
            }
            System.out.println("Period: " + period + ", Height: " + totalHeight);
        }
        return totalHeight;
    }
}
