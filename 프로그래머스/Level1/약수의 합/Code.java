// 나의 풀이
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }
}



// 다른 사람 풀이
class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
        for(int i =1 ; i<=num/2;i++){
            if(num%i==0){
                answer+=i;
            }
        }
        return answer+num;
    }
}
// 약수이기 떄문에 for문 절반만 돌고 마지막에 num만 해줘도 됨