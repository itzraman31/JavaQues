import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class IsSameTree {
    public static boolean solve(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val == q.val) {
            return solve(p.left, q.left) && solve(p.right, q.right);
        }
        return false;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return solve(p, q);
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println(isSameTree(tree1, tree2));
    }
}
