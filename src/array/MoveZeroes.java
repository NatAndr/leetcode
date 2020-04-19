package array;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n < 2) return;

        int k = 0;
        int i = 0;

        while (i < n && k < n) {
            if (nums[k] != 0) {
                nums[i] = nums[k];
                if (i != k) {
                    nums[k] = 0;
                }
                i++;
            }
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1};
//        int[] arr = new int[]{1};
//        int[] arr = new int[]{0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
