package eecote.greedy;

import java.util.*;

public class 일이_될_때까지_2 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int answer = 0;

        while(N != 1){
            if(N % K ==0) {
                N /= K;
            }else{
                N -= 1;
            }
            answer ++;
        }

        System.out.print(answer);
    }

}
