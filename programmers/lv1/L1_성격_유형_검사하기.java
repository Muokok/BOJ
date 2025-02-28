package programmers.lv1;
import java.util.*;

public class L1_성격_유형_검사하기 {

    static Map<Character, Integer> map;
    public String solution(String[] survey, int[] choices) {

      map = new HashMap<>();

      //for문 돌면서 survey, choices의 같은 인덱스를 들림
      // 4 - choices[i] 가 양수면 앞쪽 유형이 (4-choices[i])만큼 점수 얻음
      // 음수면 뒤쪽 유형이 Math.abs(4-choices[i]) 만큼 점수 얻음
      // 마지막에 지표별 점수 비교해서 큰 값인 유형 정답 배열에 넣기
      // 만약 점수가 동점이면 사전순으로 빠른 유형을 넣기
      for(int i=0; i<survey.length; i++){
        if(4-choices[i] > 0){
          calculate(survey[i].charAt(0), 4-choices[i]);
        }else if(4-choices[i] < 0){
          calculate(survey[i].charAt(1), Math.abs(4-choices[i]));
        }
      }

      List<String> list = new ArrayList<>();

      list.add(compare('R', 'T'));
      list.add(compare('C', 'F'));
      list.add(compare('J', 'M'));
      list.add(compare('A', 'N'));

      String answer = "";
      for(int i=0; i<list.size(); i++){
        answer += list.get(i);
      }
      return answer;
    }

    private static void calculate(char c, int num){
      map.put(c, map.getOrDefault(c,0) + num);
    }

    private static String compare(char c1, char c2){
      int score1 = map.getOrDefault(c1, 0);  // c1이 map에 없으면 0 반환
      int score2 = map.getOrDefault(c2, 0);  // c2가 map에 없으면 0 반환

      if(score1 > score2){
        return String.valueOf(c1);
      }else if(score1 < score2){
        return String.valueOf(c2);
      }else{
        return c1 < c2 ? String.valueOf(c1) : String.valueOf(c2);
      }
    }

}
