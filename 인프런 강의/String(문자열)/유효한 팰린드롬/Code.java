// 나의 풀이

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] input = sc.nextLine().replaceAll(" ","").toCharArray();
        String words = "";

        for (int i=0; i<input.length; i++){
            if(Character.isAlphabetic(input[i])){
                words += input[i];
            }
        }
        String reverse = new StringBuilder(words).reverse().toString();
        if(words.equalsIgnoreCase(reverse))
            System.out.print("YES");
        else
            System.out.print("NO");

    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public String solution(String s){
        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}

// 나의 풀이 O(n^2) 다른 사람 풀이 O(n)
// 정규표현식을 사용해 한 번에 알파벳만 필터링하는게 훨씬 빠름