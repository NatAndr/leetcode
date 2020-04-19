package array;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = -1;
        int j = 0;
        int n = nums.length;

        while (j < n) {
            if (nums[j] == 1) {
                max = Math.max(max, j - i);
            } else {
                i = j;
            }
            j++;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,1,0,1,1,1,1,1,0};
        int i = new MaxConsecutiveOnes().findMaxConsecutiveOnes(arr);
        System.out.println(i);
    }
}
