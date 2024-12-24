// package numsay;
import java.util.*;

public class Threesum {
    public static int binarysrch(int nums[], int s, int n) {
        int st = s;
        int en = nums.length - 1;
        int mid = (st + en) / 2;
        while (st <= en) {
            if (n == nums[mid]) {
                return n;
            } else if (n > nums[mid]) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
            mid = (st + en) / 2;
        }
        return -5000;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 0, 0, 2, -1, -4 };
        int num = 0;
        int sum = 0;
        // Set<List<Integer>> ls=new HashSet<>();
        Set<List<Integer>> result = new HashSet<>();


        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];

                if (j + 1 < nums.length) {
                    num = binarysrch(nums, j + 1, sum * (-1));
                }

                if (num != -5000) {

                    // System.out.println(nums[i] + " , " + nums[j] + " , " + num);
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(num);
                    result.add(l);
                }
            }
        }
        System.out.println(result);
    }
}
