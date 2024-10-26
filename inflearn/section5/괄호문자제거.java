package inflearn.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호문자제거 {

    private static Stack<Character> solution(String input){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == ')'){
                while (stack.peek() != '('){
                    stack.pop();
                }
                if (stack.peek() == '(') stack.pop();

            }
            else stack.push(input.charAt(i));

        }

        return stack;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        for (Character ch : solution(input)) {
            System.out.print(ch);
        }
    }
}
