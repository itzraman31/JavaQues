import java.util.*;

public class LongestPalindromeSubseq {
    public static int solve(String s1, String s2, int i, int j, int dp[][]) {
        if (i >= s1.length() || j >= s2.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans += 1 + solve(s1, s2, i + 1, j + 1, dp);
        } else {
            ans = Math.max(solve(s1, s2, i + 1, j, dp), solve(s1, s2, i, j + 1, dp));
        }
        return dp[i][j] = ans;
    }

    public static int longestPalindromeSubseq(String s) {
        StringBuilder str = new StringBuilder(s);
        str = str.reverse();
        int n = s.length();
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(s, str.toString(), 0, 0, dp);
    }

    public static void main(String[] args) {
        String s = "bbbab";
        int result = longestPalindromeSubseq(s);
        System.out.println(result);
    }
}
