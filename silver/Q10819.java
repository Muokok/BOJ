package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10819 {
    public static int n;
    public static int[] arr;
    public static int[] answer;
    public static boolean[] visit;
    public static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        answer = new int[n];
        visit = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);

        sb.append(result);
        System.out.println(sb);
    }

    static void dfs(int count){ // n = 6
        if(count == n){
            int sum = 0;
            for(int i =0; i<n-1; i++){
                sum += Math.abs(answer[i]- answer[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }
        for(int i=0; i<n; i++){
            if(!visit[i]){
                visit[i] = true; // 방문 처리
                answer[count] =arr[i];
                dfs(count +1);
                visit[i] =false;
            }
        }
    }
}
