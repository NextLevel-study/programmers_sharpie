class Solution {
    public long solution(long n) { //숙수념 활용
        long sqrt = 0;
        double num = (double) n / 2;
        while(num > 0){
            sqrt++;
            num = num - sqrt;
        }
        if((num + sqrt) * 2 != sqrt){
            return -1;
        }
        else{
            return (sqrt + 1) * (sqrt + 1);
        }
    }
}
