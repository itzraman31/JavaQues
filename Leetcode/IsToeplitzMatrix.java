import java.util.*;

public class IsToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < c - 1; i++) {
            int d = i;
            for (int j = 0; j < r - 1; j++) {
                if (j < r - 1 && d < c - 1) {
                    if (matrix[j][d] != matrix[j + 1][d + 1]) {
                        return false;
                    }
                }
                d++;
            }
        }
        for (int i = 1; i < r - 1; i++) {
            int d = i;
            for (int j = 0; j < c - 1; j++) {
                if (j < c - 1 && d < r - 1) {
                    if (matrix[d][j] != matrix[d + 1][j + 1]) {
                        return false;
                    }
                }
                d++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {9, 5, 1, 2}
        };
        System.out.println(isToeplitzMatrix(matrix));
    }
}
