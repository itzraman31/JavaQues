import java.util.*;

public class RangeSum {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> v = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            long sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                int f = (int)(sum % 1000000007);
                v.add(f);
            }
        }

        Collections.sort(v);
        int ans = 0;
        for (int i = left - 1; i <= right - 1; i++) {
            ans += v.get(i);
            ans %= 1000000007;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int left = 1;
        int right = 5;
        System.out.println(rangeSum(nums, n, left, right));
    }
}
