import java.util.*;

public class Flatten {
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

    public static void solve(TreeNode root, Queue<TreeNode> q) {
        if (root == null)
            return;
        q.add(root);
        solve(root.left, q);
        solve(root.right, q);
    }

    public static void flatten(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return;
        solve(root, q);
        q.poll();
        while (!q.isEmpty()) {
            root.right = q.poll();
            root.left = null;
            root = root.right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(3),
                new TreeNode(4)
            ),
            new TreeNode(5,
                null,
                new TreeNode(6)
            )
        );

        flatten(root);

        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }
}
