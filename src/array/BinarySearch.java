package array;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - j;
            }


        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,3,5,9,12};

        int i = new BinarySearch().search(arr, -1);
        System.out.println(i);
    }
}
