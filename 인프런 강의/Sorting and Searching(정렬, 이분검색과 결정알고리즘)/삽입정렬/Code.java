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
        for (int i=1; i<n; i++){
            int cp = i-1;
            int pos = i;
            while(cp >= 0){
                if (arr[pos] < arr[cp]){
                    int tmp = arr[pos];
                    arr[pos] = arr[cp];
                    arr[cp] = tmp;
                    pos--;
                    cp--;
                }
                else
                    break;
            }
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
        for(int i=1; i<n; i++){
            int tmp=arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp)
                    arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
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