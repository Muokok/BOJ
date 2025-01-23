package silver;

import java.io.*;
import java.util.*;

public class Q24479 {
    static ArrayList<Integer>[] graph;
    static int [] visited;
    static int order = 1;

    public static void dfs(int node){
        visited[node] = order++;

        for(int next : graph[node]){
            if(visited[next] == 0){
                dfs(next);
            }
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] nmr = br.readLine().split(" ");

        int n = Integer.parseInt(nmr[0]);
        int m = Integer.parseInt(nmr[1]);
        int r = Integer.parseInt(nmr[2]);

        graph = new ArrayList[n + 1];
        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        visited = new int [n+1];

        for(int i=0; i<m; i++){
            String [] input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);

            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i=1; i<=n; i++){
            Collections.sort(graph[i]);
        }

        dfs(r);

        System.out.print(visited[1]);
        for(int i=2; i<n+1; i++){
            System.out.print("\n" + visited[i]);
        }

    }

}
