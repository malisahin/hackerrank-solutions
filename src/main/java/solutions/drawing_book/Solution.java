package solutions.drawing_book;

/**
 * @author mali.sahin
 * @since 20.03.2019.
 */

import util.Util;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int numberOfBookPages, int targetPage) {

        // No need turn page
        if (targetPage == 1 || numberOfBookPages == targetPage)
            return 0;

        /* If start from page 1, 1 + 2 + 2 + 2 + 2
            targetPage <= 1 + (2 * n);
        */
        boolean isTargetPageOdd = targetPage % 2 == 1;
        int numberOfTurnFromStart = isTargetPageOdd ? ((targetPage - 1) / 2) : targetPage / 2;

        /*
            If start from last page

            If is Book Pages Size Odd,
            p, p-1 / p-2, p-3 / p-4, p-5/  => p - 1 - ( 2 * n) > t

           If is Book Pages Size Even
           p/ p-1, p-2/ p-3, p-4/  p - (2 * n) > t

           (p - t) % 2 == 1 ? (p-t -1 ) / 2 : (p-t)/ 2;
           Target is numberOfBookPages - targetPage
        */

        int diffEndToTarget = numberOfBookPages - targetPage;
        boolean isStartFromEndOdd = diffEndToTarget % 2 == 1;
        boolean isLastPageEven = numberOfBookPages % 2 == 0;

        int numberOfTurnFromEnd = isStartFromEndOdd ? ((diffEndToTarget - 1) / 2) : (diffEndToTarget / 2);

        if (numberOfTurnFromEnd == 0 && isLastPageEven)
            return 1;

        return numberOfTurnFromEnd > numberOfTurnFromStart ? numberOfTurnFromStart : numberOfTurnFromEnd;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int numberOfBook = Util.getIntValue(10000);
        int targetPage = Util.getIntValue(numberOfBook);
        pageCount(4, 4);
        int result = pageCount(numberOfBook, targetPage);

        System.out.println(result);
    }
}
