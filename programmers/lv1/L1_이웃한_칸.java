package programmers.lv1;

public class L1_이웃한_칸 {

    class Solution {
        public int solution(String[][] board, int h, int w) {
            int [] dh = {1,0,-1,0};
            int [] dw = {0,1,0,-1};

            int answer = 0;

            for(int i=0; i<4; i++){
                int nh = h + dh[i];
                int nw = w + dw[i];

                if(nh >= 0 && nw >=0 && nh < board.length && nw < board.length){
                    if(board[h][w].equals(board[nh][nw])){
                        answer ++;
                    }
                }
            }



            return answer;
        }
    }
}
