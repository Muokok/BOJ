package programmers.lv1;
import java.util.*;

public class L1_공원 {
    public int solution(int[] mats, String[][] park) {
        // 오름차순 정렬
        Arrays.sort(mats);

        for(int k = mats.length - 1; k >= 0; k--) {
            int size = mats[k];
            for(int i = 0; i <= park.length - size; i++) {
                for(int j = 0; j <= park[0].length - size; j++) {
                    boolean canPlace = true;
                    // 현재 위치에서 size x size 크기의 돗자리를 놓을 수 있는지 확인
                    for(int x = 0; x < size && canPlace; x++) {
                        for(int y = 0; y < size && canPlace; y++) {
                            if(!park[i+x][j+y].equals("-1")) {
                                canPlace = false;
                            }
                        }
                    }
                    if(canPlace) return size;
                }
            }
        }
        return -1;
    }
}
