package programmers;
import java.util.*;

public class L2_가장_큰_수 {

    public String solution(int[] numbers) {
        String [] temp = new String [numbers.length];
        String answer = "";

        for(int i=0; i< numbers.length; i++){
            temp[i] = numbers[i] + "";
        }
        Arrays.sort(temp, new Comp());

        for(String str: temp){
            answer += str;
        }

        return answer;
    }

    static class Comp implements Comparator<String>{
        @Override
        public int compare(String s1, String s2){
            String temp1 = s1 + s2;
            String temp2 = s2 + s1;

            int result = temp1.compareTo(temp2);

            if(result > 0){
                return -1;
            }else{
                return 1;
            }

        }


    }
}
