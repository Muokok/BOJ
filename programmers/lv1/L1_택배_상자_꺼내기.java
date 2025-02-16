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

        // 꺼내야 하는 상자의 개수 계산
        int count = 0;

        outerLoop:
        for(int i=targetRow; i>=0; i--){

            for(int j=0; j< w; j++){
                if(warehouse[i][j] == num){
                    if(warehouse[h-1][j] == 0){
                        count = h -1 - (i+1) +1;
                    }else{
                        count = h - (i+1) +1;
                    }
                    break outerLoop;
                }
            }

        }
        return count;
    }
}
