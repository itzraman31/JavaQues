import java.util.*;

class CoinChange2 {
    public static int solve(int[] coins, int ind, int amount, int dp[][]) {
        if (amount == 0) {
            return 1;
        }
        if (ind >= coins.length)
            return 0;

        if (dp[ind][amount] != -1)
            return dp[ind][amount];

        int tot = 0;
        int coin = coins[ind];
        for (int i = 0; i * coin <= amount; i++) {
            int sub = amount - (coin * i);
            tot += solve(coins, ind + 1, sub, dp);
        }
        dp[ind][amount] = tot;
        return tot;
    }

    public static int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(coins, 0, amount, dp);
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        System.out.println(change(amount, coins));
    }
}