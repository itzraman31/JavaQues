import java.util.PriorityQueue;
import java.util.Collections;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : stones) {
            pq.add(i);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();

            if (a != b) {
                pq.add(a - b);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }
}

