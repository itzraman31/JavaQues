import java.util.*;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            pq.add(nums[i]);
        }
        int[] ans = new int[n - k + 1];
        int a = 0;
        for (int i = k; i < n; i++) {
            ans[a++] = pq.peek();
            pq.add(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            int freq = map.get(nums[i - k]);
            map.put(nums[i - k], freq - 1);
            while (map.get(pq.peek()) == 0) {
                pq.poll();
            }
        }
        ans[a] = pq.peek();
        return ans;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum solution = new SlidingWindowMaximum();
        
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = solution.maxSlidingWindow(nums, k);
        System.out.println("Maximum values in each sliding window:");
        System.out.println(Arrays.toString(result));
    }
}
