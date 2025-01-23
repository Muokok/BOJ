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

/*
        * 1. 그래프 표현 방식

        실패 코드
        2차원 배열(인접 행렬)을 사용하여 그래프를 표현
        graph[N+1][N+1] 크기의 배열에서 연결된 노드는 1로 표시
        메모리 사용량이 O(N^2)로 비효율적

        정답 코드
        ArrayList 배열(인접 리스트)을 사용하여 그래프를 표현
        각 노드마다 연결된 노드들만 저장
        메모리 사용량이 O(E) 로 효율적 (E는 간선의 수)

        2. 방문 체크 방식
        실패 코드
        boolean 배열로 방문 여부만 체크
        별도의 result 배열에 부모 노드 정보 저장

        정답 코드
        int 배열 하나로 방문 체크와 부모 노드 정보를 동시에 관리
        방문하지 않은 노드는 0, 방문한 노드는 부모 노드 번호로 표시

        3. DFS 구현 방식
        실패 코드
        모든 노드를 순회하며 연결 여부 확인
        시간 복잡도가 O(N^2)

        정답 코드
        실제로 연결된 노드만 순회
        시간 복잡도가 O(N+E) 로 더 효율적

        4. 메모리 및 성능
        정답 코드가 실패 코드보다 다음과 같은 이점이 있습니다:
        메모리 사용량이 더 적음
        실행 속도가 더 빠름
        실제 연결된 노드만 처리하므로 효율적

* */

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
