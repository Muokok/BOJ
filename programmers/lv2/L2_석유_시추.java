package programmers.lv2;
import java.util.*;

public class L2_석유_시추 {

    // 방문 여부를 체크하는 2차원 배열
    static boolean[][] visited;
    // 상하좌우 이동을 위한 방향 배열 (시계방향)
    static int[] dx = {-1,0,1,0};  // x축 이동
    static int[] dy = {0,-1,0,1};  // y축 이동
    // 땅의 크기를 저장할 변수 (n: 세로, m: 가로)
    static int n, m;

    public int solution(int[][] land) {
        // 입력받은 땅의 크기 저장
        n = land.length;        // 세로 길이
        m = land[0].length;     // 가로 길이
        // 방문 배열 초기화
        visited = new boolean[n][m];
        // 각 열별 석유량을 저장할 배열
        int[] oilByColumn = new int[m];

        // 모든 땅을 탐색
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                // 석유가 있고(1) 아직 방문하지 않은 곳이라면
                if(land[i][j] == 1 && !visited[i][j]) {
                    // 현재 석유 덩어리가 있는 열들을 저장할 리스트
                    List<Integer> columns = new ArrayList<>();
                    // DFS로 연결된 석유 덩어리의 크기를 구하고
                    int size = dfs(land, i, j, columns);
                    // 이 덩어리가 걸쳐있는 모든 열에 크기를 더함
                    for(int col : columns) {
                        oilByColumn[col] += size;
                    }
                }
            }
        }

        // 모든 열 중 가장 큰 석유량을 반환
        return Arrays.stream(oilByColumn).max().getAsInt();
    }

    // DFS로 연결된 석유 덩어리의 크기를 구하는 메서드
    private int dfs(int[][] land, int x, int y, List<Integer> columns) {
        // 현재 위치 방문 처리
        visited[x][y] = true;
        // 현재 열이 리스트에 없다면 추가
        if(!columns.contains(y)) columns.add(y);

        // 현재 위치의 크기 1로 시작
        int size = 1;
        // 4방향 탐색
        for(int i=0; i<4; i++) {
            // 다음 위치 계산
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 다음 위치가 유효한지 확인
            // 1. 배열 범위 내인지
            // 2. 석유가 있는지
            // 3. 아직 방문하지 않았는지
            if(nx >= 0 && ny >= 0 && nx < n && ny < m
                    && land[nx][ny] == 1 && !visited[nx][ny]) {
                // 연결된 석유 덩어리의 크기를 현재 크기에 더함
                size += dfs(land, nx, ny, columns);
            }
        }
        // 전체 덩어리의 크기 반환
        return size;
    }


    /*위 코드 1개의 테스트에서 런타임 에러가 발생하므로 BFS로 수정*/
    public int solution2(int[][] land) {
        // 입력받은 땅의 크기 저장
        n = land.length;        // 세로 길이
        m = land[0].length;     // 가로 길이
        // 방문 배열 초기화
        visited = new boolean[n][m];
        // 각 열별 석유량을 저장할 배열
        int[] oilByColumn = new int[m];

        // 모든 땅을 탐색
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                // 석유가 있고(1) 아직 방문하지 않은 곳이라면
                if(land[i][j] == 1 && !visited[i][j]) {
                    // 현재 석유 덩어리가 있는 열들을 저장할 리스트
                    List<Integer> columns = new ArrayList<>();
                    // DFS로 연결된 석유 덩어리의 크기를 구하고
                    int size = bfs(land, i, j, columns);
                    // 이 덩어리가 걸쳐있는 모든 열에 크기를 더함
                    for(int col : columns) {
                        oilByColumn[col] += size;
                    }
                }
            }
        }

        // 모든 열 중 가장 큰 석유량을 반환
        return Arrays.stream(oilByColumn).max().getAsInt();
    }

    // DFS로 연결된 석유 덩어리의 크기를 구하는 메서드
    private int bfs(int[][] land, int x, int y, List<Integer> columns) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        if(!columns.contains(y)) columns.add(y);

        int size = 1;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();

            for(int i=0; i<4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < n && ny < m
                        && land[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    if(!columns.contains(ny)) columns.add(ny);
                    size++;
                }
            }
        }
        return size;
    }
}
