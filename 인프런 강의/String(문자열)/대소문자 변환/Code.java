import java.util.Scanner;

// 나의 풀이
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char [] word = input.toCharArray();

        for (int i=0; i<word.length; i++){
            if(Character.isUpperCase(word[i])==true)
                word[i]=Character.toLowerCase(word[i]);
            else
                word[i]=Character.toUpperCase(word[i]);
        }

        String answer = String.valueOf(word);
        System.out.print(answer);
    }
}

// 다른 사람 풀이
class Main {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if (Character.isLowerCase(x))
                answer += Character.toUpperCase(x);
            else
                answer += Character.toLowerCase(x);
        }

        /* ASCII로 문제 풀이
        if (x>=97 && x<=122) answer += (char)(x-32);
        else answer += (char)(x+32)
         */

        return answer;
    }
    public static void main(String[] args) {
        Main slt = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(slt.solution(str));
    }
}

// 나의 풀이 문자열 -> 문자 배열 -> 문자열 ... 변환이 너무 많음
// 다른 사람의 풀이 입력받은 문자열 -> 문자 배열