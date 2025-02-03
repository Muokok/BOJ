package programmers.lv1;
import java.util.*;

public class L1_덧칠하기 {


    public int solution(int n, int m, int[] section) {

        Queue<Integer> q = new LinkedList<>();
        int answer = 0;

        for(int i=0; i<section.length; i++){
            int sec = section[i];
            q.offer(sec);
        }

        int startSec = q.poll();// 1

        while(!q.isEmpty()){

            if(!q.isEmpty() && q.peek() < startSec + m){
                q.poll();
            }else{
                startSec = q.poll(); //2
                answer ++;
            }
        }
        answer ++;

        return answer;
    }
}
