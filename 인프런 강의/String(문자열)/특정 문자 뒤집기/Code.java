// 나의 풀이

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] word = sc.next().toCharArray();
        String str = "";
        int lt=0;

        for (int i=0; i<word.length; i++){
            if (('a'<=word[i] && word[i]<='z') ||
                    ('A'<=word[i] && word[i]<='Z'))
                str += word[i];
        }

        str = new StringBuilder(str).reverse().toString();
        char [] rev = str.toCharArray();

        for (int i=0; i<word.length; i++){
            if (('a'<=word[i] && word[i]<='z') ||
                    ('A'<=word[i] && word[i]<='Z')){
                word[i] = rev[lt];
                lt++;
            }
        }

        String answer = String.valueOf(word);
        System.out.print(answer);
    }
}


// 다른 사람 풀이
import java.util.*;
class Main {
    public String solution(String str){
        String answer;
        char[] s=str.toCharArray();
        int lt=0, rt=str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

// Character.isAlphabetic 메서드로 알파벳인지 아닌지 구분 가능
// 반환 타입은 boolean