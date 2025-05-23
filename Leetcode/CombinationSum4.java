import java.util.Arrays;

public class CombinationSum4 {
    public static int solve(int nums[], int tar, int currsum, int dp[]) {
        if (currsum == tar) return 1;
        if (currsum > tar) return 0;
        if (dp[currsum] != -1) return dp[currsum];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += solve(nums, tar, currsum + nums[i], dp);
        }
        return dp[currsum] = ans;
    }

    public static int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target + 1];
        Arrays.fill(dp, -1);
        return solve(nums, target, 0, dp);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        int result = combinationSum4(nums, target);
        System.out.println(result);
    }
}
