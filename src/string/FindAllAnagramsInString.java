package string;

//Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
//
//Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
//
//The order of output does not matter.
//
//Example 1:
//
//Input:
//s: "cbaebabacd" p: "abc"
//
//Output:
//[0, 6]
//
//Explanation:
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".
//Example 2:
//
//Input:
//s: "abab" p: "ab"
//
//Output:
//[0, 1, 2]
//
//Explanation:
//The substring with start index = 0 is "ab", which is an anagram of "ab".
//The substring with start index = 1 is "ba", which is an anagram of "ab".
//The substring with start index = 2 is "ab", which is an anagram of "ab".

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if (s.length() < p.length()) {
            return list;
        }

        char[] charsP = p.toCharArray();
        Arrays.sort(charsP);
        String pSorted = new String(charsP);

        String substring;
        String substringSorted;
        int i = 0;
        while (i <= s.length() - p.length()) {
            substring = s.substring(i, i + p.length());
            char[] chars = substring.toCharArray();
            Arrays.sort(chars);
            substringSorted = new String(chars);
            if (substringSorted.equals(pSorted)) {
                list.add(i);
            }
            i++;
        }

        return list;
    }

    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if (s.length() < p.length()) {
            return list;
        }

        int i = 0;
        while (i <= s.length() - p.length()) {
            if (isAnagram(s.substring(i, i + p.length()), p)) {
                list.add(i);
            }
            i++;
        }

        return list;
    }

    private boolean isAnagram(String s1, String s2) {
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

    public static void main(String[] args) {
//        List<Integer> list = new FindAllAnagramsInString().findAnagrams_optimized("cbaebabacd", "abc");
        List<Integer> list = new FindAllAnagramsInString().findAnagrams2("abab", "ab");
        System.out.println(list.toString());
    }
}
