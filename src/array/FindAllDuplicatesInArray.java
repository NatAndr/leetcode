package array;

//Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements that appear twice in this array.
//
//Could you do it without extra space and in O(n) runtime?
//
//Example:
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[2,3]

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = Math.abs(nums[i]);
            if (nums[j - 1] < 0) {
                list.add(j);
            } else {
                nums[j - 1] = -1 * nums[j - 1];
            }
        }

        return list;
    }
}
