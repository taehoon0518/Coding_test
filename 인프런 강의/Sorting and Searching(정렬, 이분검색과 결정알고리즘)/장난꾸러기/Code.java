// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] list = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            list[i] = arr[i];
        }
        Arrays.sort(list);
        int count = 1;
        for (int i=0; i<n; i++){
            if (arr[i] != list[i])
                System.out.print(count + " ");
            count++;
        }
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();
        int[] tmp=arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++){
            if(arr[i]!=tmp[i])
                answer.add(i+1);
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(n, arr))
            System.out.print(x+" ");
    }
}