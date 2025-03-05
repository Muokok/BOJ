package codetree;
import java.util.Scanner;

public class 빙빙_돌며_숫자_사각형_채우기2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int [][] map = new int [n][m];

      int x = 0;
      int y = 0;

      map[x][y] = 1;
      int [] dx = {1,0,-1,0};
      int [] dy = {0,1,0,-1};
      int dirIdx = 0;

      int cnt = 1;
      for(int i=1; i<n*m; i++){
        int nx = x + dx[dirIdx];
        int ny = y + dy[dirIdx];

        if(nx < 0 || ny < 0 || nx >=n || ny >=m || map[nx][ny] != 0){
          dirIdx = (dirIdx+1) % 4;
        }
        x = x + dx[dirIdx];
        y = y + dy[dirIdx];

        cnt ++;
        map[x][y] = cnt;
      }

      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          System.out.print(map[i][j] + " ");
        }
        System.out.println();
      }


    }

}
