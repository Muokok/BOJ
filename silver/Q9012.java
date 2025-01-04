package silver;

import java.util.*;
import java.io.*;

public class Q9012 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    stack.push(input.charAt(j));
                }else{
                    if(stack.isEmpty()){
                        stack.push(input.charAt(j));
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            if(!stack.isEmpty()){
                bw.write("NO" + "\n");
            }else{
                bw.write("YES" + "\n");
            }

            stack.clear();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
