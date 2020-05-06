package array;

//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//
//Note: The algorithm should run in linear time and in O(1) space.
//
//Example 1:
//
//Input: [3,2,3]
//Output: [3]
//Example 2:
//
//Input: [1,1,1,3,3,2,2,2]
//Output: [1,2]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > nums.length / 3 && !list.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }
}
