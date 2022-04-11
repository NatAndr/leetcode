package solution;


//You are given an integer array arr.
// Sort the integers in the array in ascending order
// by the number of 1's in their binary representation
// and in case of two or more integers have the same number of 1's
// you have to sort them in ascending order.
//
//Return the array after sorting it.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortIntegersByTheNumberOf1Bits_1356 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        new SortIntegersByTheNumberOf1Bits_1356().sortByBits(arr);
    }

    public int[] sortByBits(int[] arr) {
        int[] res = new int[arr.length];
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        for (int n : arr) {
            int count = count1Bits(n);
            List<Integer> list = map.getOrDefault(count, new ArrayList<>());
            list.add(n);
            map.put(count, list);
        }

        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            Collections.sort(list);
            for (Integer n : list) {
                res[i++] = n;
            }
        }

        return res;
    }

    private int count1Bits(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}
