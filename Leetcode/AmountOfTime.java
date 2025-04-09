import java.util.*;

public class AmountOfTime {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void solve(TreeNode root, Map<Integer, List<Integer>> mp) {
        if (root == null) return;

        int val = root.val;
        if (root.left != null) {
            int lval = root.left.val;
            mp.computeIfAbsent(val, k -> new ArrayList<>()).add(lval);
            mp.computeIfAbsent(lval, k -> new ArrayList<>()).add(val);
        }
        if (root.right != null) {
            int rval = root.right.val;
            mp.computeIfAbsent(val, k -> new ArrayList<>()).add(rval);
            mp.computeIfAbsent(rval, k -> new ArrayList<>()).add(val);
        }

        solve(root.left, mp);
        solve(root.right, mp);
    }

    public static int amountOfTime(TreeNode root, int start) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        solve(root, mp);

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> st = new HashSet<>();
        q.add(start);
        q.add(-1);
        st.add(start);

        int count = 0;
        while (!q.isEmpty()) {
            int ele = q.poll();
            if (ele == -1) {
                count++;
                if (!q.isEmpty()) {
                    q.add(-1);
                }
            } else {
                if (mp.containsKey(ele)) {
                    for (int a : mp.get(ele)) {
                        if (!st.contains(a)) {
                            q.add(a);
                            st.add(a);
                        }
                    }
                }
            }
        }
        return count - 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                              new TreeNode(5, null, new TreeNode(4, new TreeNode(9), new TreeNode(2))),
                              new TreeNode(3, new TreeNode(10), new TreeNode(6)));

        int start = 3;
        int time = amountOfTime(root, start);
        System.out.println(time);
    }
}
