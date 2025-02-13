package bronze;

import java.io.*;

public class Q2748 {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.print(solution(N));

    }

    public static Long solution(int N){
        if(N == 0){
            return 0L;
        }else if(N == 1){
            return 1L;
        }else if(N == 2){
            return 1L;
        }

        Long [] dp = new Long [N+1];

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;

        for(int i=3; i<=N; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[N];
    }
}
