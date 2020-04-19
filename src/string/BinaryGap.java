package string;

import java.util.stream.Stream;

/**
 * Find longest sequence of zeros in binary representation of an integer.
 *
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros
 * that is surrounded by ones at both ends in the binary representation of N.
 */

public class BinaryGap {

    public int solution(int N) {
        String string = Integer.toBinaryString(N);
        if (!string.contains("1")) {
            return 0;
        }
        int first = string.indexOf("1");
        int last = string.lastIndexOf("1");
        if (first == last) {
            return 0;
        }

        string = string.substring(first, last);

        return Stream.of(string.split("1"))
            .map(String::length)
            .mapToInt(Integer::intValue)
            .max()
            .orElse(0);
    }

    public static void main(String[] args) {
        int i = new BinaryGap().solution(15);
        System.out.println(" " + i);
    }
}
