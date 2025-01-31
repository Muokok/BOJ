package programmers.lv2;
import java.util.*;

public class L2_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        int needDay = 0;
        for(int i=0; i< progresses.length; i++){
            if(((100 - progresses[i]) % speeds[i]) != 0){
                needDay = (100 - progresses[i]) / speeds[i] + 1;
            }else{
                needDay = (100 - progresses[i]) / speeds[i];
            }
            q.add(needDay);
        }

        for(int num :q ){
            System.out.println(num);
        }

        int count =1;
        int max = 0;
        int current = q.poll();

        while(!q.isEmpty()){
            if(max < current) max = current;
            // 99 7 9
            if(max >= q.peek()){
                count ++;
            }else{
                result.add(count);
                count = 1;
            }
            current = q.poll();
        }

        result.add(count);

        int [] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
