// 나의 풀이

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String reverse = "";
        input = input.toLowerCase();
        reverse = new StringBuilder(input).reverse().toString();

        if (input.equals(reverse))
            System.out.print("YES");
        else
            System.out.print("NO");

    }
}
// 문자열 비교는 ==이 아니라 .equals() 메서드 사용


// 다른 사람 풀이
import java.util.*;

class Main {
    public String solution(String str){
        String answer="YES";
        str=str.toUpperCase();
        int len=str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
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

// for문 돌며 앞과 뒤 동일한지

// -------------------------------------------------------
import java.util.*;

class Main {
    public String solution(String str){
        String answer="NO";
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}

// .equalsIgnoreCase() 대소문자 구분하지 않고 동일한지 확인