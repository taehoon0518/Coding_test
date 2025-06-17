// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Stack<Character> stack = new Stack<>();

        for (char x : a.toCharArray()){
            if(x=='(')
                stack.push(x);
            else{
                if (stack.isEmpty()){
                    System.out.print("NO");
                    return;
                }
                else
                    stack.pop();
            }
        }
        if(!stack.isEmpty()){
            System.out.print("NO");
            return;
        }
        System.out.print("YES");
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public String solution(String str){
        String answer="YES";
        Stack<Character> stack=new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}