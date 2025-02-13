import java.util.Arrays;

class HouseRobber2 {
    public static int solve(int nums[], int ind, int[] dp) {
        if (ind >= nums.length) {
            return 0;
        }
        if (dp[ind] != -1)
            return dp[ind];
        int ans1 = solve(nums, ind + 1, dp);
        int ans2 = nums[ind] + solve(nums, ind + 2, dp);
        dp[ind] = Math.max(ans1, ans2);
        return dp[ind];
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int dp[] = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        int arr1[] = new int[nums.length - 1];
        int arr2[] = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) arr1[i] = nums[i];
        for (int i = 1; i < nums.length; i++) arr2[i - 1] = nums[i];
        int ans1 = solve(arr1, 0, dp);
        Arrays.fill(dp, -1);
        int ans2 = solve(arr2, 0, dp);
        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println(rob(nums));
    }
}
