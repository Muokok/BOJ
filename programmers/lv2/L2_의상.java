package programmers.lv2;

import java.util.*;

public class L2_의상 {

    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for(String [] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        int answer = 1;

        // 각 의상 종류별로 (의상 개수 + 1)을 곱함
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        // 아무것도 입지 않는 경우를 제외
        return answer - 1;
    }
}
