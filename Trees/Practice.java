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

    public static void levelOrder(Node root){
        LinkedList<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);

        
    }
    public static void main(String[] args) {

        Node root = new Node(5);

        System.out.println(root.data);

    }
}