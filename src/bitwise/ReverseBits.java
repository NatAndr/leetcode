package bitwise;

//Reverse bits of a given 32 bits unsigned integer.

public class ReverseBits {
    public int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int k = n >>> i & 1;
            res += k << (31 - i);
        }

        return res;
    }
}
