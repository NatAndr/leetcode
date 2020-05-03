package string;

import java.util.HashMap;
import java.util.Map;

//Given an arbitrary ransom note string and another string containing letters from all the magazines,
// write a function that will return true if the ransom note can be constructed from the magazines ;
// otherwise, it will return false.
//
//Each letter in the magazine string can only be used once in your ransom note.
//
//Note:
//You may assume that both strings contain only lowercase letters.
//
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c)) return false;
            int count = map.get(c);
            if (count < 1) return false;
            map.put(c, count - 1);
        }

        return true;
    }
}
