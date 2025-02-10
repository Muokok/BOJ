package programmers.lv1;
import java.util.*;

public class L1_문자열_나누기 {

    public int solution(String s) {
        Stack<Character> stackX = new Stack<>();
        Stack<Character> stackY = new Stack<>();

        int answer = 0;

        stackX.push(s.charAt(0));
        for(int i=1; i< s.length() ; i++){
            if(!stackX.isEmpty() && s.charAt(i) != stackX.peek()){
                stackY.push(s.charAt(i));

                if(stackY.size() == stackX.size()){
                    answer ++;
                    stackX.clear();
                    stackY.clear();
                }
            }else{
                stackX.push(s.charAt(i));
            }

        }

        //if(!stackX.isEmpty()) answer ++;
        return stackX.isEmpty() ? answer : ++answer;
    }
}
