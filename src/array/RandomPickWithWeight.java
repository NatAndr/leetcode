package array;

import java.util.Random;

//Given an array w of positive integers, where w[i] describes the weight of index i,
// write a function pickIndex which randomly picks an index in proportion to its weight.
//
//Note:
//
//1 <= w.length <= 10000
//1 <= w[i] <= 10^5
//pickIndex will be called at most 10000 times.
//Example 1:
//
//Input:
//["Solution","pickIndex"]
//[[[1]],[]]
//Output: [null,0]

public class RandomPickWithWeight {
    private int[] nums;
    private int total;
    private Random rand;

    public RandomPickWithWeight(int[] w) {
        this.nums = new int[w.length];
        this.rand = new Random();

        int runningTotal = 0;
        for (int i = 0; i < w.length; i++) {
            runningTotal += w[i];
            this.nums[i] = runningTotal;
        }

        this.total = runningTotal;
    }

    public int pickIndex() {
        if (this.total == 0)
            return -1;

        int n = this.rand.nextInt(this.total);
        for (int i = 0; i < this.nums.length; i++) {
            if (n < this.nums[i])
                return i;
        }

        return -1;
    }
}
