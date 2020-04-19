package string;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count = s.charAt(i) == ')' ? count - 1 : count + 1;
            if (count < 0) {
                return false;
            }
        }
        if (count == 0) {
            return true;
        }
        count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            count = s.charAt(i) == '(' ? count - 1 : count + 1;
            if (count < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        boolean b = new ValidParenthesisString().checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*");
        boolean b = new ValidParenthesisString().checkValidString("*)");
        System.out.println(b);
    }
}
