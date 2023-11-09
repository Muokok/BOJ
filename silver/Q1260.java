package silver;

import java.util.*;
import java.io.*;

public class Q1260 {
    static int Edge_arr[][]; // 간선 체크 배열, 즉 노드 간 연결이 되어 있는지 체크
    static boolean Node_arr[]; // 노드 체크 배열
    static int N;
    static int M;
    static int V;
    static int count;
    static Queue<Integer> que = new LinkedList<>();

    public static void BFS(int start) {
        que.offer(start);
        Node_arr[start] = true;
        System.out.print(start + " "); // BFS 결과 출력

        while( !que.isEmpty() ) {
            start = que.poll();

            for(int i=1; i<=N; i++) {

                if(Edge_arr[start][i] == 1 && Node_arr[i] == false) {
                    que.offer(i);
                    Node_arr[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void DFS(int start) {
        Node_arr[start] = true; // start 노드를 방문
        System.out.print(start + " "); // DFS 결과 한개씩 출력

        if(count == N) {
            return;
        }
        count ++;

        for(int i=1; i<=N; i++) {
            if(Edge_arr[start][i] == 1 && Node_arr[i] == false) {
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        Edge_arr = new int[1001][1001];
        Node_arr = new boolean[1001];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Edge_arr[x][y] = Edge_arr[y][x] = 1; // 노드 간 연결되어 있으면 1
        }

        DFS(V);
        System.out.println();

        Node_arr = new boolean[1001];
        BFS(V);

    }
}