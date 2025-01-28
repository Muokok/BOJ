package programmers.lv1;
import java.util.*;

public class L1_약수의_개수와_덧셈 {
    static Set<Integer> getDivisors(int n){
        Set<Integer> s = new HashSet<>();

        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i ==0){
                s.add(i);
                s.add(n / i);
            }
        }
        return s;
    }

    public int solution(int left, int right) {
        Set<Integer> s = new HashSet<>();
        int answer = 0;

        for(int i=left; i<=right; i++){
            s = getDivisors(i);
            if(s.size() % 2 ==0){
                answer += i;
            }else{
                answer -= i;
            }
        }

        return answer;
    }

}
