package eecote.greedy;

import java.io.*;

public class 곱하기_혹은_더하기 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        // 첫 번째 문자를 숫자로 변경한 값을 대입
        long answer = input.charAt(0) - '0';

        /*수정된 코드*/
        for(int i=1; i<input.length(); i++){
            int num = input.charAt(i) - '0';

            // 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
            if (num <= 1 || answer <= 1) {
                answer += num;
            }
            else {
                answer *= num;
            }
        }
            /*잘못된 코드*/
//            if(input.charAt(j) =='0' || input.charAt(i) =='0'){
//                answer = answer + Character.getNumericValue(input.charAt(j))
//                        + Character.getNumericValue(input.charAt(i));
//            }else {
//                answer *= Character.getNumericValue(input.charAt(i));
//            }

        System.out.print(answer);


    }
}
