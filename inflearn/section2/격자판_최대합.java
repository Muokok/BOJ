package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 격자판_최대합 {

    public static int solution(int N, int [][] arr){
        int answer = 0;
        int sum1, sum2; // 행,열,대각선의 합을 담을 변수

        for (int i = 0; i < N; i++){ // 행, 열의 합들
            sum1 = sum2 = 0;
            for (int j = 0; j < N; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < N; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][N-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [][] numberList = new int[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String[] numberStrings = input.split(" ");

            for (int j = 0; j < N; j++){
                numberList[i][j] = Integer.parseInt(numberStrings[j]);
            }
        }

        System.out.print(solution(N, numberList));
    }

}
