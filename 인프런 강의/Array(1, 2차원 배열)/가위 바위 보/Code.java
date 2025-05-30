// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] a = new int[count];
        int [] b = new int[count];
        char [] answer = new char[count];

        for (int i=0; i<count; i++){
            a[i] = sc.nextInt();
        }

        for (int i=0; i<count; i++){
            b[i] = sc.nextInt();
        }

        for (int i=0; i<count; i++){
            if (a[i] == b[i]) answer[i] = 'D';
            else if (a[i]==1&&b[i]==3) answer[i] = 'A';
            else if (a[i]==2&&b[i]==1) answer[i] = 'A';
            else if (a[i]==3&&b[i]==2) answer[i] = 'A';
            else answer[i] = 'B';
        }
        for (char x : answer){
            System.out.println(x);
        }
    }
}

// 다른 사람 풀이
import java.util.*;

class Main {
    public String solution(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            if(a[i]==b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=kb.nextInt();
        }
        for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
    }
}