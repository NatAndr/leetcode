package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductOfArrayExceptSelf {

//    Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//Example:
//
//Input:  [1,2,3,4]
//Output: [24,12,8,6]

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int p = 1;
            for (int j = 0; j < nums.length; j++) {
                int num = j == i ? 1 : nums[j];
                p *= num;
            }

            res[i] = p;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int[] ints = new ProductOfArrayExceptSelf().productExceptSelf(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static String compressString(String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue() > 1 ? entry.getValue() : "");
        }

        return sb.toString();
    }

}
