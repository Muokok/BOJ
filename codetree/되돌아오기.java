package codetree;
import java.util.Scanner;

public class 되돌아오기 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] dx = {-1,0,0,1};
      int [] dy = {0,-1,1,0};

      int nowX = 0, nowY = 0;
      int time = 0;

      outer:
      for(int i = 0; i < n; i++){
        char dir = sc.next().charAt(0);
        int dist = sc.nextInt();

        // for문 돌면서 dir 방향으로 dist만큼 움직임
        for(int j=0; j<dist; j++){
          if(dir == 'W'){
            nowX += dx[0];
            nowY += dy[0];
          }else if(dir == 'S'){
            nowX += dx[1];
            nowY += dy[1];
          }else if(dir == 'N'){
            nowX += dx[2];
            nowY += dy[2];
          }else if(dir == 'E'){
            nowX += dx[3];
            nowY += dy[3];
          }

          // 움직이면서 time ++
          time ++;
          if(nowX == 0 && nowY == 0){
            break outer;
          }
        }
      }

      // 시작점 != 최종 위치라면 -1 출력
      if(nowX != 0 || nowY != 0) time = -1;

      System.out.print(time);

    }

}
