import java.util.*;

public class JumpGame2 {
    public static int[] cal(int nums[], int ind) {
        int maxdis = 0;
        int ans[] = new int[2];
        int c = ind + 1;
        for (int i = 1; i <= nums[ind]; i++) {
            if (c < nums.length) {
                if (nums[c] + c > maxdis) {
                    maxdis = nums[c] + c;
                    ans[0] = c;
                    ans[1] = maxdis;
                }
                c++;
            }
        }
        return ans;
    }

    public static int jump(int[] nums) {
        if (nums.length == 1)
            return 0;
        int st = 0;
        int en = 0;
        int count = 0;
        int ans[] = new int[2];

        if (nums[0] >= nums.length - 1)
            return 1;

        for (int i = 0; i < nums.length; i++) {
            ans = cal(nums, st);
            st = ans[0];
            en = ans[1];
            count++;
            if (en >= nums.length - 1) {
                count++;
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int result = jump(nums);
        System.out.println("Minimum jumps required: " + result);
    }
}
