import java.util.*;

class TreeNode {
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

public class LeafSimilar {
    static void solve(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        solve(root.left, res);
        if (root.left == null && root.right == null) {
            res.add(root.val);
        }
        solve(root.right, res);
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        solve(root1, ans1);
        solve(root2, ans2);
        return ans1.equals(ans2);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3,
            new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
            new TreeNode(1, new TreeNode(9), new TreeNode(8))
        );

        TreeNode root2 = new TreeNode(3,
            new TreeNode(5, new TreeNode(6), new TreeNode(7)),
            new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8)))
        );

        System.out.println(leafSimilar(root1, root2));
    }
}
