import java.io.*;
import java.util.*;

public class Q7576 {
    static int [][] graph;
    static boolean [][] visited;
    static int m;
    static int n;
    static int date = 0;
    static int [] dx = {0,1,0,-1};
    static int [] dy = {1,0,-1,0};

    static void simulation(int x, int y){
        if(x < 0 || x >= n || y < 0 || y >= m || visited[x][y] || graph[x][y] == -1){
            return;
        }
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            graph[nx][ny] = 1;
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<int[]> firstTomatoList = new ArrayList<>();

        String [] MN = br.readLine().split(" ");

        m = Integer.parseInt(MN[0]);
        n = Integer.parseInt(MN[1]);
        graph = new int [n][m];
        visited = new boolean [n][m];

        // 토마토 입력 받기
        for(int i=0; i<n; i++){
            String [] input = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                if(Integer.parseInt(input[j]) == 1) firstTomatoList.add(new int[] {i,j}); // 입력 받으면서 익은 토마토 위치 저장
                graph[i][j] = Integer.parseInt(input[j]);
            }
        }


        for(int i=0; i<firstTomatoList.size(); i++ ){
            System.out.print(firstTomatoList.get(i)[0]);
            System.out.println(firstTomatoList.get(i)[1]);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(graph[i][j]);
            }
        }

        //dfs(0,0);


    }
}
