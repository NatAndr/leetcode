package bitwise;

//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//
//Given two integers x and y, calculate the Hamming distance.
//
//Note:
//0 ≤ x, y < 231.
//
//Example:
//
//Input: x = 1, y = 4
//
//Output: 2
//
//Explanation:
//1   (0 0 0 1)
//4   (0 1 0 0)
//       ↑   ↑
//
//The above arrows point to positions where the corresponding bits are different.

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int b1 = x >>> i & 1;
            int b2 = y >>> i & 1;
            if ((b1 ^ b2) == 1) {
                res++;
            }
        }

        return res;
    }
}
