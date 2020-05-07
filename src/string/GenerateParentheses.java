package string;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//For example, given n = 3, a solution set is:
//
//[
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        generate(list, "", 0, 0, n);

        return list;
    }

    private void generate(List<String> list, String str, int open, int closed, int n) {
        if (str.length() == n * 2) {
            list.add(str);
            return;
        }

        if (open < n) {
            generate(list, str + "(", open + 1, closed, n);
        }
        if (closed < open) {
            generate(list, str + ")", open, closed + 1, n);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new GenerateParentheses().generateParenthesis(3);
        System.out.println(strings);
    }

}
