package eecote.greedy;

import java.io.*;

public class 거스름_돈 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int num500 = 0;
        int num100 = 0;
        int num50 = 0;
        int num10 = 0;

        num500 = N / 500;
        num100 = (N % 500) / 100;
        num50 = ((N % 500) % 100) / 50;
        num10 = ((((N % 500) % 100)) % 50) / 10;

        /*
        * 개선한 코드
        * int coinType = [500,100,50,10];
        * int cnt = 0;
        * for(int i=0; i<4; i++){
        *       cnt += n/coinType[i];
        *       n %= coinType[i];
        * }
        * bw.write(cnt);
        *
        * */

        bw.write(num500 + num100 + num50 + num10 +"" );
        bw.flush();
        bw.close();
        br.close();

    }
}
