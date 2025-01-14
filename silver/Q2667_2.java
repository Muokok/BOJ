package silver;

import java.io.*;
import java.util.*;

public class Q2667_2 {
    static int [][] graph;
    static boolean [][] visited;
    static int N;
    static int town = 0;
    static int homeCount ;
    static int [] dx = {0,1,0,-1};
    static int [] dy = {1,0,-1,0};

    static void dfs(int x, int y){
        if( x<0 || x>=N || y<0 || y>=N || graph[x][y] != 1 || visited[x][y]){
            return;
        }
        visited[x][y] = true;
        homeCount ++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            dfs(nx,ny);
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visited = new boolean[N][N];

        // 지도 입력 받기
        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<N; j++){
                graph[i][j] = input.charAt(j) - '0';
            }
        }

        // 단지 찾기
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                if(graph[x][y] == 1 && !visited[x][y]){
                    homeCount= 0;
                    dfs(x,y);
                    town++;
                    list.add(homeCount);
                }
            }
        }
        System.out.println(town);
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
