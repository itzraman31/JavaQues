import java.util.Arrays;

public class IsMatch {
    public static boolean solve(String s, String p, int i, int j, int dp[][]) {
        if (i >= s.length() && j >= p.length())
            return true;
        if (j >= p.length())
            return false;
        if (i < s.length() && dp[i][j] != -1)
            return dp[i][j] == 0;
        boolean ans = false;
        boolean ismatch = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            boolean nt = solve(s, p, i, j + 2, dp);
            boolean t = (ismatch && solve(s, p, i + 1, j, dp));
            ans = nt || t;
        } else if (ismatch) {
            ans = solve(s, p, i + 1, j + 1, dp);
        }
        dp[i][j] = ans ? 0 : 1;
        return ans;
    }

    public static boolean isMatch(String s, String p) {
        int dp[][] = new int[s.length() + 1][p.length() + 1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return solve(s, p, 0, 0, dp);
    }

    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";
        System.out.println(isMatch(s, p));
    }
}
