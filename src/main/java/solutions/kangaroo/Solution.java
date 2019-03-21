package solutions;

/**
 * @author mali.sahin
 * @since 21.03.2019.
 */

import util.Util;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the kangaroo function below.
    static String result;

    static String kangaroo(int x1, int v1, int x2, int v2) {

        if (((x1 + v1) > (x2 + v2)) && v1 > v2)
            result = "NO";
        if (((x1 + v1) < (x2 + v2)) && v1 < v2)
            result = "NO";
        if ((x1 + v1) == (x2 + v2))
            result = "YES";
        if ((x1 + v1) != (x2 + v2) && v1 == v2)
            result = "NO";

        System.out.print("X1: " + (x1 + v1) + " - V1: " + v1);
        System.out.println(" - X2: " + (x2 + v2) + " - V2: " + v2);
        if (result == null) {
            kangaroo(x1 + v1, v1, x2 + v2, v2);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] x1V1X2V2 = Util.getIntArray(10000, 4);
        x1V1X2V2 = new int[]{0, 3, 4, 2};

        int x1 = x1V1X2V2[0];

        int v1 = x1V1X2V2[1];

        int x2 = x1V1X2V2[2];

        int v2 = x1V1X2V2[3];

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);
    }
}
