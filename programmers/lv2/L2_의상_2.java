package programmers.lv2;

import java.util.HashMap;
import java.util.Map;

public class L2_의상_2 {
    public int solution(String[][] clothes) {
        // 서로 다른 옷의 조합의 수

        Map<String, Integer> categoryCnt = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            categoryCnt.put(clothes[i][1], categoryCnt.getOrDefault(
                    clothes[i][1], 0) + 1);
        }

        int answer = 1;
        for (int cnt : categoryCnt.values()) {
            answer *= cnt + 1;
        }

        // -1 해줘야 함. 아무것도 안 입을 경우 제거
        return answer - 1;
    }
}
