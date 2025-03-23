import java.util.*;

class Pair implements Comparable<Pair> {
    int count;
    char c;

    Pair(int count, char c) {
        this.count = count;
        this.c = c;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(other.count,this.count);
    }
}

public class TaskSch {
    public static int solve(char str[], int n) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        Map<Character, Integer> mp = new HashMap<>();

        for (char s : str) {
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        for (char c : mp.keySet()) {
            pq.add(new Pair(mp.get(c), c));
        }
        
        int tot = 0;
        // 'A', 'A', 'A', 'B', 'B', 'B'
        while (!pq.isEmpty()) {
            Set<Character> st = new HashSet<>();
            int count = n;

            while (!pq.isEmpty() && count >= 0) {
                count--;
                Pair p = pq.poll();
                if (st.contains(p.c)) {
                    pq.add(new Pair(p.count, p.c));
                }
                else{
                    st.add(p.c);
                    if (p.count - 1 > 0) {
                        pq.add(new Pair(p.count - 1, p.c));
                    }
                }
                tot++;
            }
        }

        return tot;
    }

    public static void main(String[] args) {
        // char[] str = { 'A', 'A', 'A', 'B', 'B', 'B' };
        // char[] str = { 'A', 'C', 'A', 'B', 'D', 'B' };
        char[] str = {'A','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int n = 29;
        
        System.out.println(solve(str, n));
    }
}
