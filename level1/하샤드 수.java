class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] split_string = Integer.toString(x).split("");
        int sum = 0;
        for(int n = 0; n < split_string.length; n++){
            sum += Integer.parseInt(split_string[n]);
        }
        if(x % sum != 0){
            answer = false;
        }
        return answer;
    }
}
