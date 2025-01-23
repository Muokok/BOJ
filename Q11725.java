import java.io.*;
import java.util.*;

public class Q11725 {
    static ArrayList<Integer>[] graph;
    static int [] visited;
    static int N;

    static void dfs(int node){

        for(int i=0; i< graph[node].size(); i++){
            int next = graph[node].get(i);
            if(visited[next] == 0){
                visited[next] = node;
                dfs(next);
            }
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<Integer>();
        }

        visited = new int[N+1];

        // 노드 입력받기
        for(int i=1; i<N; i++){
            String [] input = br.readLine().split(" ");

            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            graph[x].add(y);
            graph[y].add(x);
        }

//        for(int i=1; i<=N; i++){
//            for(int num : graph[i]){
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }


        dfs(1);

        System.out.print(visited[2]);
        for(int i=3; i<visited.length; i++){
            System.out.print("\n" + visited[i]);
        }
    }
}
