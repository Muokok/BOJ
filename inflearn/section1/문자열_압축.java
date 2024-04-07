package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_압축 {

    static StringBuilder sb = new StringBuilder();

    public static String solution(String str){
        int num = 1;

        for (int i=0; i<str.length()-1; i++){
               if(str.charAt(i) == str.charAt(i+1) ){
                   num++;
               }
               else {
                   sb.append(str.charAt(i));
                   if(num >1){
                       sb.append(num);
                   }
                   num =1;
               }
           }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(solution(input+ " "));
    }
}
