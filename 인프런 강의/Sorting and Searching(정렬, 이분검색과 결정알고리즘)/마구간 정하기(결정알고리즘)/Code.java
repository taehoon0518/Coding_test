// 나의 풀이 - ❌
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int [] arr = new int[n];
        int answer = 0;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int lt = 1, rt = arr[n-1] - arr[0];

        while(lt <= rt){
            int mid = (lt + rt)/2;
            if (count(arr, mid) >= c){
                answer = mid;
                lt = mid + 1;
            } else
                rt = mid - 1;
        }
        System.out.print(answer);
    }

    public static int count(int [] arr, int c){
        int cnt = 1;
        int last = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] - last >= c){
                cnt++;
                last = arr[i];
            }
        }
        return cnt;
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int count(int[] arr, int dist){
        int cnt=1;
        int ep=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr, mid)>=c){
                answer=mid;
                lt=mid+1;
            }
            else rt=mid-1;
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int c=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, c, arr));
    }
}

// lt는 최소 간격, rt는 최대 간격
// 이분 탐색이기 때문에 (최소 + 최대)/2 해서 반씩 쪼개가며 탐색
// mid 간격으로 c마리 이상 말을 배치할 수 있으면 일단 답 후보로 저장하고 더 큰 mid 간격으로 시도
// 아니면 mid 간격을 줄여서 시도