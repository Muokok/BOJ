package eecote.Implementation;

import java.util.*;

public class 시각 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;

        // 시간에 3이 안들어갈 때 미리 계산해둠
        int cnt = 15*60*2 -15*15;
        /**
         * 초만: 3, 13,23,30~39,43,53 -> 15개 * 60개(분)
         * 분만: 15개*60개(초)
         * 초 + 분만: 15개*15개
         * */

        for(int i=0; i<=N; i++){
            // 시간에 3이 들어갈 때
            if(i == 3 || i == 13 || i == 23) {
                answer += 60*60;

            }else{ // 시간에 3이 안들어갈 때
                answer += cnt;
            }
        }

        System.out.print(answer);
    }
}
