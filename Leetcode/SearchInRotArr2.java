import java.util.*;

class SearchInRotArr2 {
    public static boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length == 1 && nums[0] == target) return true;
        if (nums.length == 1 && nums[0] != target) return false;
        
        int s = 0;
        int e = nums.length - 1;
        
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] < target) s = mid + 1;
            else e = mid - 1;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;
        System.out.println(search(nums, target));
    }
}
