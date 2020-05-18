package string;

//Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
//
//
//
//Example 1:
//
//Input: s1 = "ab" s2 = "eidbaooo"
//Output: True
//Explanation: s2 contains one permutation of s1 ("ba").
//Example 2:
//
//Input:s1= "ab" s2 = "eidboaoo"
//Output: False
//
//
//Note:
//
//The input strings only contain lower case letters.
//The length of both given strings is in range [1, 10,000].

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        int i = 0;
        while (i <= s2.length() - s1.length()) {
            if (isPermutation(s2.substring(i, i + s1.length()), s1)) {
                return true;
            }
            i += s1.length();
        }

        return false;
    }

    private boolean isPermutation(String s1, String s2) {
        int[] chars = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }

        for (int c : chars) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
