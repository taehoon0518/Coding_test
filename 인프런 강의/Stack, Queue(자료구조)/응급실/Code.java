// 나의 풀이 - ❌
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        int count = 0;

        Queue <Person> q = new LinkedList<>();
        for (int i=0; i<n; i++){
            q.offer(new Person(i, sc.nextInt()));
        }
    }
}

class Person {
    int index;
    int priority;
    public Person (int index, int priority){
        this.index = index;
        this.priority = priority;
    }
}

// 다른 사람 풀이
import java.util.*;
import java.io.*;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id=id;
        this.priority=priority;
    }
}

class Main {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        Queue<Person> Q=new LinkedList<>();
        for(int i=0; i<n; i++){
            Q.offer(new Person(i, arr[i]));
        }
        while(!Q.isEmpty()){
            Person tmp=Q.poll();
            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m)
                    return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}

// 다른 사람 풀이
// 맨 앞 환자 빼기 (tmp에 넣기)
// 만약 뒤쪽에 우선순위가 더 높은 환자 있으면 -> 뺀 환자(tmp)를 맨 뒤로 넣고 tmp=null
// 만약 맨 앞 환자가 우선순위가 제일 높을 때 (if(tmp!=null) answer++;