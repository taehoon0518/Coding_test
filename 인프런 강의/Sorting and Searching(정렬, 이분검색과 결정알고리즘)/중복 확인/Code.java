// 나의 풀이 - Time Limit Exceeded
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        boolean answer = false;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            int pos = i;
            for (int j=0; j<n; j++){
                if (pos == j)
                    continue;
                if (arr[i]==arr[j])
                    answer = true;
            }
        }

        if (answer)
            System.out.print("D");
        else
            System.out.print("U");
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public String solution(int n, int[] arr){
        String answer="U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                answer="D";
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}

// 나의 풀이
// 모든 수를 순회하며 중복된 값이 있는지 찾기

// 다른 사람 풀이
// 배열을 정렬한 후 현재 인덱스와 다음 인덱스 비교 => 같으면 D