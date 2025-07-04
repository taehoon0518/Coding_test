// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n-1; i++){
            int idx = i;
            for (int j=i+1; j<n; j++){
                if (arr[idx]>arr[j])
                    idx = j;
            }
            int tmp = arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;
        }

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int[] solution(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            int idx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[idx])
                    idx=j;
            }
            int tmp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;
        }
        return arr;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(n, arr)) System.out.print(x+" ");
    }
}