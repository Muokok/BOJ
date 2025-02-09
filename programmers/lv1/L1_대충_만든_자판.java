package programmers.lv1;
import java.util.*;

public class L1_대충_만든_자판 {


    public int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];

        int result = 0;

        for(int i=0; i<targets.length; i++){
            int sum = 0;

            for(int j=0; j<targets[i].length(); j++){
                int minIdx = 101;

                for(int k=0; k< keymap.length; k++){
                    for(int l=0; l<keymap[k].length(); l++){
                        if(keymap[k].charAt(l) == targets[i].charAt(j)){
                            if(l < minIdx){
                                minIdx = l;
                            }
                        }
                    }
                }
                if(minIdx == 101){
                    sum = -1;
                    break;
                }else{
                    sum += (minIdx+1);
                }
            }
            answer[i] = sum;

        }


        return answer;
    }
}
