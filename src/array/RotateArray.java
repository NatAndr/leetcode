package array;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] nums2 = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;

            nums2[newIndex] = nums[i];
        }

        System.arraycopy(nums2, 0, nums, 0, n);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
