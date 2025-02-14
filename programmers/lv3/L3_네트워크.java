package programmers.lv3;

public class L3_네트워크 {

    static boolean [] visited;
    static int answer = 0;

    public static void dfs(int n, int current, int[][] computers){
        visited[current] = true;

        for(int i = 0; i < n; i++) {
            if(!visited[i] && computers[current][i] == 1) {
                dfs(n, i, computers);
            }
        }
    }

    public int solution(int n, int[][] computers) {
        visited = new boolean [n];

        for(int i=0; i<n; i++){
            if(!visited[i]) {
                dfs(n, i, computers);
                answer++;
            }
        }

        return answer;
    }
}
