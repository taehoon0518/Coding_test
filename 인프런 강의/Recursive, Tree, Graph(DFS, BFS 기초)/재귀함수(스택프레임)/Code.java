// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(n);
    }

    public static void count(int n){
        if (n==0)
            return;

        count(n-1);
        System.out.print(n + " ");
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
        if (n==0)
            return;
        else{
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
}

// 재귀함수 : 자기 자신을 부르는 함수
// 스택 프레임 : 함수 하나 호출될 때마다 생기는 저장 공간