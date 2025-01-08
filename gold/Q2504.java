package gold;

import java.io.*;
import java.util.*;

public class Q2504 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String input = br.readLine();
        int result = 0;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == ')' && stack.peek() == '('){
                if(stack.size() == 1){

                }else{
                    stack.pop();
                }

            }else if(input.charAt(i) == ']'){

            }else{
                stack.push(input.charAt(i));
            }
        }






    }
}
