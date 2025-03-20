import java.util.*;

public class MaxSq {
    public static int solve(int[][] matrix, int r, int c, int[] max) {
        if (r >= matrix.length || c >= matrix[0].length || matrix[r][c] == 0)
            return 0;

        int rowno = solve(matrix, r, c + 1, max);
        int diagno = solve(matrix, r + 1, c + 1, max);

        int ans = 0;
        if (matrix[r][c] == 1) {
            ans += 1 + Math.min(rowno, diagno);
            max[0] = Math.max(ans, max[0]);
            return max[0];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int max[] = new int[1];
        int matrix[][] = { { 1, 0, 0, 1, 0 }, { 1, 1, 0, 1, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };
        solve(matrix, 0, 0, max);
        System.out.println("Max Square is: " + max[0] * max[0]);
    }
}

// 1 0 0 1 0
// 1 1 0 1 0
// 1 0 1 1 1
// 1 1 1 1 1
// 1 1 1 1 1