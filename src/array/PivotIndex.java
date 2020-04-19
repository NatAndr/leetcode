package array;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (sum(nums, 0, i) == sum(nums, i + 1, nums.length)) {
                return i;
            }
        }

        return index;
    }

    private int sum(int[] arr, int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int pivotIndex = new PivotIndex().pivotIndex(new int[]{1, 2, 3});
        System.out.println(pivotIndex);
    }


}
