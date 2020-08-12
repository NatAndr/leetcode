package math;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int diff = s.charAt(i) - 'A' + 1;
            sum *= sum * 26 + diff;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = new ExcelSheetColumnNumber().titleToNumber("ABC");
        System.out.println(number);
    }
}
