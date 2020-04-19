package string;

import java.util.Arrays;

public class ReverseWordsInString {
//    Given an input string, reverse the string word by word.
//
//Input: "  hello world!  "
//Output: "world! hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.

    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        return String.join(" ", Arrays.asList(arr)).trim();
    }

    public static void main(String[] args) {
        String s = new ReverseWordsInString().reverseWords("a good   example");
        System.out.println("*" + s + "*");
    }

}
