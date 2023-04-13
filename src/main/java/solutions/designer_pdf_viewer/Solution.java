package solutions.designer_pdf_viewer;
/*
 * @created on 13.04.2023
 * @author sahin
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {


    public static Character[] alphabet = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    public static void main(String[] args) {

        List<Integer> h =  Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7);
        String word = "zaba";
        int area = designerPdfViewer(h, word);
        System.out.println("Index is " + area);

    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here

        if (word.length() == 0)
            return 0;

        int maxHeight = 1;

        for (char ch : word.toCharArray()) {
            int index = Arrays.binarySearch(alphabet, ch);
            System.out.println(index + ". " + ch);

            if (h.get(index) > maxHeight) {
                maxHeight = h.get(index);
                System.out.println("Max Height: " + maxHeight);
            }
        }

        return maxHeight * word.length();
    }
}
