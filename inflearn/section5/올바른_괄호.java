package inflearn.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 올바른_괄호 {

    private static String solution(String input){
        Stack<Character> stack = new Stack<>();

        if (input.charAt(0) == ')') return "NO";

        for (int i = 0; i < input.length(); i++) {
            // 닫는 괄호가 여는 괄호보다 많은 경우 >> ())((에 런타임 에러가 날 수도 있으므로 !stack.isEmpty()가 필요하다.
            if (input.charAt(i) == ')' && !stack.isEmpty()) {
                if (stack.peek() == '(') stack.pop();
            }else {
                stack.push(input.charAt(i));
            }
        }

        if (stack.isEmpty()){
            return "YES";
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(solution(input));
    }

}
