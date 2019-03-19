package solutions.time_conversion;

/**
 * @author mali.sahin
 * @since 20.03.2019.
 */

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {


    static String timeConversion(String s) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = inputFormat.parse(s);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String result = timeConversion("07:05:45PM");

        System.out.println(result);
    }
}
