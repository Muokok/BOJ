package programmers.lv2;
import java.util.*;

public class L2_올바른_괄호 {

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        boolean answer = true;
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && s.charAt(i) == ')'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
