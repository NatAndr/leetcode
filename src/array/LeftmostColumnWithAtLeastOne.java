package array;

import java.util.List;

public class LeftmostColumnWithAtLeastOne {
//    This problem is an interactive problem.)
//
//A binary matrix means that all elements are 0 or 1. For each individual row of the matrix,
// this row is sorted in non-decreasing order.
//
//Given a row-sorted binary matrix binaryMatrix, return leftmost column index(0-indexed)
// with at least a 1 in it. If such index doesn't exist, return -1.
//
//You can't access the Binary Matrix directly.  You may only access the matrix using a BinaryMatrix interface:
//
//BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y) (0-indexed).
//BinaryMatrix.dimensions() returns a list of 2 elements [n, m], which means the matrix is n * m.
//Submissions making more than 1000 calls to BinaryMatrix.get will be judged Wrong Answer.
// Also, any solutions that attempt to circumvent the judge will result in disqualification.
//
//For custom testing purposes you're given the binary matrix mat as input in the following four examples.
// You will not have access the binary matrix directly.
//
//
//
//Example 1:
//Input: mat = [[0,0],[1,1]]
//Output: 0

//    Example 2:
//Input: mat = [[0,0],[0,1]]
//Output: 1

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int m = dimensions.get(0);
        int n = dimensions.get(1);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int l = 0;
            int r = n - 1;
            if (binaryMatrix.get(i, r) == 0) continue;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (binaryMatrix.get(i, mid) == 0) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            min = Math.min(min, r);
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        int i = new LeftmostColumnWithAtLeastOne().leftMostColumnWithOne(new MyBM());
        System.out.println(i);
    }
}
