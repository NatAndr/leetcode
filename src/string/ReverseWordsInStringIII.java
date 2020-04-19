package string;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInStringIII {
//    Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//Example 1:
//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
//Note: In the string, each word is separated by single space and there will not be any extra space in the string.

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        List<String> list = new ArrayList<>();

        for (String str : arr) {
            list.add(new StringBuilder().append(str).reverse().toString());
        }

        return String.join(" ", list);
    }

    public static void main(String[] args) {
        String s = new ReverseWordsInStringIII().reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }
}
