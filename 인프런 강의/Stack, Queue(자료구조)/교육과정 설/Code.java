// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String c = sc.next();
        int count = 0;

        Queue <Character> q = new LinkedList<>();

        for (int i=0; i<c.length(); i++){
            q.offer(c.charAt(i));
        }

        while(!q.isEmpty()){
            char key = q.poll();
            if (key == a.charAt(count))
                count++;
            else
                continue;
            if (count == a.length()){
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public String solution(String need, String plan){
        String answer="YES";
        Queue<Character> Q=new LinkedList<>();
        for(char x : need.toCharArray())
            Q.offer(x);
        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll())
                    return "NO";
            }
        }
        if(!Q.isEmpty())
            return "NO";
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.println(T.solution(a, b));
    }
}

// 나의 풀이
// 수업 계획을 Queue에 넣고 하나씩 poll()하며 검증

// 다른 사람 풀이
// 우선 순위를 Queue에 넣고 수업 계획을 하나씩 순회하다가
// 우선 순위에 포함된 수업이 나오면 우선 순위를 poll() 했을 때
// 동일하지 않으면 바로 NO
// 우선 순위 Queue가 싹 다 비워지면 YES