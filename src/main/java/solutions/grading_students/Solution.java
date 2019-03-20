package solutions.grading_students;

/**
 * @author mali.sahin
 * @since 3/20/19.
 */

import util.Util;

import java.io.IOException;
import java.util.Arrays;

public class Solution {

  /*
   * Complete the gradingStudents function below.
   */
  static int[] gradingStudents(int[] grades) {
    int[] finalResults = new int[grades.length];
    for (int i = 0; i < grades.length; i++) {
      finalResults[i] = calculateFinalResult(grades[i]);
    }
    return finalResults;
  }

  private static int calculateFinalResult(int grade) {
    if (grade < 38 || (grade % 5) < 3)
      return grade;

    grade += 5 - (grade % 5);
    return grade;
  }


  public static void main(String[] args) throws IOException {
    /*
        1<= n <= 60
        0 <= grades[i] <= 100
     */
    int countOfGrades = Util.getPositiveIntValue(60);
    int[] grades = Util.getIntArray(100, countOfGrades);
    Arrays.stream(grades).forEach(System.out::println);

    int[] result = gradingStudents(grades);
    Arrays.stream(result).forEach(System.out::println);
  }
}

