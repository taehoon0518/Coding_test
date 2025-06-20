// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue <Integer> queue = new LinkedList<>();

        int tmp = 1;
        for (int i=1; i<=n; i++){
            queue.add(i);
        }
        while(queue.size() != 1){
            for (int i=0; i<k-1; i++){
                int back = queue.peek();
                queue.remove();
                queue.add(back);
            }
            queue.remove();
        }
        System.out.print(queue.poll());
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(int n, int k){
        int answer=0;
        Queue<Integer> Q=new LinkedList<>();
        for(int i=1; i<=n; i++)
            Q.offer(i);
        while(!Q.isEmpty()){
            for(int i=1; i<k; i++)
                Q.offer(Q.poll());
            Q.poll();
            if(Q.size()==1)
                answer=Q.poll();
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}