// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String vote = sc.next();
        int max = 0;
        char answer = ' ';

        Map<Character, Integer> list = new HashMap<>();
        for (int i=0; i<cnt; i++){
            char n = vote.charAt(i);
            if (list.containsKey(n))
                list.put(n, list.get(n)+1);
            else
                list.put(n, 1);
        }

        for (int i = 0; i < 5; i++) {
            char ch = (char) (i + 65);
            int count = list.getOrDefault(ch, 0);

            if (max < count) {
                max = count;
                answer = ch;
            }
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public char solution(int n, String s){
        char answer=' ';
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        //System.out.println(map.containsKey('F'));
        //System.out.println(map.size());
        //System.out.println(map.remove('C'));

        int max=Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(key+" "+map.get(key));
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n, str));
    }
}

// map.keySet()을 하면 해당 map에 저장된 모든 key를 가져온다.