package data_structures.arrays.sparse_arrrays;

/**
 * @author mali.sahin
 * @since 23.04.2019.
 */

import java.io.IOException;
import java.util.*;

public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        List<String> queryList = Arrays.asList(queries);
        Map<String, Integer> valueMap = new HashMap<>();
        Arrays.stream(queries).forEach(query -> valueMap.putIfAbsent(query, 0));

        Arrays.stream(strings).forEach(string -> {
            if (queryList.contains(string)) {
                valueMap.put(string, valueMap.get(string) + 1);
            }
        });
        int[] values = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            values[i] = valueMap.get(queries[i]);
        }

        return values;
    }


    public static void main(String[] args) throws IOException {

        String[] strings = new String[]{"aba", "baba", "aba", "xzxb"};

        String[] queries = new String[]{"aba", "xzxb", "ab"};


        int[] res = matchingStrings(strings, queries);

        for (int text : res) {
            System.out.println(text);
        }

    }
}
