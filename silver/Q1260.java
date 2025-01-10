package silver;

import java.util.*;
import java.io.*;

public class Q1260 {
    static int [][] graph = new int[1001][1001];
    static boolean [] visited;
    static int n;
    static int m;

    static void dfs(boolean [] visited, int v){
        visited[v] = true;
        System.out.print(v + " ");

        for(int i=1; i<=n; i++){ // 여기는 어디까지 돌아야 하는지?????
            if(graph[v][i] == 1 && !visited[i]){
                dfs(visited, i);
            }
        }
    }

    static void bfs(boolean [] visited, int v){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;

        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x + " ");

            for(int i=1; i<=n; i++){
                if(graph[x][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] NMV = br.readLine().split(" ");

        n = Integer.parseInt(NMV[0]);
        m = Integer.parseInt(NMV[1]);
        int v = Integer.parseInt(NMV[2]);


        visited = new boolean[n+1];

        for(int i=0; i<m; i++){
            String [] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(visited, v);
        System.out.println();

        visited = new boolean[n+1];
        bfs(visited, v);
    }
}