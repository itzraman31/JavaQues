import java.util.*;

class WildcardMatch {
    public static boolean solve(String s, String p, int i, int j, Boolean dp[][]) {
        if (i < 0 && j < 0)
            return true;
        if (i >= 0 && j < 0)
            return false;

        if (i < 0 && j >= 0) {
            for (int k = 0; k <= j; k++) {
                if (p.charAt(k) != '*')
                    return false;
            }
            return true;
        }

        if (dp[i][j] != null)
            return dp[i][j];
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')
            return dp[i][j] = solve(s, p, i - 1, j - 1, dp);
        else if (p.charAt(j) == '*') {
            return dp[i][j] = (solve(s, p, i - 1, j, dp) || solve(s, p, i, j - 1, dp));
        }

        return dp[i][j] = false;
    }

    public static boolean isMatch(String s, String p) {
        Boolean dp[][] = new Boolean[s.length()][p.length()];
        return solve(s, p, s.length() - 1, p.length() - 1, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println("Enter the pattern:");
        String p = sc.nextLine();
        
        System.out.println(isMatch(s, p));

    }
}
