class Solution {
    public int[] solution(long n) {
        String[] split_n = Long.toString(n).split("");
        int[] answer = new int[split_n.length];
        for(int i = split_n.length - 1; i >= 0; i--){
            answer[i] = Integer.parseInt(split_n[split_n.length - 1 - i]);
        }
        return answer;
    }
}
