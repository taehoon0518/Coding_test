// 나이 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int answer = 0;

        Map <Character, Integer> map = new HashMap<>();
        Map <Character, Integer> a = new HashMap<>();

        //0~1 (2개)
        for (int i=0; i<t.length()-1; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char x : t.toCharArray())
            a.put(x, a.getOrDefault(x, 0) + 1);

        int lt = 0;
        for (int rt = t.length()-1; rt<s.length(); rt++){
            map.put(s.charAt(rt), map.getOrDefault(s.charAt(rt), 0) + 1);
            if (a.equals(map)) answer++;

            char tmp = s.charAt(lt);
            map.put(tmp, map.get(tmp)-1);
            if (map.get(tmp)==0) map.remove(s.charAt(lt));
            lt++;
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(String a, String b){
        int answer=0;
        HashMap<Character, Integer> am=new HashMap<>();
        HashMap<Character, Integer> bm=new HashMap<>();
        for(char x : b.toCharArray())
            bm.put(x, bm.getOrDefault(x, 0)+1);
        int L=b.length()-1;
        for(int i=0; i<L; i++)
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
        int lt=0;
        for(int rt=L; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
            if(am.equals(bm))
                answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0)
                am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(T.solution(a, b));
    }
}