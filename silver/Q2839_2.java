package silver;

import java.util.*;

public class Q2839_2 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(greedy(N));
        System.out.print(dp(N));
    }

    public static int greedy(int N) {
        int result = 0;

        while (N >= 0) {
            if (N % 5 == 0) {  // 5로 나누어 떨어지는 경우
                result += N / 5;
                return result;
            }

            N -= 3;  // 3kg을 빼고
            result++;  // 봉지 수 증가
        }

        return -1;  // 정확하게 N킬로그램을 만들 수 없는 경우
    }

    public static int dp(int N){
        int[] dpArr = new int[N + 1];
        Arrays.fill(dpArr, 5001); // 최대값으로 초기화 (N은 5000 이하)

        // 기본 케이스
        dpArr[0] = 0;
        if (N >= 3) dpArr[3] = 1;
        if (N >= 5) dpArr[5] = 1;

        // 동적 프로그래밍
        for (int i = 6; i <= N; i++) {  
            dpArr[i] = Math.min(dpArr[i-3] + 1, dpArr[i-5] + 1);
        }
        /*  아래 예시 설명 참고
        *   i = 6일 때:
            - dp[6] = min(dp[3] + 1, dp[1] + 1)
            - dp[6] = min(1 + 1, 5001 + 1) = 2

            i = 8일 때:
            - dp[8] = min(dp[5] + 1, dp[3] + 1)
            - dp[8] = min(1 + 1, 1 + 1) = 2

            i = 10일 때:
            - dp[10] = min(dp[7] + 1, dp[5] + 1)
            - dp[10] = min(3 + 1, 1 + 1) = 2

            i = 15일 때:
            - dp[15] = min(dp[12] + 1, dp[10] + 1)
            - dp[15] = min(4 + 1, 2 + 1) = 3

            i = 18일 때:
            - dp[18] = min(dp[15] + 1, dp[13] + 1)
            - dp[18] = min(3 + 1, 3 + 1) = 4
        *
        * */

        return dpArr[N] >= 5001 ? -1 : dpArr[N];
    }

}
