package data_structures.arrays.angry_professor;
/*
 * @created on 18.04.2023
 * @author sahin
 */

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static String angryProfessor(int k, List<Integer> a) {
        int onTime = (int) a.stream()
                .filter(time -> time <= 0)
                .count();
        // It must return YES If class is cancelled, or NO otherwise.
        return onTime >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {


        System.out.println(angryProfessor(3, Arrays.asList(-1, -3, 4, 2)));
        System.out.println(angryProfessor(2, Arrays.asList(0, -1, 2, 1)));
    }
}
