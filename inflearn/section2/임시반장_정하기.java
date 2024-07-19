package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 임시반장_정하기 {

    public static int solution(int N, int[][] numberList){

        int answer = 0;
        int max = 0;

        for (int i = 0; i < N; i ++){
            int cnt = 0;
            for (int j = 0; j < N; j ++){
                for (int k = 0; k < 5; k ++){
                    if (numberList[i][k] == numberList[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max){
                max = cnt;
                answer = i + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [][] numberList = new int[N][5];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String[] numberStrings = input.split(" ");

            for (int j = 0; j < 5; j++){
                numberList[i][j] = Integer.parseInt(numberStrings[j]); // 입력부분은 잘 됨.
            }
        }

        System.out.print(solution(N, numberList));
    }

}
