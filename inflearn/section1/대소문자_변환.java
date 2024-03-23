package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자_변환 {

    static StringBuilder sb = new StringBuilder();

    public static void solution(String st){
        for (int i=0; i<st.length(); i++){
            if(Character.isUpperCase(st.charAt(i))){
                sb.insert(i,Character.toLowerCase(st.charAt(i)));
            }
            else {
                sb.insert(i,Character.toUpperCase(st.charAt(i)));
            }
        }
    }

    public static void solution2(String st){
        for (char c: st.toCharArray()){
            if(c>=65 && c<= 90){
                sb.append((char)(c+32));
            }
            else if(c>=97 && c<= 122){
                sb.append((char)(c-32));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        solution2(st);

        System.out.println(sb);
    }
}