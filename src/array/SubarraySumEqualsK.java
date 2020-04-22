package array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
//    Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
//
//Example 1:
//Input:nums = [1,1,1], k = 2
//Output: 2
//Note:
//The length of the array is in range [1, 20,000].
//The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = new SubarraySumEqualsK().subarraySum(arr, 0);
        System.out.println(i);
    }

}
