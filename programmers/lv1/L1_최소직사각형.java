package programmers.lv1;

import java.util.*;

public class L1_최소직사각형 {


    public int solution(int[][] sizes) {
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }

        int Xmax = 0;
        int Ymax = 0;

        for(int j=0; j<sizes.length; j++){
            if(Xmax < sizes[j][0]){
                Xmax = sizes[j][0];
            }

            if(Ymax < sizes[j][1]){
                Ymax = sizes[j][1];
            }
        }



        int answer = Xmax * Ymax;
        return answer;
    }
}
