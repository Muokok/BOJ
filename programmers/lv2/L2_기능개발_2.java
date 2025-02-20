package programmers.lv2;
import java.util.*;

public class L2_기능개발_2 {

    public int[] solution(int[] progresses, int[] speeds) {
        int [] remain = new int[progresses.length];
        int [] day = new int[progresses.length];

        for(int i=0; i<progresses.length; i++){
            remain[i] = 100 -progresses[i];
            //System.out.println(remain[i]);
        }

        for(int i=0; i<speeds.length; i++){
            day[i] = (int)Math.ceil((double)remain[i] / speeds[i]);
            //System.out.println(day[i]);
        }
        // 7 3 9 12 2 1
        List<Integer> list = new ArrayList<>();

        int maxDay = day[0];
        int cnt = 1;
        for(int i=1; i<day.length; i++){
            if(maxDay < day[i]){
                list.add(cnt);
                cnt = 1;
                maxDay = day[i];
            }else{
                cnt++;
            }
        }
        list.add(cnt);

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
