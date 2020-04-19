package array;

import java.util.Arrays;

public class LastStoneWeight {
//    We have a collection of stones, each stone has a positive integer weight.
//
//Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
//
//If x == y, both stones are totally destroyed;
//If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
//At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }

        int n = stones.length;

        while (true) {
            Arrays.sort(stones);
            int x = stones[n - 2];
            int y = stones[n - 1];

            if (x == 0) {
                return y;
            }

            stones[n - 2] = 0;
            stones[n - 1] = x == y ? 0 : y - x;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 2};

        int i = new LastStoneWeight().lastStoneWeight(arr);
        System.out.println(i);
    }
}
