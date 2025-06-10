// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean status = true;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char x : str1.toCharArray()){
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        for (char x : str2.toCharArray()){
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (char x : str1.toCharArray()){
            if (map1.get(x) != map2.get(x)){
                status = false;
            }
        }
        if (status)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public String solution(String s1, String s2){
        String answer="YES";
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0)
                return "NO";
            map.put(x, map.get(x)-1);
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

// 나의 풀이 : map을 두개를 사용해서 하나씩 비교

// 다른 사람 풀이 : 한 문자열만 map에 저장하고 나머지 문자열은 즉시 하나의 map과 비교
// 해당 문자가 map에 키로 존재하지 않거나 값이 0이면 "NO"
// 해당 문자를 소모한 것도 체크