import java.util.*;

public class CountCompleteSubarrays {
    public static int countCompleteSubarrays(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int i : nums) {
            st.add(i);
        }
        int n = nums.length;
        int ans = 0;
        int dis = st.size();
        for (int i = 0; i < n; i++) {
            Set<Integer> st2 = new HashSet<>();
            for (int j = i; j < n; j++) {
                st2.add(nums[j]);
                if (st2.size() == dis)
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 2};
        int result = countCompleteSubarrays(nums);
        System.out.println(result);
    }
}
