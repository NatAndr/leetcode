package string;

public class ReverseString {
    public void reverseString(char[] s) {
        if (s.length < 2) {
            return;
        }

        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
//        char[] arr = new char[]{'h','e','l','l','o'};
        char[] arr = new char[]{'M', 'a', 'm', 'a'};

        new ReverseString().reverseString(arr);

    }
}
