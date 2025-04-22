import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class TopNode {
    Node n;
    int hd;

    TopNode(Node n, int hd) {
        this.n = n;
        this.hd = hd;
    }
}

public class PractTrees {
    public static Node buildTreeFromArr(int arr[], int ind) {
        if (ind >= arr.length)
            return null;

        Node root;
        if(arr[ind]==-1){
            root=null;
        }
        else{
            root = new Node(arr[ind]);
            root.left = buildTreeFromArr(arr, (2 * ind) + 1);
            root.right = buildTreeFromArr(arr, (2 * ind) + 2);
        }

        return root;
    }

    public static void levelOrd(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node ele = q.poll();
            if (ele == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(ele.val + " ");

                if (ele.left != null) {
                    q.add(ele.left);
                }
                if (ele.right != null) {
                    q.add(ele.right);
                }
            }
        }
    }

    public static void leftView(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        int ans = 0;

        while (!q.isEmpty()) {
            Node ele = q.poll();
            if (ele == null) {
                System.out.print(ans + " ");
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                ans = ele.val;

                if (ele.right != null) {
                    q.add(ele.right);
                }

                if (ele.left != null) {
                    q.add(ele.left);
                }
            }
        }
    }

    public static void rightView(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        int ans = 0;

        while (!q.isEmpty()) {
            Node ele = q.poll();
            if (ele == null) {
                System.out.print(ans + " ");
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                ans = ele.val;

                if (ele.left != null) {
                    q.add(ele.left);
                }

                if (ele.right != null) {
                    q.add(ele.right);
                }

            }
        }
    }

    public static void topView(Node root) {
        Queue<TopNode> q=new LinkedList<TopNode>();
        Map<Integer,Integer> mp=new TreeMap<>();
        q.add(new TopNode(root, 0));

        while (!q.isEmpty()) {
            TopNode node = q.poll();

            if (!mp.containsKey(node.hd)) {
                mp.put(node.hd,node.n.val);
            }

            if (node.n.left != null) {
                q.add(new TopNode(node.n.left, node.hd - 1));
            }
            if (node.n.right != null) {
                q.add(new TopNode(node.n.right, node.hd + 1));
            }

        }

        for(int i:mp.values()){
            System.out.print(i+" ");
        }
    }

    public static void bottomView(Node root) {
        Queue<TopNode> q=new LinkedList<TopNode>();
        Map<Integer,Integer> mp=new TreeMap<>();
        q.add(new TopNode(root, 0));

        while (!q.isEmpty()) {
            TopNode node = q.poll();

            mp.put(node.hd,node.n.val);

            if (node.n.left != null) {
                q.add(new TopNode(node.n.left, node.hd - 1));
            }
            if (node.n.right != null) {
                q.add(new TopNode(node.n.right, node.hd + 1));
            }
        }

        for(int i:mp.values()){
            System.out.print(i+" ");
        }
    }
    
    public static int NopathsumNode2(Node root, int sum) {
        if (root == null) {
            return 0;
        }
        return NopathsumNode(root, sum) + NopathsumNode(root.left, sum) + NopathsumNode(root.right, sum);
    }

    public static int NopathsumNode(Node node, int sum) {
        if (node == null) {
            return 0;
        }

        if (node.val == sum && node.left == null && node.right == null) {
            return 1;
        }
        return NopathsumNode(node.left, sum - node.val)
                + NopathsumNode(node.right, sum - node.val);
    }
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr[] = {5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, -1, 1};
        
        Node root;
        root = buildTreeFromArr(arr, 0);
        System.out.println(NopathsumNode2(root, 22));

        // levelOrd(root);

        // leftView(root);
        // rightView(root);

        // topView(root);
        // bottomView(root);

    }
}
