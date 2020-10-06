package solutions.bill_division;

/**
 * @author malisahin
 * @since 06-Oct-20
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

  // Complete the bonAppetit function below.
  static void bonAppetit(List<Integer> bill, int k, int b) {
    if (bill == null || bill.isEmpty()) {
      return;
    }

    Integer totalBill = 0;
    for (int i = 0; i < bill.size(); i++) {
      if (i == k)
        continue;
      totalBill += bill.get(i);
    }
    if (totalBill / 2 == b) {
      System.out.println("Bon Appetit");
    } else {
      System.out.println(b - (totalBill / 2));
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    //int n = Integer.parseInt(nk[0]);

    // k which is Anna did not eat
    int k = 1;


    // Array of bill
    List<Integer> bill = new ArrayList<>();
    bill.add(3);
    bill.add(10);
    bill.add(2);
    bill.add(9);

    // Brian calculation
    int b = 7;

    bonAppetit(bill, k, b);

    bufferedReader.close();
  }
}
