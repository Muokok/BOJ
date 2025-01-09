package eecote.dfs;

import java.io.*;

public class 음료수_얼려먹기 {
    static int N,M;
    static int [][] frame = new int[1000][1000];

    static boolean dfs(int x, int y){
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >=N || y <= -1 || y >= M) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (frame[x][y] == 0) {
            // 해당 노드 방문 처리
            frame[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] NM = br.readLine().split(" ");

        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);

        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<M; j++){
                frame[i][j] = input.charAt(j) - '0';
            }
        }

        int result = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(dfs(i,j)){
                    result ++;
                }
            }
        }
        System.out.print(result);
    }
}
