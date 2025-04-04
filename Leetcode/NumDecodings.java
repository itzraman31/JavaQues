import java.util.*;

public class NumDecodings {
    public static int solve(String s, int ind, int dp[]) {
        if (ind >= s.length())
            return 1;
        if(s.charAt(ind)=='0') return 0;
        if(dp[ind] != -1) return dp[ind];

        int res = solve(s, ind + 1, dp);
        if (ind + 1 < s.length()) {
            if (s.charAt(ind) == '1' || (s.charAt(ind) == '2' && s.charAt(ind + 1) <= '6')) {
                res += solve(s, ind + 2, dp);
            }
        }
        return dp[ind] = res;
    }

    public static int numDecodings(String s) {
        int dp[] = new int[101];
        Arrays.fill(dp, -1);
        return solve(s, 0, dp);
    }

    public static void main(String[] args) {
        String s = "123";
        System.out.println(numDecodings(s));
    }
}
