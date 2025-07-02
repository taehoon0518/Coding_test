// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bit(n);
    }

    public static void bit(int n){
        if(n==0)
            return;
        bit(n/2);
        System.out.print(n%2);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }

    public static void DFS(int n){
        if(n==0)
            return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }
}