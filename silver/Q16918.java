package silver;

import java.io.*;

public class Q16918 { // 봄버맨
    static char [][] graph;
    static int [][] visited;
    static int r;
    static int c;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void simulate() {
        char[][] temp = new char[r][c];

        // 모든 칸을 폭탄으로 채움
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[i][j] = 'O';
            }
        }

        // 폭탄 폭발
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (graph[i][j] == 'O') {
                    temp[i][j] = '.';
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < r && ny >= 0 && ny < c) {
                            temp[nx][ny] = '.';
                        }
                    }
                }
            }
        }

        // 결과 복사
        for (int i = 0; i < r; i++) {
            graph[i] = temp[i].clone();
        }
    }

    static void fillBombs() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                graph[i][j] = 'O';
            }
        }
    }

    static void printGraph() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sb.append(graph[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] RCN = br.readLine().split(" ");

        r = Integer.parseInt(RCN[0]);
        c = Integer.parseInt(RCN[1]);
        int n = Integer.parseInt(RCN[2]);

        graph = new char[r][c];

        // 초기 상태 입력
        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            graph[i] = line.toCharArray();
        }

        if (n <= 1) {
            printGraph();
            return;
        }

        if (n % 2 == 0) {
            fillBombs();
        } else {
            if (n % 4 == 3) {
                simulate();
            } else if (n % 4 == 1) {
                simulate();
                simulate();
            }
        }

        printGraph();
    }
}
