package programmers.lv1;
import java.util.*;


public class L1_문자열_내림차순으로_배치하기 {

    public String solution(String s) {
        char [] arr = new char [s.length()];

        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr);
        String answer = "";
        for(int i=s.length() -1; i>=0; i--){
            answer += arr[i];
        }


        return answer;
    }
}
