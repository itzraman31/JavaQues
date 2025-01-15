import java.util.*;

class TaskScheduler {
    static class Pair implements Comparable<Pair> {
        char c;
        int count;

        public Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(other.count, this.count);
        }
    }

    public static int leastInterval(char[] tasks, int n) {
        if (tasks.length == 1)
            return 1;

        int tot = 0;
        Map<Character, Integer> mp = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

        for (char c : tasks) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : mp.keySet()) {
            pq.add(new Pair(c, mp.get(c)));
        }

        while (!pq.isEmpty()) {
            Map<Character, Integer> mp1 = new HashMap<>();
            int arr[] = new int[26];
            int round = n + 1;

            while (round > 0) {
                if (pq.isEmpty() && !mp1.isEmpty()) {
                    tot = tot + round;
                    break;
                }
                if (pq.isEmpty() && mp1.isEmpty()) {
                    break;
                }

                Pair p = pq.poll();
                char c1 = p.c;
                int count = p.count;
                boolean flag = false;

                if (arr[c1 - 'A'] == 0) {
                    arr[c1 - 'A'] = 1;
                    tot++;
                    count--;
                    flag = true;
                } else {
                    round++;
                }

                round--;

                if (count > 0 && flag == true) {
                    pq.add(new Pair(c1, count));
                } else {
                    if (count > 0) {
                        mp1.put(c1, count);
                    }
                }
            }

            if (pq.isEmpty() && mp1.isEmpty()) {
                return tot;
            }
            for (char c : mp1.keySet()) {
                pq.add(new Pair(c, mp1.get(c)));
            }
        }

        return tot;
    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
}
