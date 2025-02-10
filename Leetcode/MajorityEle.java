import java.util.*;

class MajorityEle {
    public static int majorityElement(int[] nums) {
        int ele = -1;
        int count = 0;

        for (int i : nums) {
            if (ele == i) {
                count++;
            } else {
                if (count == 0) {
                    ele = i;
                } else {
                    count--;
                }
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));
    }
}