// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] board = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int [] moves = new int[m];
        for (int i=0; i<m; i++){
            moves[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (board[j][moves[i]-1] != 0){
                    if (!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {
                        stack.pop();
                        count += 2;
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                    stack.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}

// 다른 사람 풀이
import java.util.*;
class Main {
    public int solution(int[][] board, int[] moves){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp=board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++)
            moves[i]=kb.nextInt();
        System.out.println(T.solution(board, moves));
    }
}