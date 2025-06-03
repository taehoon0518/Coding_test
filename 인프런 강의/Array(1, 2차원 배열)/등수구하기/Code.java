// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] score = new int[count];

        for (int i=0; i<count; i++){
            score[i] = sc.nextInt();
        }

        for (int i=0; i<count; i++){
            int rank = 1;
            for (int j=0; j<count; j++){
                if(i==j)
                    continue;
                if (score[i]<score[j])
                    rank ++;
            }
            System.out.print(rank + " ");
        }
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x :T.solution(n, arr)) System.out.print(x+" ");
    }
}