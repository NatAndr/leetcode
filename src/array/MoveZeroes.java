package array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) return;

        int k = 0;
        int i = 0;

        while (i < nums.length - 1 && k < nums.length) {
            if (nums[i] == 0) {
                System.arraycopy(nums, i + 1, nums, i, nums.length - i - 1);
                nums[nums.length - 1] = 0;
            } else {
                i++;
            }
            k++;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 0, 1, 2, 2, 0, 0, 4};
//        int[] arr = new int[]{1};
//        int[] arr = new int[]{0,1,0,3,12};
        new MoveZeroes().moveZeroes(arr);
    }
}
