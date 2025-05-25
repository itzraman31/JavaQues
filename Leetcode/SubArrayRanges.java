public class SubArrayRanges {
    public static long subArrayRanges(int[] nums) {
        long sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            for (int j = i; j < n; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                sum += max - min;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        long result = subArrayRanges(nums);
        System.out.println(result);
    }
}
