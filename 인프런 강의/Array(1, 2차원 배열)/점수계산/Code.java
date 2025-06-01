// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] q = new int[count];
        int answer = 0, score = 1;

        for (int i=0; i<count; i++){
            q[i] = sc.nextInt();
            if (q[i]==0){
                score = 1;
                continue;
            }
            else{
                answer+=score;
                score ++;
            }
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public int solution(int n, int[] arr){
        int answer=0, cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            }
            else cnt=0;
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}