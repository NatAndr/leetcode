package array;

public class MaximumProductSubarray {
//    Given an integer array nums, find the contiguous subarray within an array (containing at least one number)
//    which has the largest product.
//
//Example 1:
//
//Input: [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.

    //Example 2:
//
//Input: [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int cur = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(nums[i], cur * nums[i]);
            max = Math.max(max, cur);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2,3,-4};
        int i = new MaximumProductSubarray().maxProduct(arr);
        System.out.println(i);

    }
}
