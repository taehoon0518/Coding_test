// 나의 풀이

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String answer = "";
        int i = 0;

        while (i < input.length()){
            int count = 1;
            while (i + count < input.length() &&
                    input.charAt(i)==input.charAt(i+count))
            {
                count++;
            }
            if(count == 1)
                answer += input.charAt(i);
            else
                answer += input.charAt(i) + String.valueOf(count);
            i += count;
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public String solution(String s){
        String answer="";
        s=s+" ";
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1))
                cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

// 마지막 문자를 비교할 때 공백 추가해서 IndexOutOfBoundsException을 방지