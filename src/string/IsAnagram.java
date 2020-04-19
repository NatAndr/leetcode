package string;

import java.util.HashSet;
import java.util.Set;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i<s.length(); i++) {
            set1.add(s.charAt(i));
        }

        for (int i = 0; i<t.length(); i++) {
            set2.add(t.charAt(i));
        }

        return set1.retainAll(set2) && set2.containsAll(set1);
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        boolean anagram = new IsAnagram().isAnagram(s1, s2);
        System.out.println(anagram);
    }
}
