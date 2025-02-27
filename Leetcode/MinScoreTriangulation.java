public class MinScoreTriangulation {
    public static int solve(int values[], int i, int j, int dp[][]) {
        if (i + 1 == j) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            int ans = values[i] * values[j] * values[k] + solve(values, i, k, dp) + solve(values, k, j, dp);
            min = Math.min(ans, min);
        }
        dp[i][j] = min;
        return min;
    }

    public static int minScoreTriangulation(int[] values) {
        int dp[][] = new int[values.length + 1][values.length + 1];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(values, 0, values.length - 1, dp);
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        System.out.println(minScoreTriangulation(values));
    }
}
