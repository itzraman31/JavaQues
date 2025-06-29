import java.util.*;

public class LongestCommonSubsequence {
    public static int solve(String s1, String s2, int i, int j, int[][] dp) {
        if (i >= s1.length() || j >= s2.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = 1 + solve(s1, s2, i + 1, j + 1, dp);
        } else {
            ans = Math.max(solve(s1, s2, i + 1, j, dp), solve(s1, s2, i, j + 1, dp));
        }
        return dp[i][j] = ans;
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(text1, text2, 0, 0, dp);
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2));
    }
}
