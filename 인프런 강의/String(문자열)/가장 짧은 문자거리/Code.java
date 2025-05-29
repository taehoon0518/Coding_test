// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] str = sc.next().toCharArray();
        char key = sc.next().charAt(0);

        int [] answer = new int[str.length];

        for (int i=0; i<str.length; i++){
            int distance = 0;
            while(true){
                int left =  i - distance;
                int right = i + distance;

                if(left >=0 && str[left]==key){
                    answer[i] = distance;
                    break;
                }
                else if (right < str.length && str[right]==key){
                    answer[i] = distance;
                    break;
                }
                distance++;
            }
        }
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}


// 다른 사람 풀이
import java.util.*;

class Main {
    public int[] solution(String s, char t){
        int[] answer=new int[s.length()];
        int p=1000;
        // 왼쪽에서 오른쪽
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        // 오른쪽에서 왼쪽으로
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==t)
                p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}

// 나의 풀이 O(n^2) / 다른 사람 풀이 O(n)
