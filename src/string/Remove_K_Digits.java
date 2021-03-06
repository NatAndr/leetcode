package string;

//Given a non-negative integer num represented as a string, remove k digits from the number so that
// the new number is the smallest possible.
//
//Note:
//The length of num is less than 10002 and will be ≥ k.
//The given num does not contain any leading zero.
//Example 1:
//
//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
//Example 2:
//
//Input: num = "10200", k = 1
//Output: "200"
//Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
//Example 3:
//
//Input: num = "10", k = 2
//Output: "0"
//Explanation: Remove all the digits from the number and it is left with nothing which is 0.

import java.util.Stack;

public class Remove_K_Digits {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == 0) return num;
        if (k == len) return "0";

        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < len) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i++));
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        String smallest = "";
        while (!stack.isEmpty()) {
            smallest = stack.pop() + smallest;
        }

        while (smallest.length() > 1 && smallest.startsWith("0"))
            smallest = smallest.substring(1);

        return smallest;
    }
}
