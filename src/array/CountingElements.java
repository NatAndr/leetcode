package array;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
//    Given an integer array arr, count element x such that x + 1 is also in arr.
//
//If there're duplicates in arr, count them seperately.

//    Input: arr = [1,3,2,3,5,0]
//Output: 3
//Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.

    public int countElements(int[] arr) {
        int count = 0;
        Set<Integer> allNumbers = new HashSet<>();

        for (int i : arr) {
            allNumbers.add(i);
        }

        for (int i : arr) {
            if (allNumbers.contains(i + 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,3,5,0};
        int count = new CountingElements().countElements(arr);
        System.out.println(count);
    }
}
