import java.util.*;

class Pair {
    int r, c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class SetZeroes {
    public static void setZero(int arr[][], int r, int c) {
        int col = arr[0].length, row = arr.length;
        for (int i = 0; i < col; i++) arr[r][i] = 0;
        for (int i = 0; i < row; i++) arr[i][c] = 0;
    }

    public static void solve(int arr[][]) {
        Set<Pair> st = new HashSet<>();
        int r = arr.length, c = arr[0].length;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (arr[i][j] == 0) st.add(new Pair(i, j));

        for (Pair p : st) setZero(arr, p.r, p.c);
    }

    public static void setZeroes(int[][] matrix) {
        solve(matrix);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
