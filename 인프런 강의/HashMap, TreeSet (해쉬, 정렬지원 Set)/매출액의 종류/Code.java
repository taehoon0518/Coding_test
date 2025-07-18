// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Map <Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt=k-1; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            System.out.print(map.size() + " ");
            if (map.get(arr[lt])==1)
                map.remove(arr[lt]);
            else{
                int tmp = map.get(arr[lt])-1;
                map.remove(arr[lt]);
                map.put(arr[lt], tmp);
            }
            lt++;
        }
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
    }
}