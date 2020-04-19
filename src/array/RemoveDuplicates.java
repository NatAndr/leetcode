package array;

public class RemoveDuplicates {
//    Given nums = [0,0,1,1,1,2,2,3,3,4],
//    Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int k = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k++] = nums[i + 1];
            }
        }

        return k;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr = new int[]{1, 1, 2};
//        int[] arr = new int[]{1, 1, 1};
//        int[] arr = new int[]{1, 2, 3};
//        int[] arr = new int[]{1};
        int i = new RemoveDuplicates().removeDuplicates(arr);
        System.out.println(i);
    }
}
