import java.io.*;
import java.util.*;

/* 메모리 초과났던 코드*/
//public class Main {
//    static int [][] graph;
//    static boolean [] visited;
//    static int [] result;
//    static int N;
//
//    static void dfs(int node){
//        visited[node] = true;
//
//        for(int i=1; i<=N; i++){
//            if(graph[node][i] == 1 && !visited[i]){
//                result[i] = node;
//                dfs(i);
//            }
//        }
//
//    }
//
//    public static void main(String [] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        N = Integer.parseInt(br.readLine());
//        graph = new int[N+1][N+1];
//        visited = new boolean[N+1];
//        result = new int[N+1];
//
//        // 노드 입력받기
//        for(int i=1; i<N; i++){
//            String [] input = br.readLine().split(" ");
//
//            int x = Integer.parseInt(input[0]);
//            int y = Integer.parseInt(input[1]);
//
//            graph[x][y] = graph[y][x] = 1;
//        }
//
//        dfs(1);
//
//        System.out.print(result[2]);
//        for(int i=3; i<result.length; i++){
//            System.out.print("\n" + result[i]);
//        }
//    }
//}

/* 정답 코드*/
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
