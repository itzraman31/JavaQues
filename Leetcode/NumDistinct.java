import java.util.Arrays;

public class NumDistinct {
    public static int solve(String s, String t, int ind1, int ind2, int dp[][]) {
        if (ind2 >= t.length()) return 1;
        if (ind1 >= s.length()) return 0;
        if (dp[ind1][ind2] != -1) return dp[ind1][ind2];

        int res = 0;
        if (s.charAt(ind1) == t.charAt(ind2)) {
            res += solve(s, t, ind1 + 1, ind2 + 1, dp);
        }
        res += solve(s, t, ind1 + 1, ind2, dp);

        return dp[ind1][ind2] = res;
    }

    public static int numDistinct(String s, String t) {
        if (s.length() < t.length()) return 0;
        int dp[][] = new int[s.length() + 1][t.length() + 1];

        for (int i = 0; i <= s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(s, t, 0, 0, dp);
    }

    public static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";
        System.out.println(numDistinct(s, t));
    }
}
