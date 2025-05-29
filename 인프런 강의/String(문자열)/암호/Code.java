// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String input = sc.next();
        String [] pw = new String[count];

        String answer = "";

        for (int i=0; i<count; i++){
            pw[i] = input.substring(0, 7);
            input = input.substring(7);
        }

        for (int i=0; i<count; i++){
            int x = 64;
            int word = 0;
            for (int j=0; j<7; j++){
                if (pw[i].charAt(j)=='#')
                    word += x;
                x /= 2;
            }
            System.out.print((char)word);
        }
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public String solution(int n, String s){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num=Integer.parseInt(tmp, 2);
            answer+=(char)num;
            s=s.substring(7);
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

// 나의 풀이
// 7자리씩 자르고 문자열 비교 후 합

// 다른 사람 풀이
// 앞의 7자리 잘라서 0, 1로 되어있는 2진수로 만든 후
// Integer.parseInt(문자열, 2) -> 문자열(2진수) -> 10진수로 만들기