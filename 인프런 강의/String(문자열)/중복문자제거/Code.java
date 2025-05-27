// 나의 코드

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] input = sc.next().toCharArray();
        String answer = "";

        for (char x : input){
            if (answer.indexOf(x) == -1)
                answer += x;
        }

        System.out.print(answer);

    }
}

// 다른 사람 코드
import java.util.*;
class Main {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i)
                answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}

// indexOf(특정 문자) 메서드 => 해당 문자가 없으면은 -1 반환