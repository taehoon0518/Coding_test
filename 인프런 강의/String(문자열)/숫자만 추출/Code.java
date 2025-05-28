// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String str = input.replaceAll("[^0-9]", "");
        int answer = Integer.valueOf(str);

        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public int solution(String s){
        //int answer=0;
        String answer="";
        for(char x : s.toCharArray()){
            //if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}