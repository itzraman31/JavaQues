import java.util.Arrays;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length;
        return (nums[i - 1] - 1) * (nums[i - 2] - 1);
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));
    }
}
