public class BuyStock5 {
    public static int solve(int prices[], int ind, int check, int fee, int dp[][]) {
        if (ind >= prices.length) return 0;
        if (dp[ind][check] != -1) return dp[ind][check];
        int ans = 0;
        if (check == 1) {
            int inc = -prices[ind] + solve(prices, ind + 1, 0, fee, dp);
            int exc = solve(prices, ind + 1, 1, fee, dp);
            ans = ans + Math.max(inc, exc);
        } else {
            int inc = prices[ind] - fee + solve(prices, ind + 1, 1, fee, dp);
            int exc = solve(prices, ind + 1, 0, fee, dp);
            ans = ans + Math.max(inc, exc);
        }
        return dp[ind][check] = ans;
    }

    public static int maxProfit(int[] prices, int fee) {
        int dp[][] = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(prices, 0, 1, fee, dp);
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int profit = maxProfit(prices, fee);
        System.out.println(profit);
    }
}
