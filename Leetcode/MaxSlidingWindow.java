import java.util.*;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        int ans[] = new int[arr.length - k + 1];
        int ind = 0;
        Deque<Integer> maxi = new ArrayDeque<>();
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            while (!maxi.isEmpty() && arr[maxi.getLast()] < arr[i]) {
                maxi.pollLast();
            }
            maxi.addLast(i);
            if (i - maxi.getFirst() >= k) {
                maxi.pollFirst();
            }
            c++;
            if (c >= k) {
                ans[ind++] = arr[maxi.getFirst()];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(arr, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
