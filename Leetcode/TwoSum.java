import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < size; i++) {
            int diff = target - nums[i];
            if (mp.containsKey(diff)) {
                ans[0] = i;
                ans[1] = mp.get(diff);
                return ans;
            } else {
                mp.put(nums[i], i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
