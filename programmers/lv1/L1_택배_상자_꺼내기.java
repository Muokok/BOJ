package programmers.lv1;

public class L1_택배_상자_꺼내기 {

    public int solution(int n, int w, int num) {
        // 창고를 2차원 배열로 표현
        int h = (n + w - 1) / w; // 층 수 계산
        int[][] warehouse = new int[h][w];

        boolean leftToRight = true; // 왼쪽에서 오른쪽으로 배치하는지 여부
        int boxNumber = 1; // 현재 배치할 상자 번호

        // 창고에 상자 배치
        for (int i = 0; i < warehouse.length; i++) {
            if (leftToRight) { // 왼쪽에서 오른쪽으로 배치
                for (int j = 0; j < w && boxNumber <= n; j++) {
                    warehouse[i][j] = boxNumber++;
                }
            } else { // 오른쪽에서 왼쪽으로 배치
                for (int j = w - 1; j >= 0 && boxNumber <= n; j--) {
                    warehouse[i][j] = boxNumber++;
                }
            }
            leftToRight = !leftToRight; // 방향 전환
        }

        // 꺼내려는 상자의 위치 찾기
        int targetRow = -1, targetCol = -1;
        outerLoop:
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < w; j++) {
                if (warehouse[i][j] == num) {
                    targetRow = i;
                    targetCol = j;
                    System.out.print("targetRow->" + targetRow);
                    System.out.print("targetCol->" + targetCol);
                    break outerLoop;
                }
            }
        }

        /**     위 코드를 아래처럼 개선할 수 있음.
         *         // 몇 번째 층에 위치하는지
         *         int layer = (num - 1) / w;
         *
         *         // 몇 번째 열(column)에 위치하는지 찾기
         *         int indexInLayer = (num - 1) % w; // 0-based index
         *
         *         // 열(column) 찾기 (층이 짝수면 왼 -> 오, 홀수면 오 -> 왼)
         *         int column;
         *         if (layer % 2 == 0) {
         *             column = indexInLayer; // 짝수 층: 왼 -> 오
         *         } else {
         *             column = w - 1 - indexInLayer; // 홀수 층: 오 -> 왼
         *         }
         * */

        // 꺼내야 하는 상자의 개수 계산
        int count = 0;

        for(int j=0; j< w; j++){
            if(warehouse[targetRow][j] == num){
                if(warehouse[h-1][j] == 0){
                    count = h -1 - (targetRow+1) +1;
                }else{
                    count = h - (targetRow+1) +1;
                }
                break;
            }
        }

        return count;

        /**        위 코드 아래처럼도 가능
         *         // 위에 있는 상자 개수 계산
         *         int count = 0;
         *         for (int i = layer; i < (n + w - 1) / w; i++) {
         *             if (i % 2 == 0) { // 짝수층: 왼 -> 오
         *                 if (column < (n - i * w)) count++;
         *             } else { // 홀수층: 오 -> 왼
         *                 if ((w - 1 - column) < (n - i * w)) count++;
         *             }
         *         }
         *
         *         return count;
         * */
    }
}
