// 나의 풀이 (Time Limit Exceeded)
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int n = sc.nextInt();
        int [] days = new int[day];
        int max = 0;

        for (int i=0; i<day; i++){
            days[i] = sc.nextInt();
        }

        for (int i=0; i<day-n; i++){
            int count = 0;
            int sum = 0;
            int pos = i;
            while(count<n){
                sum += days[pos++];
                count++;
            }
            if(sum>max)
                max = sum;
        }
        System.out.print(max);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(int n, int k, int[] arr){
        int answer, sum=0;
        for(int i=0; i<k; i++)
            sum+=arr[i];
        answer=sum;
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer, sum);
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

// Sliding Window
// 우선 초기값 정해둠
// 예시) 3개 더한 값(0, 1, 2 인덱스)을 sum에 넣어둠
// 맨 처음값(0번 인덱스)은 빼고, 그 뒷 값을 더함(4번 인덱스)

// 다시 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int n = sc.nextInt();
        int [] days = new int[day];
        int sum = 0;
        int answer = 0;

        for (int i=0; i<day; i++){
            days[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            sum += days[i];
        }
        answer = sum;

        for (int i=0; i<day-n; i++){
            sum -= days[i];
            sum += days[i+n];
            answer = Math.max(sum, answer);
        }

        System.out.print(answer);
    }
}