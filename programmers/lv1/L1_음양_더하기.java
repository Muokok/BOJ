package programmers.lv1;

public class L1_음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == false){
                absolutes[i] *= -1;
            }
        }

        for(int j=0; j<absolutes.length; j++){
            answer += absolutes[j];
        }

        return answer;
    }
}
