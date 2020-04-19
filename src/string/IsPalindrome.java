package string;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s == "") return true;

        String s2 = s.toLowerCase().replaceAll("[^0-9a-z]", "");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
