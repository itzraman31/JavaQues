import java.util.*;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0, sum = 0;
        mp.put(0, 1);
        for (int i : nums) {
            sum += i;
            count += mp.getOrDefault(sum - k, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        int result = subarraySum(nums, k);
        System.out.println(result);
    }
}
