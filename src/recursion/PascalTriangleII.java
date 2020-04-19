package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return new ArrayList<>(Arrays.asList(1));
        }

        List<Integer> prev = getRow(rowIndex - 1);
        List<Integer> cur = new ArrayList<>(Arrays.asList(1));

        for (int i = 0; i < prev.size() - 1; i++) {
            cur.add(prev.get(i) + prev.get(i + 1));
        }

        cur.add(1);

        return cur;
    }

    public static void main(String[] args) {
        List<Integer> row = new PascalTriangleII().getRow(4);
        System.out.println(Arrays.toString(row.toArray()));
    }
}
