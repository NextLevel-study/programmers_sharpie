class Solution {
    public String solution(String s) {
        int cnt = 0;
        String[] split_s = s.split(""); // 공백이 여러 개일 수 있다!
        for(int i = 0; i < split_s.length; i++){
            if(split_s[i].equals(" ")){
                cnt = 0;
            }else{
                split_s[i] = changeCase(cnt, split_s[i]);
                cnt++;
            }
        }
        String answer = String.join("", split_s);
        return answer;
    }

    private String changeCase(int index, String string){
        if(index == 0 || index % 2 == 0){
            return string.toUpperCase();
        }
        else {
            return string.toLowerCase();
        }
    }
}
