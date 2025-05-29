// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int first = 0;

        for (int i=0; i<count; i++){
            int input = sc.nextInt();
            if(first < input)
                System.out.print(input + " ");
            first = input;
        }
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
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
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}

// ArrayList : 크기가 동적 (크기를 따로 지정하지 않아도 됨)
// add 메서드 : 해당 자리에 데이터 삽입. 값들이 뒤로 밀림
// 존재하지 않는 인덱스에 삽입하려하면 오류 발생!