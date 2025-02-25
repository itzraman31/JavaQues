import java.util.Arrays;

class IntegerBreak {
    public static int solve(int n, int dp[]) {
        if (n == 1) return 1;
        if (dp[n] != -1) return dp[n];

        int maxi = 0;
        for (int i = 1; i < n; i++) {
            int ans = Math.max(i * (n - i), i * solve(n - i, dp));
            maxi = Math.max(ans, maxi);
        }
        dp[n] = maxi;
        return maxi;
    }

    public static int integerBreak(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
}
