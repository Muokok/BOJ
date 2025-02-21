package programmers.lv2;

public class L2_카펫_2 {
    public int[] solution(int brown, int yellow) {



        // 24 24

        // yellow 24를 1*24 2*12 3*8 4*6 돌면서, (sqrt)
        // 필요한 brown의 개수 계산 w*2 + h*2 + 4
        int h = 0;
        int w = 0;
        for(int i=1; i<= Math.sqrt(yellow); i++){
            if(yellow % i != 0) continue;
            h = i;
            w = yellow/i;

            if((w*2 + h*2 + 4) == brown){
                break;
            }
        }

        int[] answer = {w+2,h+2};
        return answer;
    }
}
