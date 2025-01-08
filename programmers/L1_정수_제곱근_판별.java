package programmers;

public class L1_정수_제곱근_판별 {
    public long solution(long n) {
        long answer = 0;

        int sqrt = (int) Math.sqrt(n);
        if(sqrt == Math.sqrt(n)){
            answer = (long) Math.pow(sqrt+1,2);
        }else{
            answer = -1;
        }

        return answer;
    }
}
