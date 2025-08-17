import java.util.*;

public class BinaryTreePaths {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static void solve(TreeNode root, StringBuilder str, List<String> res) {
        if (root == null) {
            return;
        }
        int len = str.length();
        str.append(root.val);
        if (root.left == null && root.right == null) {
            res.add(str.toString());
        } else {
            str.append("->");
            solve(root.left, str, res);
            solve(root.right, str, res);
        }
        str.setLength(len);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        solve(root, str, res);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> paths = binaryTreePaths(root);
        System.out.println(paths);
    }
}
