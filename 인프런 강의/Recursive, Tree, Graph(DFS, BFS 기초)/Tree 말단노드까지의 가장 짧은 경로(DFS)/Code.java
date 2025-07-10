// 나의 풀이
import java.util.*;

class Node {
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

class Main {
    Node root;
    public int DFS(Node root, int level){
        if (root.lt == null & root.rt == null){
            return level;
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if (root.lt != null)
            left = DFS(root.lt, level+1);
        if (root.rt != null)
            right = DFS(root.rt, level+1);
        return Math.min(left, right);
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.print(tree.DFS(tree.root, 0));
    }
}

// 다른 사람 풀이
import java.util.*;

class Node {
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

class Main {
    Node root;
    public int DFS(Node root, int level){
        if (root.lt == null && root.rt == null){
            return level;
        }

        else return Math.min(DFS(root.lt, level+1), DFS(root.rt, level+1));
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.print(tree.DFS(tree.root, 0));
    }
}