package solution;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.

import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (c == ')' && stack.peek() == '(' ||
                        c == '}' && stack.peek() == '{' ||
                        c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
