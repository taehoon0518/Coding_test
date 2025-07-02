// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(DFS(n));
    }

    public static int DFS(int n){
        if (n==0)
            return 1;
        return n*DFS(n-1);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(DFS(n));
    }

    public static int DFS(int n){
        if (n==1)
            return 1;
        return n*DFS(n-1);
    }
}