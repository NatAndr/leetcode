package array;

import java.util.Arrays;

public class MergeSortedArray {
    //    Input:
//nums1 = [1,2,3,0,0,0], m = 3  i
//nums2 = [2,5,6],       n = 3  j
//
//Output: [1,2,2,3,5,6]
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k > 0 && i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }

        while (j >= 0 && k >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{-4, 5, 6, 0, 0, 0};
        int[] arr2 = new int[]{-10, 2, 3};
        new MergeSortedArray().merge(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }
}
