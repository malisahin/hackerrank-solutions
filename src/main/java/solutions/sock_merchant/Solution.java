package solutions.sock_merchant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author malisahin
 * @since 04-May-21
 */

public class Solution {

  public static void main(String[] args) {
    int n = 9;
    List<Integer> content = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
    int response = sockMerchant(n, content);
    System.out.println(response);
  }

  public static int sockMerchant(int n, List<Integer> ar) {
    final HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      map.compute(ar.get(i), (key, value) -> value == null ? 1 : value + 1);
    }

    return map.values()
        .stream()
        .map(value -> (int) Math.floor((value / 2)))
        .reduce(0, Integer::sum);

  }

}
