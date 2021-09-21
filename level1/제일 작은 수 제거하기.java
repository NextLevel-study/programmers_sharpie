class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        if(answer.length != 1){
            int min_index = 0;
            for(int n = 1; n < answer.length; n++){
                if(answer[min_index] > answer[n]){
                    min_index = n;
                }
            }
            for(int n = min_index; n < answer.length - 1; n++){
                answer[n] = answer[n+1];
            }
            int[] newArray = new int[answer.length - 1];
            for(int n = 0; n < answer.length - 1; n++){
                newArray[n] = answer[n];
            }
            return newArray;
        }else{
            answer[0] = -1;
            return answer;
        }
    }
}
