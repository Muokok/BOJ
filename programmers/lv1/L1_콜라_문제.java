package programmers.lv1;

public class L1_콜라_문제 {
    public int solution(int a, int b, int n) {
      int cnt = 0;

      while(n >= a){
        cnt += (n/a) * b;
        n = (n/a) * b + (n%a);
        //System.out.println("n ->" + n);
        //System.out.println("cnt ->" + cnt);
      }
      return cnt;
    }
}
