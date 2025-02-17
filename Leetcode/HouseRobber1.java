class HouseRobber1 {
    public static int solve(int nums[], int ind, int[] dp) {
        if (ind >= nums.length) {
            return 0;
        }
        if (dp[ind] != -1)
            return dp[ind];
        int ans1 = solve(nums, ind + 1, dp);
        int ans2 = nums[ind] + solve(nums, ind + 2, dp);
        int finalans = Math.max(ans1, ans2);
        dp[ind] = finalans;
        return dp[ind];
    }
    public static int rob(int[] nums) {
        int dp[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = -1;
        }
        return solve(nums, 0, dp);
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }
}