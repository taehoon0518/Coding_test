// 나의 코드
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] list = new int[n][5];

        int [] count = new int[n];
        int max = -1;
        int answer = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<5; j++){
                list[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==j)    continue;
                for (int k=0; k<5; k++){
                    if (list[i][k] == list[j][k]){
                        count[i] += 1;
                        break;
                    }
                }
            }
        }
        for (int i=0; i<n; i++){
            if (max < count[i]){
                max = count[i];
                answer = i+1;
            }
        }
        System.out.print(answer);
    }
}

// 다른 사람 코드
import java.util.*;
class Main {
    public int solution(int n, int[][] arr){
        int answer=0, max=0;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}