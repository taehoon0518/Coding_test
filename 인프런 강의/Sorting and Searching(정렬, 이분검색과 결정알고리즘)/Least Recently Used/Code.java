// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] cache = new int[s];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int x : arr){
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (cache[i] == x)
                    pos = i;
            }
            // 없으니 미루고 넣기
            if (pos == -1){
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
            // 있는거 앞으로 당기고 넣기
            else{
                for (int i=pos; i>=1; i--){
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }
        for (int x : cache){
            System.out.print(x + " ");
        }
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int[] solution(int size, int n, int[] arr){
        int[] cache=new int[size];
        for(int x : arr){
            int pos=-1;
            for(int i=0; i<size; i++)
                if(x==cache[i])
                    pos=i;
            if(pos==-1){
                for(int i=size-1; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            else{
                for(int i=pos; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(s, n, arr)) System.out.print(x+" ");
    }
}