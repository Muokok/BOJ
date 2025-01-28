package programmers.lv1;

public class L1_x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long sum = x;

        for(int i=0; i<n; i++){
            answer[i] = sum;
            sum = sum + x;
        }

        return answer;
    }
}
