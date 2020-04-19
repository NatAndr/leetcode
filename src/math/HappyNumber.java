package math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

//    Input: 19
//Output: true
//Explanation:
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1

    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();

        while (n > 1 && !numbers.contains(n)) {
            numbers.add(n);
            n = squareSum(n);
        }

        return n == 1;
    }

    public int squareSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        boolean happy = new HappyNumber().isHappy(7);
        System.out.println(happy);
    }
}
