package string;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.length() - i < needle.length()) return -1;
            String substring = haystack.substring(i, i + needle.length());
            if (substring.equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int i = new StrStr().strStr("aaaaa", "bba");
        System.out.println(i);
    }
}
