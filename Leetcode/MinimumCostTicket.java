import java.util.*;

public class MinimumCostTicket {
    public static int solve(int[] days, int[] cost, int ind, int[] dp) {
        if (ind >= days.length)
            return 0;
        if (dp[ind] != -1)
            return dp[ind];

        int ans1 = cost[0] + solve(days, cost, ind + 1, dp);

        int i;
        for (i = ind; i < days.length && days[i] < days[ind] + 7; i++);
        int ans2 = cost[1] + solve(days, cost, i, dp);

        for (i = ind; i < days.length && days[i] < days[ind] + 30; i++);
        int ans3 = cost[2] + solve(days, cost, i, dp);

        dp[ind] = Math.min(ans1, Math.min(ans2, ans3));
        return dp[ind];
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        Arrays.fill(dp, -1);
        return solve(days, costs, 0, dp);
    }

    public static void main(String[] args) {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        System.out.println(mincostTickets(days, costs));
    }
}
