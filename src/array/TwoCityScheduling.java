package array;

import java.util.Arrays;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int totalCost = 0;
        for (int[] cost : costs)
            totalCost += cost[0];

        int n = costs.length;
        int[] refund = new int[n];
        for (int i = 0; i < n; i++)
            refund[i] = costs[i][1] - costs[i][0];

        Arrays.sort(refund);

        for (int i = 0; i < n / 2; i++)
            totalCost += refund[i];

        return totalCost;
    }
}
