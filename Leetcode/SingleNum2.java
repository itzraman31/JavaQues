import java.util.*;

class SingleNum2 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        for (int i : mp.keySet()) {
            if (mp.get(i) == 1) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        SingleNum2 solution = new SingleNum2();
        int[] nums = {2, 2, 1};
        System.out.println(solution.singleNumber(nums));
    }
}
