// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] height = new int[count];
        int answer = 0;
        int tall = 0;

        for (int i=0; i<count; i++){
            height[i] = sc.nextInt();
        }
        for (int i=0; i<count; i++){
            if(tall<height[i]){
                answer++;
                tall = height[i];
            }
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public int solution(int n, int[] arr){
        int answer=1, max=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
                answer++;
            }
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
        System.out.print(T.solution(n, arr));
    }
}
