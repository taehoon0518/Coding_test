// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        int answer = 1;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int x : arr){
            if (x == m){
                System.out.print(answer);
                return;
            }
            answer++;
        }
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(arr[mid]==m){
                answer=mid+1;
                break;
            }
            if(arr[mid]>m)
                rt=mid-1;
            else
                lt=mid+1;
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}

// 이분 탐색
// 정렬된 배열에서 중간에 있는 값 확인
// 찾는 값보다 작으면 오른쪽에서 찾기 / 찾는 값보다 크면은 왼쪽에서 찾기