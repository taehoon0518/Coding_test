// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        int count = 1;
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int m=j+1; m<n; m++){
                    set.add(arr[i]+arr[j]+arr[m]);
                }
            }
        }
        NavigableSet<Integer> decendingSet = set.descendingSet();

        for(Integer s : decendingSet){
            if (count == k){
                System.out.print(s);
                return;
            }
            else
                count++;
        }
        System.out.print(-1);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(int[] arr, int n, int k){
        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        //Tset.remove(143);
        //System.out.println(Tset.size());
        //System.out.println("first : "+ Tset.first());
        //System.out.println("last : "+ Tset.last());

        for(int x : Tset){
            //System.out.println(x);
            cnt++;
            if(cnt==k) return x;
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}

// 나의 코드 : 기본 TreeSet 생성 후 descendingSet() 사용
// 다른 사람 코드 : 처음부터 내림차순 TreeSet 생성
// 처음부터 내림차순 TreeSet을 생성하면 descendingSet() 작업 필요없이 바로 사용가능