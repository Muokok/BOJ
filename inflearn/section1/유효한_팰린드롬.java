package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한_팰린드롬 {
    static StringBuilder sb = new StringBuilder();

    public static String solution(String str){

        char[] charArr = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(charArr[i])){
                sb.append(Character.toLowerCase(charArr[i]));// foundtimestudyydutsemitdnuof 가 들어감
            }
        }

        int lt=0, rt=sb.length()-1;
        while (lt < rt){
            if(sb.charAt(lt) != sb.charAt(rt)){
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
        System.out.println(solution(input));
    }

}
