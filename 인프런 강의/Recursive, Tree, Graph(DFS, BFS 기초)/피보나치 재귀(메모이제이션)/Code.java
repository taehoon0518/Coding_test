// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(pv(i) + " ");
        }
    }

    public static int pv(int n){
        if (n==1)
            return 1;
        else if (n==2)
            return 1;
        else
            return pv(n-2) + pv(n-1);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    static int[] fibo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n+1];
        DFS(n);
        for (int i=1; i<=n; i++){
            System.out.print(fibo[i] + " ");
        }
    }

    public static int DFS(int n){
        if (fibo[n]>0)
            return fibo[n];
        if (n==1)
            return fibo[1] = 1;
        else if (n==2)
            return fibo[2] = 1;
        else
            return fibo[n] = DFS(n-2) + DFS(n-1);
    }
}

// 성능면에서는 for문으로 하는게 재귀보다 좋다
// 재귀는 스택프레임이 돌아가기에 메모리 낭비가 더 많다.