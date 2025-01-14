import java.util.ArrayList;

public class Longest_Cycle_Graph {
    public static int solve(int arr[], int curr, boolean vis[], boolean path[], int count, boolean[] flag,
            ArrayList<Integer> aa) {
        int ans1 = -1;

        if (arr[curr] != -1) {

            vis[curr] = true;
            path[curr] = true;
            count++;

            int dest = arr[curr];
            if (path[dest] == true) {

                aa.add(arr[curr]);
                return count;

            } else if (vis[dest] == false) {
                ans1 = solve(arr, dest, vis, path, count, flag, aa);
            }

            if (aa.size() > 0 && aa.get(0) == curr) {
                flag[0] = true;
                ans1++;
            }

            if (flag[0] == true) {
                ans1--;
            }

            path[curr] = false;
            return ans1;
        }
        return ans1;
    }

    public static int longestCycle(int[] edges) {

        boolean vis[] = new boolean[edges.length];
        int count = 0;
        boolean flag[] = new boolean[1];
        int maxi = -1;

        for (int i = 0; i < edges.length; i++) {
            boolean path[] = new boolean[edges.length];
            flag[0] = false;
            ArrayList<Integer> aa = new ArrayList<>();
            if (vis[i] == false) {
                int ans = solve(edges, i, vis, path, 0, flag, aa);
                maxi = Math.max(maxi, ans);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] edges = { 3, 3, 4, 2, 3 };
        System.out.println(longestCycle(edges));
    }
}
