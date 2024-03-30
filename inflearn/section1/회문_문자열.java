package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문_문자열 {

    public static String solution(String str){

        int lt=0, rt=str.length()-1;
        while (lt < rt){
            if(str.charAt(lt) != str.charAt(rt)){
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        System.out.println(solution(input.toLowerCase()));
    }

}
