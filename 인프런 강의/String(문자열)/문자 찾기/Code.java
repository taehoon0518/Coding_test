import java.util.Scanner;

// 나의 풀이
class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine().toLowerCase();
        char input2 = in.next().toLowerCase().charAt(0);
        char [] words = input1.toCharArray();

        for(int i=0; i<words.length; i++){
            if (words[i]==input2){
                answer++;
            }
        }

        System.out.print(answer);
    }
}

// 다른 사람 풀이

class Main {
    public int solution(String str, char t){
        int answer = 0;
        str = sr.toUpperCase();
        t = Character.toUpperCase(t);

/*      for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == t)
                answer++
        }   */

        for(char x : str.toCharArray()){
            if (x == t) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main slt = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.println(slt.solution(str, t));

    }
}

