package programmers;

import java.util.*;

public class L1_모의고사 {

    public int[] solution(int[] answers) {

        int [] pick1 = {1,2,3,4,5}; // 5
        int [] pick2 = {2,1,2,3,2,4,2,5}; // 8
        int [] pick3 = {3,3,1,1,2,2,4,4,5,5}; // 10
        int [] score = {0,0,0};

        for(int i=0; i<answers.length; i++){
            if(answers[i] == pick1[i%5]){
                score[0] ++;
            }
            if(answers[i] == pick2[i%8]){
                score[1] ++;
            }
            if(answers[i] == pick3[i%10]){
                score[2] ++;
            }
        }

        // 최대 점수 구하기
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // 최대 점수를 가진 수포자 리스트 생성
        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++) if(max == score[i]) answ.add(i+1);

        int[] answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }

        return answer;
    }
}
