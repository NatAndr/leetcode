package array;

import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted {
//    Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int sum;

        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 11, 15};

        int[] indexes = new TwoSumII_InputArrayIsSorted().twoSum(arr, 12);

        System.out.println(Arrays.toString(indexes));
    }
}
