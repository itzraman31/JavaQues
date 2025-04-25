public class BuyStock4 {
    public static int solve(int prices[], int ind, int check, int k, int dp[][][]) {
        if (ind >= prices.length || k == 0) return 0;
        if (dp[ind][check][k] != -1) return dp[ind][check][k];
        int ans = 0;
        if (check == 1) {
            int inc = -prices[ind] + solve(prices, ind + 1, 0, k, dp);
            int exc = solve(prices, ind + 1, 1, k, dp);
            ans = ans + Math.max(inc, exc);
        } else {
            int inc = prices[ind] + solve(prices, ind + 1, 1, k - 1, dp);
            int exc = solve(prices, ind + 1, 0, k, dp);
            ans = ans + Math.max(inc, exc);
        }
        return dp[ind][check][k] = ans;
    }

    public static int maxProfit(int kk, int[] prices) {
        int dp[][][] = new int[prices.length][2][kk + 1];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k <= kk; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return solve(prices, 0, 1, kk, dp);
    }

    public static void main(String[] args) {
        int[] prices = {3, 2, 6, 5, 0, 3};
        int k = 2;
        int result = maxProfit(k, prices);
        System.out.println(result);
    }
}
