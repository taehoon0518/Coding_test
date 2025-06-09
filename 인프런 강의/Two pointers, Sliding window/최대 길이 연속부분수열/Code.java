// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int rt = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int sum = 0, tmp = 0;
            rt = i;
            while (true) {
                if (rt >= n)
                    break;
                if (arr[rt] == 1)
                    sum++;
                else {
                    if (tmp == k)
                        break;
                    sum++;
                    tmp++;
                }
                rt++;
            }
            answer = Math.max(answer, sum);
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(int n, int k, int[] arr){
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0)
                cnt++;
            while(cnt>k){
                if(arr[lt]==0)
                    cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}

// 나의 풀이 : 모든 인덱스에서 시작하며 모든 경우의 수를 돌면서 최대 크기 찾기
// 다른 사람 풀이 : 슬라이딩 윈도우 최적화