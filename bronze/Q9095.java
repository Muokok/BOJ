package bronze;

import java.io.*;

public class Q9095 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        // 4 -> 3,2,1 이 되는 경우의 수 + 1

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(solution(n));
        }
    }

    static int solution(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;

        int[] dp = new int[n + 1];
        dp[1] = 1;  // 1
        dp[2] = 2;  // 1+1, 2
        dp[3] = 4;  // 1+1+1, 1+2, 2+1, 3

        for(int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
}
