class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 0){
            return 0;
        }
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer += i;
            }
        }
        return answer;
    }
}
// n == 0일 때도 따로 조건을 넣어줬으나 별로 필요 없는 
