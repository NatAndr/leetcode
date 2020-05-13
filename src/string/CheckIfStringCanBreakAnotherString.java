package string;

import java.util.Arrays;

public class CheckIfStringCanBreakAnotherString {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean res1 = true;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] < chars2[i]) {
                res1 = false;
                break;
            }
        }

        boolean res2 = true;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] > chars2[i]) {
                res2 = false;
                break;
            }
        }

        return res1 || res2;
    }
}
