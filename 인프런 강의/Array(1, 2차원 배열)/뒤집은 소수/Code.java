// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] list = new int[n];

        for(int i=0; i<n; i++){
            list[i]=Integer.parseInt(
                    new StringBuilder(sc.next()).reverse().toString());
        }

        for(int i=0; i<n; i++){
            if(isPrime(list[i]))
                System.out.print(list[i] + " ");
        }
    }
    public static boolean isPrime(int n){
        if(n==1)
            return false;

        for(int i=2; i<n; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp=arr[i];
            int res=0;
            while(tmp>0){
                int t=tmp%10;
                res=res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res)) answer.add(res);
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
// 나의 풀이 : StringBuilder를 이용한 reverse -> .toString() -> Integer.parseInt 로 뒤집기
// 다른 사람 풀이 : 1의 자리를 추출해서 한칸씩 쌓기

// if (n < 2 || n % 2 == 0) return false;
// 이런식으로 2의 배수는 아예 처음부터 거르는 것도 방법이 될듯