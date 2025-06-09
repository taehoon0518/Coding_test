// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        int answer = 0;
        int l = 0, r = 0;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        while(true){
            if (sum >= m){
                sum -= arr[l++];
            }
            else if (r == n)
                break;
            else
                sum += arr[r++];

            if (sum == m)
                answer++;
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(int n, int m, int[] arr){
        int answer=0, sum=0, lt=0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}