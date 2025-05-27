// 나의 풀이
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] words = input.split(" ");
        String answer = words[0];
        for (int i=1; i<words.length; i++){
            if (answer.length() < words[i].length())
                answer = words[i];
        }
        System.out.print(answer);
    }
}

// 다른 사람 풀이
import java.util.Scanner;
class Main {
    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE;
        String [] s = str.split(" ");
        for (String x : s){
            int len = x.length();
            if (len>m){
                m = len;
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
// Integer.MIN_VALUE => int 타입이 가질 수 있는 최솟값

//----------------------------------------------
import java.util.Scanner;
class Main {
    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!= -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len>m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if (str.length() > m)
            answer = str;

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
// pos = 공백인 부분의 인덱스 값