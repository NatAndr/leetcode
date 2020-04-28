package design;

//You have a queue of integers, you need to retrieve the first unique integer in the queue.
//
//Implement the FirstUnique class:
//
//FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
//int showFirstUnique() returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
//void add(int value) insert value to the queue.

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique {
    private Map<Integer, Integer> map = new LinkedHashMap<>();

    public FirstUnique(int[] nums) {
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    public int showFirstUnique() {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public void add(int value) {
        map.put(value, map.getOrDefault(value, 0) + 1);
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */