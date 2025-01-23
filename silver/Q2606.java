package silver;

import java.util.*;

public class Q2606 { // 바이러스
    static ArrayList<Integer>[] graph;
    static boolean [] visited;
    static int cnt = 0;

    static void dfs(int node){
        visited[node] = true;

        for(int next : graph[node]){
            if(!visited[next]){
                cnt++;
                dfs(next);
            }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        graph = new ArrayList [n+1];
        for(int i=1; i<= n; i++){
            graph[i] = new ArrayList<Integer>();
        }

        visited = new boolean[n+1];

        int networks = sc.nextInt();
        for(int i=0; i<networks; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(1);

        System.out.print(cnt);
    }
}
