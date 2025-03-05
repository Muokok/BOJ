package codetree;
import java.util.Scanner;

public class 격자_위의_편안한_상태 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      int [][] map = new int[n+1][n+1];
      int [] dx = {-1,0,0,1};
      int [] dy = {0,1,-1,0};

      for(int i=0; i<m ; i++){
        int x = sc.nextInt();
        int y = sc.nextInt();

        map[x][y] = 1;

        int cnt = 0;
        for(int j=0; j<4; j++){
          int nx = x + dx[j];
          int ny = y + dy[j];
          if(nx >=0 && ny >=0 && nx <=n && ny <=n && map[nx][ny] == 1){
            cnt ++;
          }
        }

        System.out.println(cnt == 3 ? 1 : 0);
      }
    }

}
