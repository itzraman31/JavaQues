public class CountSubarrays {
    public static long countSubarrays(int[] nums, long k) {
        int p1 = 0;
        int p2 = 0;
        long sum = 0;
        long ans = 0;
        while (p2 < nums.length) {
            sum += nums[p2];
            while (sum * (p2 - p1 + 1) >= k) {
                sum -= nums[p1++];
            }
            ans += p2 - p1 + 1;
            p2++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4};
        long k = 10;
        long result = countSubarrays(nums, k);
        System.out.println(result);
    }
}
