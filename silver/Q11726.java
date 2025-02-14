package silver;

import java.util.*;

public class Q11726 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(solution(n));
    }

    public static int solution(int n){

//         1 -> 1
//         2 -> 2
//         3 -> 111, 12, 21 -> 3
//         4 -> 1111, 112, 121, 211, 22 -> 5
//         5 -> 11111, 1112, 1121, 1211, 2111, 221, 212, 122 -> 8
//         6 -> 111111, 11112, 11121, 11211, 12111, 21111, 1122, 1212, 2112, 2121, 2211, 222
//         ㄴ> 이게 처음 풀 때 개수 12개였음, 1 -> 2 -> 3 -> 5 -> 8 -> 12  8에서 12로 넘어가는 것에서 규칙이 깨져서 dp[i-2] + dp[i-1]이 아닌줄??
//         근데 n = 6일 때의 개수가 13이었던 것임;; 결국 dp[i-2] + dp[i-1] 이 맞았다. (마지막에 10007로 mod연산해줘야 함)
//         이 블로그(https://velog.io/@j3beom/%EB%B0%B1%EC%A4%80-11726%EB%B2%88-2xn-%ED%83%80%EC%9D%BC%EB%A7%81-Python-DP)
//         에서 n = 6일 때의 예시들을 적어줘서 알게 됨
//         정상적인 개수 n = 6 -> 111111, 11112, 11121, 11211, 12111, 21111, 1122, 1221, 2211, 1212, 2121, 2112, 222 -> 13

        // n은 1과 2로 나타낼 수 있는 모든 수의 순열임
        // 마지막에 10007로 나눈 나머지를 출력해야 함

        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        if(n == 3){
            return 3;
        }

        int [] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i=4; i<= n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        return dp[n];
    }
}
