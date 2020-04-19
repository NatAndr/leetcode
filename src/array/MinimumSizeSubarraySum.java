package array;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {
        int len = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            sum += nums[j];
            while (sum >= s) {
                len = Math.min(len, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }

        return Math.max(0, len);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,4,3};
        int i = new MinimumSizeSubarraySum().minSubArrayLen(7, arr);
        System.out.println(i);
    }
}
