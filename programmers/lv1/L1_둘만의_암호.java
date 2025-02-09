package programmers.lv1;
import java.util.*;

public class L1_둘만의_암호 {
    public String solution(String s, String skip, int index) {
        Map<Character, Integer> alphaToIdx = new HashMap<>();
        Map<Integer, Character> idxToAlpha = new HashMap<>();

        int idx = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (skip.indexOf(c) == -1) { // 제외할 문자열에 없으면 추가
                alphaToIdx.put(c, idx);
                idxToAlpha.put(idx,c);
                idx ++;
            }
        }

        String answer = "";
        for(int i=0; i<s.length(); i++){
            char now = s.charAt(i);
            int nowIdx = alphaToIdx.get(now);
            char skipChr = idxToAlpha.get((nowIdx + index) % alphaToIdx.size());

            answer += String.valueOf(skipChr);
        }


        return answer;
    }
}
