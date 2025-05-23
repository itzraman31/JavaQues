import java.util.Arrays;

public class NumTrees {
    public static int solve(int n, int dp[]) {
        if (n <= 1) return 1;
        if (dp[n] != -1) return dp[n];

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += solve(i - 1, dp) * solve(n - i, dp);
        }
        return dp[n] = ans;
    }

    public static int numTrees(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(numTrees(n));
    }
}
