import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] split_n = Integer.toString(n).split("");
        for(String string : split_n){
            answer += Integer.parseInt(string);
        }

        return answer;
    }
}
// 리소스 잡아먹는 코드라고 한다.
// 아래 방법도 괜찮을 듯
/*
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n % 10 != 0){
          answer += n % 10;
          if(n < 10){
            break;
          }
          n = n / 10;
        }

        return answer;
    }
}
*/
