import java.util.*;

class ReduceDishes {
    public static int solve(int[] satisfaction, int ind, int time, int dp[][]) {
        if (ind >= satisfaction.length)
            return 0;
        if (dp[ind][time] != -1)
            return dp[ind][time];

        int ans1 = (satisfaction[ind] * time) + solve(satisfaction, ind + 1, time + 1, dp);
        int ans2 = solve(satisfaction, ind + 1, time, dp);

        dp[ind][time] = Math.max(ans1, ans2);
        return dp[ind][time];
    }

    public static int solve2(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int dp[][] = new int[satisfaction.length + 1][satisfaction.length + 1];
        int n = satisfaction.length;
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int ans1 = (satisfaction[i] * (j + 1)) + dp[i + 1][j + 1];
                int ans2 = dp[i + 1][j];
                dp[i][j] = Math.max(ans1, ans2);
            }
        }
        return dp[0][0];
    }

    public static int solve3(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int curr[] = new int[n + 1];
        int next[] = new int[n + 1];
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int ans1 = (satisfaction[i] * (j + 1)) + next[j + 1];
                int ans2 = next[j];
                curr[j] = Math.max(ans1, ans2);
            }
            for (int k = 0; k <= n; k++) {
                next[k] = curr[k];
            }
        }
        return next[0];
    }

    public static int maxSatisfaction(int[] satisfaction) {
        return solve3(satisfaction);
    }

    public static void main(String[] args) {
        int[] satisfaction = {-1, 0, 1, 2, 3};
        System.out.println(maxSatisfaction(satisfaction));
    }
}
