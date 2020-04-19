package math;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        return n > 0 && (n & n - 1) == 0;
    }

    public static void main(String[] args) {
        boolean p = new PowerOfTwo().isPowerOfTwo(8);
        System.out.println(p);
    }
}
