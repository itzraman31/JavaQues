import java.util.*;

public class UniquePaths {
    public static boolean check(ArrayList<ArrayList<Integer>> mat, int m, int n, int i, int j, boolean vis[][]) {
        if (i >= 0 && i < m && j >= 0 && j < n && mat.get(i).get(j) == 1 && !vis[i][j]) {
            return true;
        }
        return false;
    }

    public static int solve(ArrayList<ArrayList<Integer>> mat, int m, int n, int i, int j, boolean vis[][], int[][] dp) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        vis[i][j] = true;
        int ans1 = 0;
        int ans2 = 0;
        if (check(mat, m, n, i + 1, j, vis)) {
            ans1 = solve(mat, m, n, i + 1, j, vis, dp);
        }
        if (check(mat, m, n, i, j + 1, vis)) {
            ans2 = solve(mat, m, n, i, j + 1, vis, dp);
        }
        dp[i][j] = ans1 + ans2;
        vis[i][j] = false;
        return dp[i][j];
    }

    public static int uniquePaths(int m, int n) {
        boolean vis[][] = new boolean[m][n];
        int[][] dp = new int[m][n];
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(1);
            }
            mat.add(row);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(mat, m, n, 0, 0, vis, dp);
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m, n));
    }
}
