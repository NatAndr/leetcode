package math;

public class ComputeBinary {
//    Write a method to compute the binary representation of a positive integer. The method should return a string with 1s and 0s.
//
//computeBinary(6) ==> "110"
//computeBinary(5) ==> "101"
//
//Note: Use the minimum number of binary digits needed for the representation (Truncate unnecessary trailing 0s).
//computeBinary(5) ==> "0101" (incorrect)
//computeBinary(5) ==> "101" (correct)

    public static String computeBinary(int val) {
        if (val == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while (val >= 2) {
            int v = val % 2;
            sb.append(val);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = ComputeBinary.computeBinary(6);
        System.out.println(s);
    }
}
