package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만_추출 {

    static StringBuilder sb = new StringBuilder();

    public static int solution(String str){
        for (char c : str.toCharArray()){
            if(!Character.isAlphabetic(c)){
                sb.append(c);
            }
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(solution(input));
    }

}
