package string;

//Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
//
//
//
//Example 1:
//
//Input: "Hello"
//Output: "hello"
//Example 2:
//
//Input: "here"
//Output: "here"
//Example 3:
//
//Input: "LOVELY"
//Output: "lovely"

public class ToLowerCase {
    public String toLowerCase(String str) {
        char dif = 'a' - 'A';
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i) <= 'Z' && str.charAt(i) >='A'
                ? (char)(str.charAt(i) + dif) : str.charAt(i);

            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new ToLowerCase().toLowerCase("Mama");
        System.out.println(s);
    }

}
