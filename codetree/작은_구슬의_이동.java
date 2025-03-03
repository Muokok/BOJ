package codetree;
import java.util.Scanner;

public class 작은_구슬의_이동 {
  static int N;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int T = sc.nextInt();
    int R = sc.nextInt();
    int C = sc.nextInt();
    String D = sc.next();

    int [] dx = {1,0,-1,0};
    int [] dy = {0,1,0,-1};
    int dirIdx = 0;

    int [][] map = new int [N+1][N+1];
    if(D.equals("L")){
      dirIdx = 3;
    }else if(D.equals("R")){
      dirIdx = 1;
    }else if(D.equals("U")){
      dirIdx = 2;
    }else if(D.equals("D")){
      dirIdx = 0;
    }

    for(int i=0; i<T; i++){
      int nx = R + dx[dirIdx];
      int ny = C + dy[dirIdx];

      //System.out.println("nx ->" + nx);
      //System.out.println("ny ->" + ny);
      if(!inRange(nx,ny)){
        dirIdx = (dirIdx-2 + 4) % 4;
        continue;
      }

      R = nx;
      C = ny;
      //System.out.println("R ->" + R);
      //System.out.println("C ->" + C);
    }
    System.out.print(R + " " + C);
  }

  private static boolean inRange(int x, int y){
    if(x <=0 || y <=0 || x >N || y >N){
      return false;
    }
    return true;
  }
}
