import java.util.*;

public class PathSum {

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

    public static boolean solve(TreeNode root, int target, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            sum += root.val;
            if (sum == target) {
                return true;
            }
        }
        sum += root.val;
        if (solve(root.left, target, sum)) return true;
        if (solve(root.right, target, sum)) return true;
        return false;
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum, 0);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, 
            new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
            new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))
        );
        int targetSum = 22;
        System.out.println(hasPathSum(root, targetSum));
    }
}
