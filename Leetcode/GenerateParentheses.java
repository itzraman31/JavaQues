import java.util.*;

public class GenerateParentheses {
    
    public static void solve(int n, StringBuilder s, List<String> ans, int dp[]) {
        if (s.length() > 0 && s.charAt(0) == ')') {
            return;
        }

        if (s.length() == n * 2 && dp[0] == dp[1]) {
            ans.add(s.toString());
            return;
        }
        
        if (dp[0] > n) return;
        if (dp[1] > n) return;
        if (dp[0] < dp[1]) return;

        s.append("(");
        dp[0] = dp[0] + 1;
        solve(n, s, ans, dp);
        dp[0] = dp[0] - 1;
        s.deleteCharAt(s.length() - 1);
        
        s.append(")");
        dp[1] = dp[1] + 1;
        solve(n, s, ans, dp);
        dp[1] = dp[1] - 1;
        
        s.deleteCharAt(s.length() - 1);
    }

    public List<String> generateParenthesis(int n) {
        int[] dp = new int[2];
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder("");
        
        solve(n, s, ans, dp);
        return ans;
    }

    public static void main(String[] args) {
        GenerateParentheses solution = new GenerateParentheses();
        int n = 3;
        List<String> result = solution.generateParenthesis(n);

        System.out.println("Generated Parentheses:");
        for (String str : result) {
            System.out.println(str);
        }
    }
}
