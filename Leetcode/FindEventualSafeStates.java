import java.util.*;

class FindEventualSafeStates {
    public boolean solve(int[][] graph, int curr, boolean vis[], boolean rec[], ArrayList<Integer> paths,
            ArrayList<ArrayList<Integer>> ans) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].length; i++) {
            int child = graph[curr][i];

            if (rec[child] == true) {
                paths.add(curr);
                ans.add(new ArrayList<>(paths));
                return true;
            } else if (vis[child] == false) {
                paths.add(curr);
                if (solve(graph, child, vis, rec, paths, ans))
                    return true;
                paths.remove(Integer.valueOf(curr));
            }
        }
        rec[curr] = false;
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> finalans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> paths = new ArrayList<>();
        boolean[] vis = new boolean[graph.length];
        boolean rec[] = new boolean[graph.length];
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < vis.length; i++) {
            if (vis[i] == false) {
                solve(graph, i, vis, rec, paths, ans);
            }
        }

        for (int i : paths) {
            st.add(i);
        }

        for (int i = 0; i < graph.length; i++) {
            if (!st.contains(i)) {
                finalans.add(i);
            }
        }

        return finalans;
    }

    public static void main(String[] args) {
        FindEventualSafeStates solution = new FindEventualSafeStates();

        int[][] graph = {{ 1, 2 },{ 2, 3 },{ 5 },{ 0 },{ 5 },{},{}};

        List<Integer> safeNodes = solution.eventualSafeNodes(graph);

        System.out.println("Safe Nodes: " + safeNodes);
    }
}
