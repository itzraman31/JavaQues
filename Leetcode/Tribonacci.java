import java.util.*;

public class Tribonacci {
    public static int solve(int n, int dp[]) {
        if (n == 0) return n;
        if (n == 1 || n == 2) return 1;
        if (dp[n] != -1) return dp[n];
        return dp[n] = solve(n - 1, dp) + solve(n - 2, dp) + solve(n - 3, dp);
    }

    public static int tribonacci(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(tribonacci(n));
    }
}
