// 나의 풀이
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] list = new int[m][n];
        int answer = 0;

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                list[i][j] = sc.nextInt();
            }
        }

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i==j)
                    continue;
                boolean status = true;
                for (int k=0; k<m; k++){
                    int pi = 0, pj = 0;
                    for (int s=0; s<n; s++){
                        if (list[k][s]==i)
                            pi = s;
                        if (list[k][s]==j)
                            pj = s;
                    }
                    if (pi >= pj){
                        status = false;
                        break;
                    }
                }
                if (status)
                    answer ++;
            }
        }
        System.out.print(answer);
    }
}

// 다른 사람
import java.util.*;
class Main {
    public int solution(int n, int m, int[][] arr){
        int answer=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                    //System.out.println(i+" "+j);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}

// 나의 코드
// 위치가 뒤바뀌면 (status==false)이면 멘토멘티 성사x
// 끝날때까지 서로의 등수 앞뒤가 안바뀌면 (status==true) 멘토멘티 성사

// 다른 사람 풀이
// ex) 4번의 시험을 친다. => 4번 모두 등수가 높으면 answer++