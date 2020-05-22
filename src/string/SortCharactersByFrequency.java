package string;

//Input:
//"tree"
//
//Output:
//"eert"
//
//Explanation:
//'e' appears twice while 'r' and 't' both appear once.
//So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//Example 2:
//
//Input:
//"cccaaa"
//
//Output:
//"cccaaa"
//
//Explanation:
//Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
//Note that "cacaca" is incorrect, as the same characters must be together.
//Example 3:
//
//Input:
//"Aabb"
//
//Output:
//"bbAa"
//
//Explanation:
//"bbaA" is also a valid answer, but "Aabb" is incorrect.
//Note that 'A' and 'a' are treated as two different characters.

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        if (s.isEmpty()) {
            return s;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEach(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        sb.append(entry.getKey());
                    }
                }
            );

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new SortCharactersByFrequency().frequencySort("tree");
        System.out.println(s);
    }
}
