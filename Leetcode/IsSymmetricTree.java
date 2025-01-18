import java.util.*;

public class IsSymmetricTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean solve(TreeNode left, TreeNode right) {
        if (right == null && left == null)
            return true;
        if (right == null || left == null)
            return false;

        if ((left.val == right.val) && solve(left.right, right.left) && solve(left.left, right.right)) {
            return true;
        }
        return false;
    }

    public static boolean isSymmetric(TreeNode root) {
        return solve(root.left, root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root)); // Output: true
    }
}
