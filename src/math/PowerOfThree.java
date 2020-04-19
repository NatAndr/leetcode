package math;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }

    public static void main(String[] args) {
        boolean powerOfThree = new PowerOfThree().isPowerOfThree(27);
        System.out.println(powerOfThree);
    }
}
