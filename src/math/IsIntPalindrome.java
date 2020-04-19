package math;

public class IsIntPalindrome {
    public Boolean isIntPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        int num = x;
        int i = 0;

        while (num > 0) {
            i = i * 10 + num % 10;
            num = num / 10;
        }

        return i == x;
    }

    public static void main(String[] args) {
        Boolean b = new IsIntPalindrome().isIntPalindrome(1221);
        System.out.println(b);
    }
}
