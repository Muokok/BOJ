package eecote.dp;

import java.util.*;

public class 하나로_만들기 { // 1로 만들기

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] d = new int [30001];

        int n = sc.nextInt();

        // 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
        for (int i = 2; i <= n; i++) {
            // 현재의 수에서 1을 빼는 경우
            d[i] = d[i - 1] + 1;
            // 현재의 수가 2로 나누어 떨어지는 경우
            if (i % 2 == 0)
                d[i] = Math.min(d[i], d[i / 2] + 1);
            // 현재의 수가 3으로 나누어 떨어지는 경우
            if (i % 3 == 0)
                d[i] = Math.min(d[i], d[i / 3] + 1);
            // 현재의 수가 5로 나누어 떨어지는 경우
            if (i % 5 == 0)
                d[i] = Math.min(d[i], d[i / 5] + 1);
        }

        System.out.print(d[n]);
    }
}
