// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        int a = 1;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        while(true){
            if (isPossible(a, arr, m)){
                System.out.print(a);
                break;
            } else {
                a++;
            }
        }
    }

    public static boolean isPossible(int cap, int [] arr, int m){
        int sum = 0;
        int div = 1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > cap) return false;

            if ((sum + arr[i]) > cap){
                div++;
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }
        }
        return div <= m;
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int count(int[] arr, int capacity){
        int cnt=1, sum=0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else sum+=x;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer=0;
        int lt=Arrays.stream(arr).max().getAsInt();
        int rt=Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr, mid)<=m){
                answer=mid;
                rt=mid-1;
            }
            else lt=mid+1;
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}

// 나의 방식
// 용량을 1부터 완전 탐색

// 다른 사람 방식
// lt = 곡 중에 가장 긴 곡, rt = 모든 곡의 합 (곡의 용량이 가장 긴 곡 보다는 커야하기 때문)
// 여기의 중간 값부터 탐색하며 이분 탐색