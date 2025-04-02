import java.util.*;

public class ThreeSum {
    public static boolean binarysrch(int nums[], int s, int n) {
        int st = s;
        int en = nums.length - 1;
        int mid = (st + en) / 2;
        while (st <= en) {
            if (n == nums[mid]) {
                return true;
            } else if (n > nums[mid]) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
            mid = (st + en) / 2;
        }
        return false;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (j + 1 < nums.length) {
                    if (binarysrch(nums, j + 1, sum * (-1))) {
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(sum * (-1));
                        result.add(l);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
