package silver;

import java.io.*;

public class Q11053 {

    /* 잘못된 코드*/
    // 연속적으로 증가되는 경우만 체크함
//    public static void main(String [] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        int [] arr = new int[N];
//
//        String [] input = br.readLine().split(" ");
//
//        for(int i=0; i<N; i++){
//            arr[i] = Integer.parseInt(input[i]);
//        }
//
//        int answer = 0;
//
//        for(int i=0; i<N; i++){
//            int cnt = 0;
//            int max = arr[i];
//
//            for(int j=i; j<N; j++){
//                if(arr[j] > max){
//                    max = arr[j];
//                    cnt ++;
//                }
//            }
//            if(answer < cnt){
//                answer = cnt;
//            }
//
//        }
//
//        /*  반례
//        *   6
//            20 10 20 30 10 15
//        * */
//        System.out.println(answer);
//    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];  // dp 배열 추가

        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
            dp[i] = 1;  // 최소 길이는 1
        }

        int answer = 1;  // 최소값은 1

        // 10 20 10 30 20 50
        for(int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(answer, dp[i]);
        }

        System.out.print(answer);
    }

}
