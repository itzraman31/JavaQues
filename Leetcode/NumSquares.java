import java.util.Arrays;

public class NumSquares {
    public static int solve(int n, int dp[]) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MAX_VALUE;
        if (dp[n] != -1) return dp[n];

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            int ans = solve(n - (i * i), dp);
            if (ans != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + ans);
            }
        }
        return dp[n] = min;
    }

    public static int solve2(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                if (i - (j * j) >= 0) {
                    int ans = dp[i - (j * j)];
                    min = Math.min(min, 1 + ans);
                }
            }
            dp[i] = min;
        }

        return dp[n];
    }

    public static int numSquares(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve2(n);
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }
}
