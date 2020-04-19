package string;

public class AddBinary {
//     1 +
//    11 =
//   100

    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();

        int i = m - 1;
        int j = n - 1;
        char add = '0';
        char c1;
        char c2;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            c1 = i >= 0 ? a.charAt(i) : '0';
            c2 = j >= 0 ? b.charAt(j) : '0';

            if (c1 == '0' && c2 == '0') {
                sb.append(add);
                add = '0';
            } else if (c1 == '1' && c2 == '1') {
                sb.append(add);
                add = '1';
            } else {
                sb.append(add == '1' ? '0' : '1');
            }
            i--;
            j--;
        }

        if (add == '1') {
            sb.append(add);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = new AddBinary().addBinary("111", "111");
        System.out.println(s);
    }
}
