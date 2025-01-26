package programmers;
import java.util.*;

public class L2_게입_맵_최단거리 {

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dist = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};

        q.offer(new int []{0,0});
        dist[0][0] = 1;

        while(!q.isEmpty()){
            int [] point = q.poll();
            int x = point[0];
            int y = point[1];

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >=0 && ny >=0 && nx <n && ny <m && maps[nx][ny] == 1 && dist[nx][ny] == 0){
                    dist[nx][ny] = dist[x][y] + 1;
                    q.offer(new int [] {nx,ny});
                }
            }
            if(x+1 == n && y+1 == m ) return dist[x][y];

        }
        return -1;
    }
}
