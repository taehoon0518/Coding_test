// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (char x : str.toCharArray()){
            if (x=='+' || x=='-' || x=='*' || x=='/'){
                answer = cal(stack.pop(), stack.pop(), x);
                stack.push(answer);
            }
            else
                stack.push(x - '0');
        }
        System.out.print(answer);

    }

    public static int cal(int b, int a, char x){
        if (x == '+')
            return a+b;
        else if (x == '-')
            return a-b;
        else if (x == '*')
            return a*b;
        else
            return a/b;
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(String str){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-48);
            }
            else{
                int rt=stack.pop();
                int lt=stack.pop();
                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }
        answer=stack.get(0);
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}