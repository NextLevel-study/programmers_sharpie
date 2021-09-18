class Solution {
    public int solution(int num) {
        long long_num = num;
        int answer = 0;
        while(long_num != 1){
            if(answer >= 500){
                answer = -1;
                break;
            }
            if(long_num % 2 != 0){
                long_num = long_num * 3 + 1;
                answer++;
            }else{
                long_num = long_num / 2;
                answer++;
            }
        }
        return answer;
    }
}
