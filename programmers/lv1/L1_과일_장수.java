package programmers.lv1;
import java.util.*;

public class L1_과일_장수 {

    public int solution(int k, int m, int[] score) {

        // k는 최상품 사과의 점수
        // m은 한 상자에 사과의 개수
        // 이익이 발생하지 않는 경우 0 리턴 -> ???
        // 1. score 정렬
        // 2. stack에 push
        // 3. 비었는지를 체크하며 m개씩 pop하여 그 중 최솟값 찾기
        // 4. 최솟값 x m 을 result에 더한다

        Stack<Integer> stack = new Stack<>();
        Arrays.sort(score);
        for(int i=0; i<score.length; i++){
            stack.push(score[i]);
        }

        int result = 0;

        outerLoop:
        while(!stack.isEmpty()){
            int min = 10;
            for(int i=0; i<m; i++){
                if(stack.isEmpty()) break outerLoop;

                int current = stack.pop();
                if(min > current){
                    min = current;
                }
            }
            result += min*m;
        }

        return result;
    }

    /*위 코드 아래처럼 개선 가능*/
    public int solution2(int k, int m, int[] score) {
        int result = 0;
        Arrays.sort(score);
        // length = 12
        // m = 3
        // [1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4]
        //  0  1  2  3  4  5  6  7  8  9  10 11
        //           m
        for(int i=score.length; i>=m; i -=m){

            result += score[i-m]*m;
        }

        return result;

    }
}
