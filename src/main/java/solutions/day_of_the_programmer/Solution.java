package solutions.day_of_the_programmer;

/**
 * @author malisahin
 * @since 05-Oct-20
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {

  private static final HashMap<Integer, Integer> months;

  static {
    months = new HashMap<>();
    months.put(1, 31);
    months.put(2, 28);
    months.put(3, 31);
    months.put(4, 30);
    months.put(5, 31);
    months.put(6, 30);
    months.put(7, 31);
    months.put(8, 31);
    months.put(9, 30);
    months.put(10, 31);
    months.put(11, 30);
    months.put(12, 31);
  }

  // Complete the dayOfProgrammer function below.
  private static String dayOfProgrammer(int year) {
    int dayOfTheYear = 256;
    if (isBeginningOfGregorian(year))
      dayOfTheYear += 13;
    for (Map.Entry<Integer, Integer> daysOfMonth : months.entrySet()) {
      final int dayOfTheMonth = isLeapYear(year) && daysOfMonth.getKey() == 2 ? daysOfMonth.getValue() + 1 : daysOfMonth.getValue();
      if (dayOfTheYear <= dayOfTheMonth) {
        final String monthPrefix = daysOfMonth.getKey() > 9 ? "" : "0";
        return "" + dayOfTheYear + "." + monthPrefix + daysOfMonth.getKey() + "." + year;
      }
      dayOfTheYear -= dayOfTheMonth;
    }
    return "";
  }

  private static boolean isBeginningOfGregorian(int year) {
    return year == 1918;
  }

  private static boolean isLeapYear(int year) {
    if (year < 1918 && year % 4 == 0) {
      return true;
    } else if (year > 1917 && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) throws IOException {


    String result = dayOfProgrammer(1918);

    System.out.println(result);
  }

}
