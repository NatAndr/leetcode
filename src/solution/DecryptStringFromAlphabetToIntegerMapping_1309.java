package solution;

//You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
//
//Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
//Return the string formed after mapping.
//
//The test cases are generated so that a unique mapping will always exist.

public class DecryptStringFromAlphabetToIntegerMapping_1309 {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        String chars = "_abcdefghijklmnopqrstuvwxyz";

        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                int c1 = s.charAt(i - 1) - '0';
                int c2 = s.charAt(i - 2) - '0';
                sb.append(chars.charAt(c2 * 10 + c1));
                i -= 3;
            } else {
                sb.append(chars.charAt(s.charAt(i) - '0'));
                i--;
            }
        }

        return sb.reverse().toString();
    }
}
