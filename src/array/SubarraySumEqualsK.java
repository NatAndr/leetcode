package array;

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
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int j = i;
            while (j < n) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1, 2,-1};
        int i = new SubarraySumEqualsK().subarraySum(arr, 2);
        System.out.println(i);
    }

}
