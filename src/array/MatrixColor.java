package array;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatrixColor {
    public static void main(String[] args) {
        MatrixColor matrixColor = new MatrixColor();
        int[][] A = {{5, 4, 4}, {4, 3, 4}, {3, 2, 4}, {2, 2, 2}, {3, 3, 4}, {1, 4, 4}, {4, 1, 1}};
        System.out.println(matrixColor.solution(A));
    }

    public int solution(int[][] A) {
        // write your code in Java SE 8

        Map<Integer, List<Point>> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (map.containsKey(A[i][j])) {
                    List<Point> points = map.get(A[i][j]);

                    points.add(new Point(i, j));
                    map.put(A[i][j], points);
                } else {
                    ArrayList<Point> points = new ArrayList<>();
                    Point point = new Point(i, j);
                    points.add(point);
                    map.put(A[i][j], points);
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                List<Point> points = map.get(A[i][j]);

                for (Point point : points) {
                    if ((j != 0 && onLeft(A, point.getX(), point.getY()) != A[i][j]) ||
                        (j != A[i].length - 1 && onRight(A, point.getX(), point.getY()) != A[i][j]) ||
                        (i != A.length - 1 && onDown(A, point.getX(), point.getY()) != A[i][j]) ||
                        (i != 0 && onUp(A, point.getX(), point.getY()) != A[i][j])) {
                        count++;
                    }
                }

            }
        }

        return count;
    }

    private int onLeft(int[][] A, int i, int j) {
        return A[i][Math.max(0, j - 1)];
    }

    private int onRight(int[][] A, int i, int j) {
        return A[i][Math.min(A[i].length - 1, j + 1)];
    }

    private int onDown(int[][] A, int i, int j) {
        return A[Math.min(i + 1, A.length - 1)][j];
    }

    private int onUp(int[][] A, int i, int j) {
        return A[Math.max(i - 1, 0)][j];
    }

    class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }


}
