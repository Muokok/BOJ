package programmers.lv1;

public class L1_두_정수_사이의_합 {

//    public long solution(int a, int b) { // 나의 풀이
//        long answer = 0;
//
//        int max = Math.max(a,b);
//        int min = Math.min(a,b);
//
//        for(long i=min; i <=max; i++){
//            answer += i;
//        }
//        return answer;
//    }

    public long solution(int a, int b) { // Perplexity가 개선해준 코드
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        return (max - min + 1) * (max + min) / 2;
    }


}
