package programmers.lv1;

public class L1_문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;

        String lowerS = s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            if(lowerS.charAt(i) == 'p'){
                countP ++;
            } else if(lowerS.charAt(i) == 'y'){
                countY ++;
            }
        }

        if(countP != countY){
            answer = false;
        }

        return answer;
    }
}
