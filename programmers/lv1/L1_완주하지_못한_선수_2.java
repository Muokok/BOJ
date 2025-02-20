package programmers.lv1;
import java.util.*;

public class L1_완주하지_못한_선수_2 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 참가자 이름과 등장 횟수를 맵에 저장
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 완주자 이름을 맵에서 제거
        for(String compName: completion){
            map.put(compName, map.get(compName) - 1);
            if (map.get(compName) == 0) {
                map.remove(compName);
            }
        }
        String answer = "";
        for(String temp: map.keySet()){
            answer = temp;
        }

        return answer;
    }
}
