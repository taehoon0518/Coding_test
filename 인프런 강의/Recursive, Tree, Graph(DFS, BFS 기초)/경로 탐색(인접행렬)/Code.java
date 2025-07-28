// 나의 코드
import java.util.*;

class Main {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        visited = new int[n+1];

        // 간선 입력
        for(int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        visited[1] = 1;
        dfs(1);

        System.out.print(answer);
    }

    static void dfs(int v) {
        if(v == n) {
            answer++;
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(graph[v][i] == 1 && visited[i] == 0) {
                visited[i] = 1;
                dfs(i);
                visited[i] = 0; // 백트래킹
            }
        }
    }
}


// 다른 사람 코드
import java.util.*;
class Main {
    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if(v==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}