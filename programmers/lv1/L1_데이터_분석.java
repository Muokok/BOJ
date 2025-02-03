package programmers.lv1;
import java.util.*;

public class L1_데이터_분석 {

    static int sortIdx = 0;

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();

        //["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]

        // 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는 문자열  ext
        // 뽑아낼 정보의 기준값을 나타내는 정수 val_ext
        // 정보를 정렬할 기준이 되는 문자열 sort_by

//        int extIdx = 0;
//
//        if(ext.equals("code")){
//            extIdx = 0;
//        } else if(ext.equals("date")){
//            extIdx = 1;
//        } else if(ext.equals("maximum")){
//            extIdx = 2;
//        } else if(ext.equals("remain")){
//            extIdx = 3;
//        }
//
//
//        if(sort_by.equals("code")){
//            sortIdx = 0;
//        } else if(sort_by.equals("date")){
//            sortIdx = 1;
//        } else if(sort_by.equals("maximum")){
//            sortIdx = 2;
//        } else if(sort_by.equals("remain")){
//            sortIdx = 3;
//        }

        /* 위 코드를 개선한 코드*/
        String[] s = {"code","date","maximum","remain"};
        int extIdx=0;

        for(int i=0; i<4; i++){
            if(ext.equals(s[i])) extIdx=i;
            if(sort_by.equals(s[i])) sortIdx=i;
        }

        for(int i=0; i<data.length; i++){
            int intExt = data[i][extIdx];
            if(intExt < val_ext){
                list.add(data[i]);
            }
        }

        /* 이 부분이 젤 까다로웠음 */
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[sortIdx] - o2[sortIdx];
            }
        });


        int[][] answer = new int [list.size()][4];

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<4; j++){
                answer[i][j] = list.get(i)[j];
            }
        }


        return answer;
    }
}
