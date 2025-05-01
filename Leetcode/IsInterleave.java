public class IsInterleave {
    public static boolean solve(String s1, String s2, String s3, int ind1, int ind2, Boolean dp[][]) {
        if (ind1 >= s1.length() && ind2 >= s2.length()) return true;
        if (dp[ind1][ind2] != null) return dp[ind1][ind2];

        if (ind1 < s1.length() && s1.charAt(ind1) == s3.charAt(ind1 + ind2)) {
            if (solve(s1, s2, s3, ind1 + 1, ind2, dp)) return dp[ind1][ind2] = true;
        }

        if (ind2 < s2.length() && s2.charAt(ind2) == s3.charAt(ind1 + ind2)) {
            if (solve(s1, s2, s3, ind1, ind2 + 1, dp)) return dp[ind1][ind2] = true;
        }

        return dp[ind1][ind2] = false;
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        Boolean dp[][] = new Boolean[s1.length() + 1][s2.length() + 1];
        return solve(s1, s2, s3, 0, 0, dp);
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "axy";
        String s3 = "aaxaby";
        System.out.println(isInterleave(s1, s2, s3));
    }
}
