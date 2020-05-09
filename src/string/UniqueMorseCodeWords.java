package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                String code = codes[idx];
                sb.append(code);
            }
            set.add(sb.toString());
        }

        return set.size();
    }

    public static void main(String[] args) {
        int i = new UniqueMorseCodeWords().uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        System.out.println(i);
    }
}
