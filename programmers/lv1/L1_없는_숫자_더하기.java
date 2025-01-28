package programmers.lv1;
import java.util.*;

public class L1_없는_숫자_더하기 {

    public int solution(int[] numbers) {
        Map<Integer,Integer> map = new HashMap<>();

        int answer = 0;

        for(int i=0; i<10; i++){
            map.put(i,0);
        }

        for(int j=0; j<numbers.length; j++){
            map.put(numbers[j], map.get(j) + 1);
        }

        for(int k=0; k<10; k++){
            if(map.get(k) == 0){
                answer += k;
            }
        }

        return answer;
    }
}
