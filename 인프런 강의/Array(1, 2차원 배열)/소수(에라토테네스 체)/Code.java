// 나의 풀이 (Time Limit Exceeded)
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        for (int i=2; i<n+1; i++){
            answer++;
            for (int j=2; j<i; j++){
                if(i%j == 0){
                    answer--;
                    break;
                }
            }
        }

        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(int n){
        int cnt=0;
        int[] ch = new int[n+1];    //0~20 인덱스
        for(int i=2; i<=n; i++){    //2~20
            if(ch[i]==0){
                cnt++;
                for(int j=i; j<=n; j=j+i)
                    ch[j]=1;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.solution(n));
    }
}

// 에라토스테네스 체 : 불필요한 수 걸러내기
// int[] ch = new int[n+1]; 배열 선언 시 모든 요소가 0으로 초기화
// i의 배수는 소수가 아니기 때문에 i의 배수들을 소수가 아님(1)로 체크
// 0 : 소수임