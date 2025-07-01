import java.util.*;

public class MaxFrequencyElements {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> m = new TreeMap<>();
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], 0);
        }
        for (int i = 0; i < nums.length; i++) {
            int d = m.get(nums[i]) + 1;
            m.put(nums[i], d);
        }
        for (var s : m.keySet()) {
            int f = m.get(s);
            if (f > max) {
                max = f;
            }
        }
        int n = 0;
        for (var s : m.keySet()) {
            int f = m.get(s);
            if (f == max) {
                n = n + max;
            }
        }
        System.out.println(max);
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        int result = maxFrequencyElements(nums);
        System.out.println(result);
    }
}
