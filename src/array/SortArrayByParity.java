package array;

public class SortArrayByParity {
//    Given an array A of non-negative integers, return an array consisting of all the even elements of A,
//    followed by all the odd elements of A.
//
//You may return any answer array that satisfies this condition.
//
//
//
//Example 1:
//
//Input: [3,1,2,4]
//Output: [2,4,3,1]
//The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted

    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];

        int i = 0;
        int j = A.length - 1;

        for (int k = 0; k < A.length; k++) {
            if (A[k] % 2 == 0) {
                res[i++] = A[k];
            } else {
                res[j--] = A[k];
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
