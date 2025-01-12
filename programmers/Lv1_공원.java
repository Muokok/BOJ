package programmers;
import java.util.*;

public class Lv1_공원 {
    public int solution(int[] mats, String[][] park) {

        Arrays.sort(mats);

        for(int i=0; i< park.length; i++){
            for(int j=0; j<park[0].length; j++){
                if(park[i][j].equals("-1")){
                    for(int k= mats.length-1; k>=0; k--){
                        boolean canPlace = true;
                        // 현재 위치에서 돗자리를 놓을 수 있는지 확인
                        for(int l=0; l<mats[k]; l++){
                            if(i + l >= park.length) {
                                canPlace = false;
                                break;
                            }

                            for(int m = 0; m < mats[k]; m++) {
                                if(j + m >= park[0].length || !park[i+l][j+m].equals("-1")) {
                                    canPlace = false;
                                    break;
                                }
                            }
                            if(!canPlace) break;
                        }
                        if(canPlace) return mats[k];
                    }
                }
            }
        }
        return -1;
    }
}
