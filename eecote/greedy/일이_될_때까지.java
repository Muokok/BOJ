package eecote.greedy;

import java.io.*;

public class 일이_될_때까지 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int cnt = 0;

        /*나의 코드*/
//        while(N != 1){
//            if(N % K == 0){
//                N = N / K;
//                cnt ++;
//            }else{
//                 N -= 1;
//                 cnt ++;
//            }
//        }
//        System.out.print(cnt);

        /*개선된 코드, 시간 복잡도 훨씬 유리*/
        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (N / K) * K; // N이 K로 나누어떨어지지 않을 때 K로 나누어떨어지는 수 중 N과 가장 가깝고 N보다 작은 수를 찾는 계산
                                        // Ex) N = 29, K = 5 일 때 target = 25
            cnt += (N - target);    // 반복문을 돌며 -1 연산을 안해도 됨
            N = target;

            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (N < K) break;

            // K로 나누기
            cnt += 1;
            N /= K;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        cnt += (N - 1);
        System.out.println(cnt);

    }
}
