package string;

import java.util.Arrays;

public class ReverseStringII {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            swap(s, i, j);
            i++;
            j--;
        }
    }

    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};

        new ReverseStringII().reverseString(arr);

        System.out.println(Arrays.toString(arr));
    }
}
