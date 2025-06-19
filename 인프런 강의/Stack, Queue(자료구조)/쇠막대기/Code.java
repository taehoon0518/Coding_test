// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        char before = ' ';
        int answer = 0;

        for (char x : str.toCharArray()){
            if (x == '('){
                before = x;
                stack.push(x);
            }
            else
            if (before == '('){
                stack.pop();
                answer += stack.size();
                before = ')';
            }
            else{
                answer++;
                stack.pop();
            }
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(String str){
        int cnt=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(')
                stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1)=='(')
                    cnt+=stack.size();
                else
                    cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

// 다른 사람 풀이
// 레이저에 사용된 (만 지움.
// 이전에 )')' 이면 막대기의 끝을 의미 : 카운트 + 1