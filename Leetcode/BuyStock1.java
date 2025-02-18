class BuyStock1 {
    public static int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int minele = prices[0];
        int dp[] = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minele) {
                minele = prices[i];
                dp[i] = minele;
            } else {
                dp[i] = minele;
            }
        }
        int maxele = 0;
        for(int i = 0; i < dp.length; i++) {
            if(prices[i] - dp[i] > maxele) {
                maxele = prices[i] - dp[i];
            }
        }
        return maxele;
    }
    
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
