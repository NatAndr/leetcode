package array;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    //    Given an array arr, replace every element in that array with the greatest element
//    among the elements to its right, and replace the last element with -1.
//
//After doing so, return the array.
//
//
//
//Example 1:
//
//Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]
    public int[] replaceElements(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            arr[n - 1] = -1;
            return arr;
        }

        int max = arr[n - 1];
        int prev = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, prev);
            prev = arr[i];
            arr[i] = max;
        }
        arr[n - 1] = -1;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{17,18,5,4,6,1};
        int[] ints = new ReplaceElementsWithGreatestElementOnRightSide().replaceElements(arr);
        System.out.println(Arrays.toString(ints));
    }

}
