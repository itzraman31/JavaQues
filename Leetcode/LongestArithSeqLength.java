public class LongestArithSeqLength {
    public static int solve(int ind, int diff, int arr[]) {
        int ans = 0;
        for (int i = ind + 1; i < arr.length; i++) {
            if (arr[i] - arr[ind] == diff) {
                ans++;
                ind = i;
            }
        }
        return ans;
    }

    public static int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = nums[j] - nums[i];
                max = Math.max(max, 2 + solve(j, diff, nums));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 12};
        System.out.println(longestArithSeqLength(nums));
    }
}
