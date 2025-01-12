import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Map<Integer, Integer> mp = new LinkedHashMap<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int max = intervals[0][1];
        int st = intervals[0][0];
        int s = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (max >= intervals[i][0]) {
                if (max <= intervals[i][1]) {
                    max = intervals[i][1];
                }
            } else {
                s++;
                mp.putIfAbsent(st, max);
                st = intervals[i][0];
                max = intervals[i][1];
            }
        }
        s++;
        mp.putIfAbsent(st, max);

        int[][] ans = new int[s][2];
        s = 0;
        for (int i : mp.keySet()) {
            ans[s][0] = i;
            ans[s][1] = mp.get(i);
            s++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] mergedIntervals = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
