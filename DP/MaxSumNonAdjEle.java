import java.util.*;

public class MaxSumNonAdjEle {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = { 9, 9, 8, 2 };
        int dp[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
        dp[i] = -1;
        }

        System.out.println(solve(nums, 0, dp));
    }
}
