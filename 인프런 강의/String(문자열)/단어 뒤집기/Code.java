// 나의 풀이
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String [] answer = new String[count];
        for (int i=0; i<count; i++){
            char [] word = sc.next().toCharArray();

            for (int j=0; j<word.length/2; j++){
                char tmp = word[j];
                word[j] = word[word.length-1-j];
                word[word.length-1-j] = tmp;
            }
            answer[i] = String.valueOf(word);
        }
        for (String x : answer){
            System.out.println(x);
        }
    }
}

// 다른 사람 풀이
class Main {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x : str){
            String tmp=new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
// ArrayList 사용
// StringBuilder의 reverse() 메소드 = 문자열 뒤집기
// StringBuilder.reverse()를 쓰면은 StringBuilder 객체 형태로 반환되기 때문에 toString() 필수!!

//----------------------------------------------

class Main {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x : str){
            char[] s=x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}

// lt와 rt를 사용하여 단어 뒤집기
