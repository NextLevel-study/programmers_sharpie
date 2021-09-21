class Solution {
    public int[] solution(int n, int m) {
        int max = n > m ? n : m;
        int min = n < m ? n : m;
        while(max % min != 0){
            int temp = max % min;
            max = min;
            min = temp;
        }
        int gcd = min;
        int lcm = gcd * n/gcd * m/gcd;
        int[] answer = {gcd, lcm};
        return answer;
    }
}
