public class NumIdenticalPairs {
    public static int numIdenticalPairs(int[] nums) {
        int s = nums.length;
        int c = 0;
        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }
}
