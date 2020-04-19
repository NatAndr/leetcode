package string;

public class PerformStringShifts {
//    You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:
//
//direction can be 0 (for left shift) or 1 (for right shift).
//amount is the amount by which string s is to be shifted.
//A left shift by 1 means remove the first character of s and append it to the end.
//Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
//Return the final string after all operations.
//
//
//
//Example 1:
//
//Input: s = "abc", shift = [[0,1],[1,2]]
//Output: "cab"
//Explanation:
//[0,1] means shift to left by 1. "abc" -> "bca"
//[1,2] means shift to right by 2. "bca" -> "cab"

    public String stringShift(String s, int[][] shift) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        int sum = 0;
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0) {
                sum -= shift[i][1];
            } else {
                sum += shift[i][1];
            }
        }

        if (sum == 0) {
            return s;
        }

        if (sum > 0) {
            for (int j = 0; j < sum; j++) {
                sb.insert(0, sb.charAt(n - 1)).deleteCharAt(sb.length() - 1);
            }
        } else {
            for (int j = 0; j < -sum; j++) {
                sb.append(sb.charAt(0)).deleteCharAt(0);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 1}, {1, 2}};
        String s = new PerformStringShifts().stringShift("abc", arr);
        System.out.println(s);
    }
}
