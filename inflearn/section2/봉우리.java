package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 봉우리 {
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,1,0,-1};

    public static int solution(int N, int [][] numList) {
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean flag = true;

                for (int k = 0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && numList[nx][ny] >= numList[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

        public static void main (String[]args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            int[][] numberList = new int[N][N];

            for (int i = 0; i < N; i++) {
                String input = br.readLine();
                String[] numberStrings = input.split(" ");

                for (int j = 0; j < N; j++) {
                    numberList[i][j] = Integer.parseInt(numberStrings[j]);
                }
            }
            System.out.print(solution(N, numberList));
        }
}

