package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자찾기 {

    public int solution(String st, String target){
        int count = 0;

        /*for(int i=0; i<st.length(); i++){

            if(target.charAt(0) == st.charAt(i)){
                count++;
            }
        }*/

        for(char x: st.toCharArray()){ // String의 문자 하나씩 분리시켜 문자 배열을 생성해주는 메소드
            if(x == target.charAt(0)) count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        문자찾기 M = new 문자찾기();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String st = br.readLine().toLowerCase();
        String target = br.readLine().toLowerCase() ;


        sb.append(M.solution(st,target));
        System.out.println(M.solution(st,target));
    }

}
