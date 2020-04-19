package array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
//    Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
//Note:
//
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,2,1,2};
        int i = new SingleNumber().singleNumber(arr);
        System.out.println(i);
    }
}
