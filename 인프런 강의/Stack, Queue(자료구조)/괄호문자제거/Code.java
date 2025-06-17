// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Stack<Character> stack = new Stack<>();

        for (char x : a.toCharArray()){
            if (x=='(')
                stack.push(x);
            else if (x==')')
                stack.pop();
            else if (stack.isEmpty())
                System.out.print(x);
        }
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public String solution(String str){
        String answer="";
        Stack<Character> stack=new Stack<>();
        for(char x : str.toCharArray()){
            if(x==')'){
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }
        for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

// 나의 풀이
// (은 push(), )은 pop
// 문자를 입력받았을 때 stack이 비어있으면 출력
// 스택이 비어있다 = 괄호가 닫혔다 = 괄호안에 있는 문자들은 다 무시

// 다른 사람 풀이
// ) 전까지 모든 문자 다 push()
// (가 나올 때 까지 pop() = 괄호안에 있는 문자들 다 무시