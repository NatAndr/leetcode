package array;

import java.util.*;

public class FindAllNumbersDisappearedInArray {
//    Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements of [1, n] inclusive that do not appear in this array.
//
//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
//Example:
//
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[5,6]

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        if (n == 0) {
            return list;
        }
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,7,2,3,1};
        List<Integer> list = new FindAllNumbersDisappearedInArray().findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
