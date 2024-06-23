package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호 {
    public static String solution(int num, String str){

        String answer = "";
        for(int i=0; i< num; i++){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int decimalNum = Integer.parseInt(tmp, 2);
            answer += (char)decimalNum;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();

        System.out.println(solution(num, input));
    }

}
