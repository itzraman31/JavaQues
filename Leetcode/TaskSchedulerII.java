import java.util.*;

public class TaskSchedulerII {
    public static long taskSchedulerII(int[] tasks, int space) {
        long ans = 0;
        Map<Integer, Long> mp = new HashMap<>();

        for (int i = 0; i < tasks.length; i++) {
            if (mp.containsKey(tasks[i])) {
                long diff = mp.get(tasks[i]);
                if (ans >= diff + space + 1) {
                    ans++;
                } else {
                    ans = diff + space + 1;
                }
                mp.put(tasks[i], ans);
            } else {
                ans++;
                mp.put(tasks[i], ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] tasks = {1, 2, 1, 2, 3, 1};
        int space = 3;
        System.out.println(taskSchedulerII(tasks, space));
    }
}
