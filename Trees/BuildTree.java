// package Trees;

import java.util.*;

public class BuildTree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = { 1,2,3,4,5,6,7 };
        Node root = makeTreeFromArrayComplete(arr, arr.length, 0);

        // 1
        // 5 6
        // 7 8 4 2

        // ArrayList<Node> l=new ArrayList<>();

        // l.add(new Node(1));
        // l.add(new Node(4));
        // l.add(new Node(3));

        // System.out.println(l.get(2).data);

        // Node root = null;
        // root = buildTree();
        // System.out.println();

        // System.out.print("InorderTraversal: ");
        // inOrder(root);

        // System.out.print("PostOrderTraveersal: ");
        // postOrder(root);

        // System.out.print("PreOrderTraveersal: ");
        // preOrder(root);

        // int h=heightTree(root);
        // System.out.print("Height of Tree: "+h);

        // int m=Maxele(root);
        // System.out.print("Max ele in Tree is: "+m);

        // System.out.println("Level-Order: ");
        LevelOrderPrint(root);

        // System.out.println("Printing Leaf Nodes: ");
        // PrintLeaf(root);
    }

    public static Node buildTree() {
        Node root = null;

        System.out.print("Enter data: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter data for left of: " + data);
        root.left = buildTree();
        System.out.println("Enter data for right of: " + data);
        root.right = buildTree();

        return root;
    }

    public static void inOrder(Node root) {
        // L N R
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        // L R N
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void preOrder(Node root) {
        // N L R
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static int heightTree(Node root) {
        if (root == null)
            return 0;

        return Math.max(heightTree(root.left), heightTree(root.right)) + 1;
    }

    public static int Maxele(Node root) {
        if (root == null)
            return -1;

        return Math.max(root.data, Math.max(Maxele(root.left), Maxele(root.right)));
    }

    public static void LevelOrderPrint(Node root) {
        Queue<Node> q = new LinkedList<>();

        Queue<horizontalDis> horizD = new LinkedList<>();
        Queue<horizontalDis> horizD1 = new LinkedList<>();

        List<Integer> rightview = new ArrayList<>();
        List<Integer> leftview = new ArrayList<>();

        List<Integer> topview = new ArrayList<>();
        Map<Integer, Integer> topviewmap = new HashMap<>();

        Map<Integer, Integer> bottomviewmap = new HashMap<>();
        List<Integer> bottomview = new ArrayList<>();

        q.add(root);
        bottomviewmap.put(0, root.data);

        horizD.add(new horizontalDis(0, root, root.data));
        horizD1.add(new horizontalDis(0, root, root.data));
        topviewmap.put(0, root.data);

        leftview.add(root.data);
        int d = 0;
        int flag = 0;
        q.add(null);

        while (!q.isEmpty()) {

            if (q.peek() == null) {
                System.out.println();
                rightview.add(d);
                q.poll();
                flag = 1;
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {

                Node temp = q.peek();
                horizontalDis hh = horizD.peek();
                int ff = hh.hd;
                horizD.poll();

                q.poll();
                if (flag == 1) { // here i use flag to check just next element after getting null means after ->
                                 // (q.peek() == null)
                    leftview.add(temp.data);
                    flag = 0;
                }
                d = temp.data;
                // System.out.print(d+" ");

                if (temp.left != null) {
                    q.add(temp.left);

                    bottomviewmap.put(ff - 1, temp.left.data);

                    if (!topviewmap.containsKey(ff - 1)) {
                        topviewmap.put(ff - 1, temp.left.data);
                    }
                    horizD.add(new horizontalDis(ff - 1, temp.left, temp.left.data));
                    horizD1.add(new horizontalDis(ff - 1, temp.left, temp.left.data));
                }

                if (temp.right != null) {
                    q.add(temp.right);

                    bottomviewmap.put(ff + 1, temp.right.data);

                    if (!topviewmap.containsKey(ff + 1)) {
                        topviewmap.put(ff + 1, temp.right.data);
                    }
                    horizD.add(new horizontalDis(ff + 1, temp.right, temp.right.data));
                    horizD1.add(new horizontalDis(ff + 1, temp.right, temp.right.data));
                }
            }
        }

        // System.out.print("Right view of tree: ");
        // for (int i = 0; i < rightview.size(); i++) {
        // System.out.print(rightview.get(i) + " ");
        // }

        // System.out.println();

        // System.out.print("Left view of tree: ");
        // for (int i = 0; i < leftview.size(); i++) {
        // System.out.print(leftview.get(i) + " ");
        // }

        // System.out.println("TopView Map ");
        // for(int i:topviewmap.values()){
        // System.out.print(i+" ");
        // }

        // System.out.println("Bottom View: ");
        // System.out.println(bottomviewmap);
        // for (int i : bottomviewmap.values()) {
        // bottomview.add(i);
        // }

        // for (int i = 0; i < bottomview.size(); i++) {
        // System.out.print(bottomview.get(i) + " ");
        // }

        // System.out.println(horizD);

        Map<Integer, List<Integer>> map = new TreeMap<>();

        // while (!horizD1.isEmpty()) {

        // System.out.println(horizD1.peek().hd+" with hori: "+horizD1.peek().data);
        // horizD1.poll();
        // }

        while (!horizD1.isEmpty()) {

            if (!map.containsKey(horizD1.peek().hd)) {
                map.put(horizD1.peek().hd, new ArrayList<>());
            }

            map.get(horizD1.peek().hd).add(horizD1.peek().data);

            horizD1.poll();
        }

        System.out.println(map);

    }

    public static void PrintLeaf(Node root) {
        if (root == null) {
            return;
        }

        PrintLeaf(root.left);

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        PrintLeaf(root.right);
    }

    public static Node makeTreeFromArrayComplete(int arr[], int n, int ind) {

        if (ind >= n)
            return null;

        Node temp = new Node(arr[ind]);

        temp.left = makeTreeFromArrayComplete(arr, n, ind * 2 + 1);
        temp.right = makeTreeFromArrayComplete(arr, n, ind * 2 + 2);

        return temp;
    }
}

class horizontalDis {
    int hd;
    Node n;
    int data;

    horizontalDis(int h, Node node, int data) {
        this.hd = h;
        this.n = node;
        this.data = data;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}