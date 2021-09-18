class Solution {
    public String solution(String phone_number) {
	    String answer = "";
	    for(int n=0;n<phone_number.length()-4;n++){
	        answer = answer.concat("*");
	    }
	    String result = phone_number.substring(phone_number.length() - 4, phone_number.length());
        answer = answer.concat(result);
        return answer;
    }
}
