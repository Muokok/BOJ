import java.io.*;
import java.util.*;

public class Q7576 { // 토마토
    static Queue<Point> q = new LinkedList<>();

    static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int bfs(int m, int n, int unripeTomatoes, int [][] box){
        if(unripeTomatoes == 0) return 0;
        int [] dx = {0,1,0,-1};
        int [] dy = {1,0,-1,0};
        int days = 0;

        while(!q.isEmpty() && unripeTomatoes > 0){
            int size = q.size();

            for(int i =0; i<size; i++){
                Point current = q.poll();

                for(int j=0; j<4; j++){
                    int nx = current.x + dx[j];
                    int ny = current.y + dy[j];

                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0){
                        box[nx][ny] = 1;
                        q.offer(new Point(nx,ny));
                        unripeTomatoes--;
                    }
                }
            }
            days ++;
        }
        return unripeTomatoes == 0 ? days : -1;
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] MN = br.readLine().split(" ");
        int m = Integer.parseInt(MN[0]);
        int n = Integer.parseInt(MN[1]);
        int [][] box = new int [n][m];
        int unripeTomatoes = 0;

        // 토마토 입력 받기
        for(int i=0; i<n; i++){
            String [] input = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                box[i][j] = Integer.parseInt(input[j]); // 여기 입력되는 부분이 이해가 안됐음
                
                if(Integer.parseInt(input[j]) == 1) {
                    q.offer(new Point(i,j)); // 입력 받으면서 익은 토마토 위치 큐에 삽입
                }else if(Integer.parseInt(input[j]) == 0){
                    unripeTomatoes ++;
                }
            }
        }
        System.out.print(bfs(m,n,unripeTomatoes, box));
    }
}
