import java.util.*;;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class LCA {
    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        TreeNode Lfind = lowestCommonAncestor(root.left, p, q);
        TreeNode Rfind = lowestCommonAncestor(root.right, p, q);
        if (root == p || root == q) return root;
        if (Lfind != null && Rfind != null) return root;
        return (Lfind != null) ? Lfind : Rfind;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        
        TreeNode p = root.left;
        TreeNode q = root.left.right.right;
        
        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA: " + (lca != null ? lca.val : "null"));
    }
}