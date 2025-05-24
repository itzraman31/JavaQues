public class FindTargetSumWays {
    public static int solve(int nums[], int currsum, int tar, int ind) {
        if (ind >= nums.length) {
            if (currsum == tar) return 1;
            return 0;
        }

        int ans = 0;
        ans += solve(nums, currsum + nums[ind], tar, ind + 1);
        ans += solve(nums, currsum - nums[ind], tar, ind + 1);

        return ans;
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return solve(nums, 0, target, 0);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int ways = findTargetSumWays(nums, target);
        System.out.println(ways);
    }
}
