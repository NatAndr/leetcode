package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
//    Given two arrays, write a function to compute their intersection.
//
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Note:
//
//Each element in the result must be unique.
//The result can be in any order.

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }

        set1.retainAll(set2);

        int[] res = new int[set1.size()];

        int i = 0;
        for (Integer item : set1) {
            res[i++] = item;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{9,4,9,8,4};

        int[] intersection = new IntersectionOfTwoArrays().intersection(arr1, arr2);

        System.out.println(Arrays.toString(intersection));
    }
}
