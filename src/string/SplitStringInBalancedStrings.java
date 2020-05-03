package string;

//Balanced strings are those who have equal quantity of 'L' and 'R' characters.
//
//Given a balanced string s split it in the maximum amount of balanced strings.
//
//Return the maximum amount of splitted balanced strings.
//
//
//
//Example 1:
//
//Input: s = "RLRRLLRLRL"
//Output: 4
//Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

public class SplitStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        if (s.equals("")) return 0;

        int balance = 0;
        int res = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int i = new SplitStringInBalancedStrings().balancedStringSplit("");
        System.out.println(i);
    }
}
