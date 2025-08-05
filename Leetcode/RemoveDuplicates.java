import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int[] ans = new int[202];
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                ans[nums[i]] = ans[nums[i]] + 1;
            } else {
                int ind = 100 + Math.abs(nums[i]);
                ans[ind] = ans[ind] + 1;
            }
        }

        int c = 0;

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > 0) {
                if (i > 100) {
                    c++;
                    int n = 100 - i;
                    res.add(n);
                } else {
                    c++;
                    res.add(i);
                }
            }
        }

        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            nums[i] = res.get(i);
        }

        return c;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 2, -2, 1, 2, -1, 3, -3};
        int k = removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
