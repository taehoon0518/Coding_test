// 나의 풀이
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][2];

        for (int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i][0] > arr[j][0] || arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1]) {
                    int tmp1 = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = tmp1;

                    int tmp2 = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = tmp2;
                }
            }
        }
        for (int i=0; i<n; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}

// 다른 사람 풀이
import java.util.*;
class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x==o.x)
            return this.y-o.y;
        else
            return this.x-o.x;
    }
}

class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Point> arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for(Point o : arr)
            System.out.println(o.x+" "+o.y);
    }
}

// 나의 방식
// 비교를 통해 맨 앞의 인덱스부터 오름차순으로 배열을 확정

// 다른 사람 방식
// Collections.sort() 메소드를 실행하면 compareTo라는 메소드가 실행됨
// 그 compareTo의 메소드를 오버라이드해서 처리
// compareTo()의 반환 값
// 반환값이 음수면 ‘앞에 와야 함’, 0이면 ‘같음’, 양수면 ‘뒤에 와야 함'