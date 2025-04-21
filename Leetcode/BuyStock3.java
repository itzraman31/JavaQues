public class BuyStock3 {
    public static int solve(int prices[], int ind, int check, int tot, int dp[][][]) {
        if (ind >= prices.length || tot == 0) return 0;
        if (dp[ind][check][tot] != -1) return dp[ind][check][tot];

        int ans = 0;
        if (check == 1) {
            int inc = -prices[ind] + solve(prices, ind + 1, 0, tot, dp);
            int exc = solve(prices, ind + 1, 1, tot, dp);
            ans = ans + Math.max(inc, exc);
        } else {
            int inc = prices[ind] + solve(prices, ind + 1, 1, tot - 1, dp);
            int exc = solve(prices, ind + 1, 0, tot, dp);
            ans = ans + Math.max(inc, exc);
        }
        return dp[ind][check][tot] = ans;
    }

    public static int maxProfit(int[] prices) {
        int dp[][][] = new int[prices.length][2][4];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 4; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return solve(prices, 0, 1, 2, dp);
    }
}
