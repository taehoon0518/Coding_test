// 1. 무방향 그래프 (Undirected Graph)
public class UndirectedGraph {
    public static void main(String[] args) {
        int n = 5;
        int[][] graph = new int[n+1][n+1];

        addEdge(graph, 1, 2);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 3, 5);
        addEdge(graph, 4, 5);

        printGraph(graph, n);
    }

    static void addEdge(int[][] graph, int from, int to) {
        graph[from][to] = 1;
        graph[to][from] = 1; // 대칭, 무방향
    }

    static void printGraph(int[][] graph, int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// 2. 방향 그래프 (Directed Graph)
public class DirectedGraph {
    public static void main(String[] args) {
        int n = 5;
        int[][] graph = new int[n+1][n+1];

        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 1);
        addEdge(graph, 4, 5);

        printGraph(graph, n);
    }

    static void addEdge(int[][] graph, int from, int to) {
        graph[from][to] = 1; // 방향: from -> to
    }

    static void printGraph(int[][] graph, int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// 3. 가중치 그래프 (Weighted Graph, 방향 예시)
public class DirectedWeightedGraph {
    public static void main(String[] args) {
        int n = 5;
        int INF = 0; // 연결 안 된 곳은 0 또는 적절한 값으로 표현
        int[][] graph = new int[n+1][n+1];

        // 방향 가중치 간선 추가: from -> to, 가중치
        addEdge(graph, 1, 2, 7);
        addEdge(graph, 2, 3, 8);
        addEdge(graph, 3, 4, 9);
        addEdge(graph, 4, 1, 5);
        addEdge(graph, 4, 5, 6);

        printGraph(graph, n);
    }

    static void addEdge(int[][] graph, int from, int to, int weight) {
        graph[from][to] = weight; // 방향 간선: from → to에 가중치 할당
    }

    static void printGraph(int[][] graph, int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
