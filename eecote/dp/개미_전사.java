package eecote.dp;

import java.io.*;

public class 개미_전사 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] d = new int[100];

        int N = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        int [] wareHouse = new int [N];

        // 창고 입력
        for(int i=0; i<N; i++){
            wareHouse[i] = Integer.parseInt(input[i]);
        }

        //DP
        d[0] = wareHouse[0];
        d[1] = Math.max(wareHouse[0], wareHouse[1]);

        for(int i=2; i<N; i++){
            d[i] = Math.max(d[i-1], d[i-2] + wareHouse[i]);
        }

        System.out.print(d[N-1]);
    }
}
