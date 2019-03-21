package solutions.apple_and_orange;

/**
 * @author mali.sahin
 * @since 21.03.2019.
 */

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int startPoint, int endPoint, int locA, int locB, int[] appleFallPositions, int[] orangesFallPositions) {
        //  startPoint  <= locA + fallPosition <= endPoint
        //  startPoint  <= locB + fallPosition <= endPoint

        int capturedApples = captureFruits(locA, startPoint, endPoint, appleFallPositions);
        int capturedOranges = captureFruits(locB, startPoint, endPoint, orangesFallPositions);
        System.out.println(capturedApples);
        System.out.println(capturedOranges);

    }

    private static int captureFruits(int location, int startPoint, int endPoint, int[] fallPositions) {
        int captures = 0;
        for (int fallPosition : fallPositions) {
            int fruitXAxisPosition = location + fallPosition;
            if (startPoint <= fruitXAxisPosition && fruitXAxisPosition <= endPoint) {
                captures += 1;
            }
        }
        return captures;
    }


    public static void main(String[] args) {

        int s = 7;

        int t = 10;

        int a = 4;

        int b = 12;

   /*     String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);*/

        int[] apples = new int[]{2, 3, -4};

        int[] oranges = new int[]{3, -2, -4};

        countApplesAndOranges(s, t, a, b, apples, oranges);

    }
}

