package programmers.lv2;
import java.util.*;

public class L2_가장_큰_수_2 {


    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        int n = numbers.length;

        String [] strNumbers = new String[n];

        for(int i=0; i<n; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));
    /*
        아래 처럼 가능
        Arrays.sort(strNumbers, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        })
            // 예시: a="3", b="30" 비교
            "303".compareTo("330") // 양수 반환 -> 위치 변화 X, a가 b 앞에 위치
            // 예시: a="9", b="5" 비교
            "59".compareTo("95") // 양수 반환 -> 위치 변화 X, a가 b 앞에 위치
    */

        // 모든 값이 0인 경우 "0" 반환
        if(strNumbers[0].equals("0")) {
            return "0";
        }

        // 문자열 합치기
        StringBuilder answer = new StringBuilder();
        for(String str : strNumbers) {
            answer.append(str);
        }

        return answer.toString();
    }
}
