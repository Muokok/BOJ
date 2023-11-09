package silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Q2667 {

    static int arr[][];
    static boolean visit[][];// boolean형 배열을 처음에 만들면 모두 false값으로 초기화 되어있다
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int count = 0, number = 0;
    static int nowX, nowY, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>(); // 각 단지의 집의 숫자를 저장하기 위함

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visit = new boolean[N][N];

        for(int i=0; i<N; i++) { // 입력받은 수를 배열로 생성
            String str = br.readLine();

            for(int j=0; j<N; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {

                if(visit[i][j] == false && arr[i][j] == 1) {
                    count = 0;
                    number++;
                    DFS(i, j);
                    list.add(count);
                }

            }
        }

        Collections.sort(list);
        bw.append(number + "\n");
        for(int num : list) {
            bw.append(num + "\n");
        }

        bw.flush();
        bw.close();
    }

    static void DFS(int x, int y) {
        visit[x][y] = true;
        arr[x][y] = number;
        count ++;

        for(int i=0; i<4; i++) {// for문을 돌면서 상 > 하 > 좌 > 우 순으로 주변 탐색
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(Range_check() && visit[nowX][nowY] == false && arr[nowX][nowY] == 1) {
                visit[nowX][nowY] = true;
                arr[nowX][nowY] = number;

                DFS(nowX, nowY);
            }
        }
    }
    static boolean Range_check() { // 단지의 범위를 체크하는 메소드
        return (nowX >= 0 && nowX < N && nowY >= 0 && nowY < N);
    }
}