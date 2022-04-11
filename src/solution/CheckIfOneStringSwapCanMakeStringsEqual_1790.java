package solution;

//You are given two strings s1 and s2 of equal length.
// A string swap is an operation where you choose two indices in a string
// (not necessarily different) and swap the characters at these indices.
//
//Return true if it is possible to make both strings equal by performing
// at most one string swap on exactly one of the strings.
// Otherwise, return false.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfOneStringSwapCanMakeStringsEqual_1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        List<Integer> list = new ArrayList<>(2);

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                list.add(i);
                if (list.size() > 2) return false;
            }
        }

        if (list.size() == 0) return true;
        if (list.size() == 1) return false;

        char[] s2Chars = s2.toCharArray();
        char temp = s2Chars[list.get(0)];
        s2Chars[list.get(0)] = s2Chars[list.get(1)];
        s2Chars[list.get(1)] = temp;

        return Arrays.equals(s1.toCharArray(), s2Chars);
    }
}
