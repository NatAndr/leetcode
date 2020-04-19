package array;

import java.util.Arrays;

public class SingleNumber {
//    Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
//Note:
//
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i += 2;
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,1};
        int i = new SingleNumber().singleNumber(arr);
        System.out.println(i);
    }
}

// 1 2 2 4