import java.util.*;

public class SubsWithKWithLargeSumS {
    class Pair1 implements Comparable<Pair1> {
        int ind;
        int val;

        public Pair1(int ind, int val) {
            this.ind = ind;
            this.val = val;
        }

        @Override
        public int compareTo(Pair1 other) {
            return Integer.compare(other.val, this.val);
        }
    }

    class Pair2 implements Comparable<Pair2> {
        int ind;
        int val;

        public Pair2(int ind, int val) {
            this.ind = ind;
            this.val = val;
        }

        @Override
        public int compareTo(Pair2 other) {
            return Integer.compare(this.ind, other.ind);
        }
    }

    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Pair1> pq = new PriorityQueue<>();
        PriorityQueue<Pair2> pq1 = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add(new Pair1(i, nums[i]));
        }

        int k1 = k;
        while (k1 > 0) {
            Pair1 p = pq.poll();
            pq1.add(new Pair2(p.ind, p.val));
            k1--;
        }

        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            Pair2 p = pq1.poll();
            ans[i] = p.val;
        }
        return ans;
    }

    public static void main(String[] args) {
        SubsWithKWithLargeSum solution = new SubsWithKWithLargeSum();
        int[] nums = {4, 3, 10, 9, 8};
        int k = 3;

        int[] result = solution.maxSubsequence(nums, k);

        System.out.print("Max subsequence with largest sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
