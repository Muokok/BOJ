package eecote.greedy;

import java.util.*;

public class 곱하기_혹은_더하기_2 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        // 첫 번째 숫자로 초기화
        long result = S.charAt(0) - '0';

        for(int i=1; i<S.length(); i ++){
            int num = S.charAt(i) - '0';

            if(result <=1 || num <= 1){
                result += num;
            }else{
                result *= num;
            }
        }

        System.out.print(result);

    }


}
