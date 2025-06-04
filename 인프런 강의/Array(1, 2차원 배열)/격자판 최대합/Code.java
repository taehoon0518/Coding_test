// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [][] board = new int[count][count];

        int max = 0;
        int answer = 0;

        for (int i=0; i<count; i++){
            for (int j=0; j<count; j++){
                board[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<count; i++){
            for (int j=0; j<count; j++){
                max += board[i][j];
            }
            if (max > answer)
                answer = max;
            max = 0;
            for (int j=0; j<count; j++){
                max += board[j][i];
            }
            if (max > answer)
                answer = max;
            max = 0;
        }
        for (int i=0; i<count; i++){
            max += board[i][i];
        }
        if (max > answer)
            answer = max;
        max =0;

        for (int i=0; i<count; i++){
            max += board[i][count-i-1];
        }
        if (max > answer)
            answer = max;

        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public int solution(int n, int[][] arr){
        int answer=-2147000000;
        int sum1=0, sum2=0;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}

// 나의 풀이 처럼 모든 경우의 수를 for문으로 하는 것 보단
// 변수를 두 개 만들면 for문 갯수를 절반으로 줄일 수 있음