package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정_문자_뒤집기 {

    public static String solution(String str){
        String answer;

        char[] charArr = str.toCharArray();
        int lt=0, rt=str.length()-1;

        while (lt < rt){
            if(!Character.isAlphabetic(charArr[lt])){
                lt++;
            } else if (!Character.isAlphabetic(charArr[rt])) {
                rt--;
            }
            else{
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();

        System.out.println(solution(alphabet));
    }

}
