// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> answer = new ArrayList<>();
        int n = sc.nextInt();
        int [] arr1 = new int[n];

        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
            answer.add(arr1[i]);
        }

        int m = sc.nextInt();
        int [] arr2 = new int[m];
        for (int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
            answer.add(arr2[i]);
        }
        Collections.sort(answer);
        for (int i=0; i<n+m; i++){
            System.out.print(answer.get(i) + " ");
        }
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
    }
}

// 나의 풀이 Collection.sort() 메서드를 사용함

// 다른 사람 풀이
// Two pointers를 사용함
// p1, p2가 각각의 배열을 가리키고 크기를 비교하며 answer.add()를 함
// 한 배열이 다 담기면 나머지 배열의 남은 값들을 마저 answer.add()를 해줌