package solutions.the_birthday_bar;

/**
 * @author mali.sahin
 * @since 28.03.2019.
 */

import util.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    /* arr[]  ---> Input Array
     data[] ---> Temporary array to store current combination
     start & end ---> Staring and Ending indexes in arr[]
     index  ---> Current index in data[]
     r ---> Size of a combination to be printed */
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r) {
        // Current combination is ready to be printed, print it
        if (index == r) {
            for (int j = 0; j < r; j++)
                System.out.print(data[j] + " ");
            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    static void printCombination(int arr[], int n, int r) {
        // A temporary array to store all combination one by one
        int data[] = new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }


    // Complete the birthday function below.
    static int birthday(List<Integer> bars, int day, int month) {


        int[] arrayBars = new int[bars.size()];
        for (int i = 0; i < bars.size(); i++) {
            arrayBars[i] = bars.get(i);
        }

        Solution.printCombination(arrayBars, day, month);
        return 0;
    }

    public static void main(String[] args) throws IOException {

        int lengthOfBar = Util.getPositiveIntValue(100);

        int[] values = Util.getIntArray(5, lengthOfBar);


        List<Integer> bars = new ArrayList<>();
        for (int i = 0; i < lengthOfBar; i++) {
            bars.add(values[i]);
        }

        int day = Util.getPositiveIntValue(31);

        int month = Util.getPositiveIntValue(12);

        int result = birthday(bars, day, month);
    }
}
