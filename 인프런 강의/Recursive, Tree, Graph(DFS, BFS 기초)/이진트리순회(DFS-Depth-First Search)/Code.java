import java.util.*;

class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}
class Main {
    Node root;
    public void DFS(Node root){
        if (root == null) return;
        else{
            // 전위
            System.out.print(root.data+ " ");
            DFS(root.lt);
            DFS(root.rt);

            // 중위
            // DFS(root.lt);
            // System.out.print(root.data+ " ");
            // DFS(root.rt);

            // 후위
            // DFS(root.lt);
            // DFS(root.rt);
            // System.out.print(root.data+ " ");
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}