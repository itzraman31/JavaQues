import java.util.*;

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

public class Practice {

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

        List<Integer> bottomview = new ArrayList<>();
        Map<Integer, Integer> bottomviewmap = new HashMap<>();

        q.add(root);
        q.add(null);

        bottomviewmap.put(0, root.data);

        horizD.add(new horizontalDis(0, root, root.data));
        horizD1.add(new horizontalDis(0, root, root.data));
        topviewmap.put(0, root.data);

        leftview.add(root.data);
        int d = 0;
        int flag = 0;

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
                System.out.print(temp.data+" ");
                int ff = hh.hd;
                d = temp.data;

                horizD.poll();
                q.poll();

                if (flag == 1) { // here i use flag to check just next element after getting null means after ->
                                 // (q.peek() == null)
                    leftview.add(temp.data);
                    flag = 0;
                }

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
    public static void main(String[] args) {

        Node root = new Node(5);

        System.out.println(root.data);

    }
}