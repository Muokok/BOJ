package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1914 {
    static StringBuilder sb = new StringBuilder("");
    static void hanoi(int n, int start, int end){
        if (n == 0)
            return;
        hanoi(n-1, start, 6 - start - end);
        // 중간 장대를 파라미터로 넣어도 되지만 장대가 총 3개이므로,
        // 출발 장대와 목적 장대가 있으면 중간 장대는 6 - 출발 장대 - 목표 장대로 구할 수 있다.
        // (ex) 출발 장대: 1, 목표 장대 :3 , 중간장대 : 6-1-3= 2)

        sb.append(start);
        sb.append(" ");
        sb.append(end);
        sb.append("\n");
        hanoi(n-1, 6 - start - end, end);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        BigInteger num = new BigInteger("2");

        sb.append(num.pow(N).subtract(new BigInteger("1")));
        //num.pow(N)에서 1을 뺀다. 근데 이게 왜 있는거임? >>하노이탑을
        // 이동시키는 최소 이동 횟수

        if (N <= 20){
            sb.append("\n");
            hanoi(N,1,3);
        }

        System.out.println(sb);
    }
}