class Solution {
    public long solution(long n) {
        String[] split_num = Long.toString(n).split("");
        for(int i = 0; i < split_num.length; i++){
            String max = split_num[i];
            for(int j = i + 1; j < split_num.length; j++){
                if(Long.parseLong(max) < Long.parseLong(split_num[j])){
                    String tmp = max;
                    max = split_num[j];
                    split_num[j] = tmp;
                }
            }
            split_num[i] = max;
        }
        long answer = Long.parseLong(String.join("", split_num));
        return answer;
    }
}
