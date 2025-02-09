package programmers.lv1;
import java.util.*;

public class L1_카드_뭉치 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 스택같은데?
        // goal 반복문 돌면서
        // 카드1 or 카드2 스택을 확인이 아니라 큐

        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();

        for(int i=0; i<cards1.length; i++){
            q1.offer(cards1[i]);
        }

        for(int i=0; i<cards2.length; i++){
            q2.offer(cards2[i]);
        }

        String answer = "";

        for(int i=0; i<goal.length; i++){
            String peek1 = q1.peek();
            String peek2 = q2.peek();

            if(goal[i].equals(peek1)){
                q1.poll();
            }else if(goal[i].equals(peek2)){
                q2.poll();
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}
