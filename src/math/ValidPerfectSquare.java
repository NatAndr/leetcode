package math;

//Given a positive integer num, write a function which returns True if num is a perfect square else False.
//
//Note: Do not use any built-in library function such as sqrt.
//
//Example 1:
//
//Input: 16
//Output: true
//Example 2:
//
//Input: 14
//Output: false

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int last = num % 10;
        if (last == 2 || last == 3 || last == 7 || last == 8) {
            return false;
        }

        long lo = 1;
        long hi = num;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long sq = mid * mid;
            if (sq == num) {
                return true;
            }
            if (sq < num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean perfectSquare = new ValidPerfectSquare().isPerfectSquare(808201);
        System.out.println(perfectSquare);
    }
}
