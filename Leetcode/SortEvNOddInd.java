import java.util.*;

public class SortEvNOddInd {
    public static int[] sortEvenOdd(int[] nums) {
        int ans[] = new int[nums.length];
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                pq1.add(nums[i]);
            } else {
                pq2.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (!pq1.isEmpty()) {
                    ans[i] = pq1.poll();
                }
            } else {
                if (!pq2.isEmpty()) {
                    ans[i] = pq2.poll();
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
     
        int[] nums = {4, 1, 2, 3, 5, 8};

        int[] sortedNums = sortEvenOdd(nums);

        System.out.print("Sorted Array: ");
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }
}
