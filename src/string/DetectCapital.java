package string;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }

        boolean flag = true;

        for (int i = 1; i < word.length() - 1; i++) {
            boolean upperCaseNext = Character.isUpperCase(word.charAt(i + 1));
            boolean upperCaseCurrent = Character.isUpperCase(word.charAt(i));
            if (upperCaseCurrent && !upperCaseNext || !upperCaseCurrent && upperCaseNext) {
                flag = false;
                break;
            }
        }

        if (!flag) {
            return false;
        }

        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1)) ||
            !Character.isUpperCase(word.charAt(0)) && !Character.isUpperCase(word.charAt(1))) {
            return true;
        }

        return Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {
        boolean capitalUse = new DetectCapital().detectCapitalUse("USA");
        System.out.println(capitalUse);
    }
}
