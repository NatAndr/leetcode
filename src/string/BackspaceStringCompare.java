package string;

import java.util.Stack;

public class BackspaceStringCompare {
//    Given two strings S and T, return if they are equal when both are typed into empty text editors.
//    # means a backspace character.

//    Input: S = "ab#c", T = "ad#c"
//Output: true
//Explanation: Both S and T become "ac".

//    Input: S = "a##c", T = "#a#c"
//Output: true
//Explanation: Both S and T become "c".

    public boolean backspaceCompare(String S, String T) {
        return doReplacement(S).equals(doReplacement(T));
    }

    private String doReplacement(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        return String.valueOf(stack);
    }

    public static void main(String[] args) {
        String s1 = "a##c";
        String s2 = "##c";
        String s3 = "ad#c";
        String s4 = "#a#c";
        String s5 = "c";
        String s6 = "#";
        String s7 = "#######d";
        String s8 = "d#######";
        String s9 = "ab#c";
        String s = new BackspaceStringCompare().doReplacement("ad#c");
        boolean b = new BackspaceStringCompare().backspaceCompare("ab##", "c#d#");
        System.out.println(b);
    }
}
