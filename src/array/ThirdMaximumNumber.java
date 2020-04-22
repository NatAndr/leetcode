package array;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {
//    Given a non-empty array of integers, return the third maximum number in this array.
//    If it does not exist, return the maximum number. The time complexity must be in O(n).
//
//Example 1:
//Input: [3, 2, 1]
//
//Output: 1
//
//Explanation: The third maximum is 1.
//Example 2:
//Input: [1, 2]
//
//Output: 2
//
//Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
//Example 3:
//Input: [2, 2, 3, 1]
//
//Output: 1
//
//Explanation: Note that the third maximum here means the third maximum distinct number.
//Both numbers with value 2 are both considered as second maximum.

    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for (int i : nums) {
            set.add(i);
        }

        Iterator<Integer> iterator = set.iterator();
        if (set.size() < 3) {
            return iterator.next();
        }

        int i = 0;
        int num = 0;
        while (iterator.hasNext() && i < 3) {
            num = iterator.next();
            i++;
        }

        return num;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2};
        int i = new ThirdMaximumNumber().thirdMax(arr);
        System.out.println(i);
    }
}
