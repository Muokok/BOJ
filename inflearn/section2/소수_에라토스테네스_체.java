package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_에라토스테네스_체 {

    public static int solution(int N){

        int answer =0;
        int[] ch = new int[N+1];
        for(int i=2; i<=N; i++){
            if(ch[i]==0){
                answer++;
                for (int j=i; j<=N; j=j+i) ch[j]=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }

}
