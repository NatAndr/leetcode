package array;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
//    Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

//    Input: [0,1,0]
//Output: 2
//Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] * 2 - 1;
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                max = Math.max(max, len);
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0};
        int maxLength = new ContiguousArray().findMaxLength(arr);
        System.out.println(maxLength);
    }
}
