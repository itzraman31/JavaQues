import java.util.*;

public class MedainTwoSortArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int c = a + b;
        int[] nums = new int[c];
        System.arraycopy(nums2, 0, nums, 0, b);
        System.arraycopy(nums1, 0, nums, b, a);
        Arrays.sort(nums);
        if (c % 2 == 0) {
            return (nums[c / 2] + nums[c / 2 - 1]) / 2.0;
        } else {
            return nums[c / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
