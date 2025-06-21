public class MinDistance {
    public static int solve(String s1, String s2, int i, int j, int[][] dp) {
        if (i >= s1.length())
            return s2.length() - j;
        if (j >= s2.length())
            return s1.length() - i;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = solve(s1, s2, i + 1, j + 1, dp);
        } else {
            int ans1 = 1 + solve(s1, s2, i, j + 1, dp);
            int ans2 = 1 + solve(s1, s2, i + 1, j + 1, dp);
            int ans3 = 1 + solve(s1, s2, i + 1, j, dp);
            return dp[i][j] = Math.min(ans1, Math.min(ans2, ans3));
        }
    }

    public static int solve2(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] curr = new int[m + 1];
        int[] next = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            next[i] = m - i;
        }
        for (int i = n - 1; i >= 0; i--) {
            curr[m] = n - i;
            for (int j = m - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    curr[j] = next[j + 1];
                } else {
                    int ans1 = 1 + curr[j + 1];
                    int ans2 = 1 + next[j + 1];
                    int ans3 = 1 + next[j];
                    curr[j] = Math.min(ans1, Math.min(ans2, ans3));
                }
            }
            for (int k = 0; k <= m; k++) {
                next[k] = curr[k];
            }
        }
        return next[0];
    }

    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n == 0 || m == 0)
            return Math.max(n, m);
        return solve2(word1, word2);
    }

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        int result = minDistance(word1, word2);
        System.out.println(result);
    }
}
