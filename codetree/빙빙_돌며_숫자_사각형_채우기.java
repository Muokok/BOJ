package codetree;
import java.util.Scanner;

public class 빙빙_돌며_숫자_사각형_채우기 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      int [][] map = new int [n][m];

      int x = 0, y =0;
      int [] dx = {0,1,0,-1};
      int [] dy = {1,0,-1,0};
      int dirIdx = 0;
      int now = 2;

      map[x][y] = 1;

      for(int i=1; i< n*m; i++){
        int nx = x + dx[dirIdx];
        int ny = y + dy[dirIdx];

        //System.out.println(nx + " " + ny);

        if(nx < 0 || ny < 0 || nx >= n || ny >=m || map[nx][ny] != 0){
          dirIdx = (dirIdx+1) % 4;
          map[x + dx[dirIdx]][y + dy[dirIdx]] = now++;
          x = x + dx[dirIdx];
          y = y + dy[dirIdx];

        }else{
          map[nx][ny] = now++;
          x = nx;
          y = ny;
        }
      }

      for(int i=0; i<n; i++){
        for(int j=0; j<m;  j++){
          System.out.print(map[i][j] + " ");
        }
        System.out.println();
      }

    }

}
