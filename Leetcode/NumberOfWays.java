public class NumberOfWays {
    static final int mod = 1000000007;

    public static int solve(int n, int x, int num, int dp[][]) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (dp[n][num] != -1) return dp[n][num];

        int ans = 0;
        for (int i = num; Math.pow(i, x) <= n; i++) {
            ans = (ans + solve((int)(n - Math.pow(i, x)), x, i + 1, dp)) % mod;
        }

        return dp[n][num] = (ans) % mod;
    }

    public static int solve2(int n, int x) {
        int dp[][] = new int[n + 2][n + 2];
        for (int i = 0; i <= n + 1; i++) {
            dp[0][i] = 1;
        }

        for (int j = 1; j <= n; j++) {
            int ans = 0;
            for (int i = j; i >= 1; i--) {
                if ((int)(j - Math.pow(i, x)) >= 0) {
                    ans = (ans + dp[(int)(j - Math.pow(i, x))][i + 1]) % mod;
                    dp[j][i] = ans;
                }
            }
        }

        return dp[n][1];
    }

    public static int numberOfWays(int n, int x) {
        return solve2(n, x);
    }

    public static void main(String[] args) {
        System.out.println(numberOfWays(10, 2));
        System.out.println(numberOfWays(100, 3));
        System.out.println(numberOfWays(5, 2));
    }
}
