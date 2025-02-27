import java.util.*;

class MaximalSquare {
    public static int solve(char[][] matrix, int r, int c, int max[], int dp[][]) {
        if (r >= matrix.length || c >= matrix[0].length) return 0;
        if (dp[r][c] != -1) return dp[r][c];
        int right = solve(matrix, r, c + 1, max, dp);
        int down = solve(matrix, r + 1, c, max, dp);
        int daig = solve(matrix, r + 1, c + 1, max, dp);
        if (matrix[r][c] != '0') {
            dp[r][c] = 1 + Math.min(Math.min(right, down), daig);
            max[0] = Math.max(max[0], dp[r][c]);
            return dp[r][c];
        } else {
            return dp[r][c] = 0;
        }
    }

    public static int maximalSquare(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int max[] = {0};
        int dp[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                dp[i][j] = -1;
            }
        }
        solve(matrix, 0, 0, max, dp);
        return max[0] * max[0];
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        System.out.println(maximalSquare(matrix));
    }
}
