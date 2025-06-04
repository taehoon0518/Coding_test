// 나의 풀이
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [][] board = new int[count][count];
        int answer = 0;
        // 상하좌우
        int [][] xy = {{0,-1}, {0, 1}, {-1, 0}, {1, 0}};

        for (int i=0; i<count; i++){
            for (int j=0; j<count; j++){
                board[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<count; i++){
            for (int j=0; j<count; j++){
                boolean status = true;
                for (int k=0; k<4; k++){
                    int x = i+xy[k][0];
                    int y = j+xy[k][1];
                    if (x<0 || x > count-1 || y<0 || y > count-1)
                        continue;
                    if (board[x][y] >= board[i][j]){
                        status = false;
                        break;
                    }
                }
                if(status == true)
                    answer ++;
            }
        }

        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};
    public int solution(int n, int[][] arr){
        int answer=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag=true;
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
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