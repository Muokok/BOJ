package programmers;

public class L1_나머지가_1이_되는_수_찾기 {
    public int solution(int n) {
        int x = 1;

        while(true){
            if(n % x == 1){
                return x;
            }
            x ++;
        }
    }
}
