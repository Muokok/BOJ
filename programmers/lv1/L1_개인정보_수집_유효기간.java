package programmers.lv1;
import java.util.*;

public class L1_개인정보_수집_유효기간 {

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();

        // terms 정보 담을 map 구현
        Map<String, Integer> termToMonth = new HashMap<>();
        for(int i=0; i<terms.length; i++){
            String term = terms[i].split(" ")[0];
            int month = Integer.parseInt(terms[i].split(" ")[1]);

            termToMonth.put(term, month);
        }

        // 현재 년,원,일 값 변환
        int nowY = Integer.parseInt(today.split("\\.")[0]);
        int nowM = Integer.parseInt(today.split("\\.")[1]);
        int nowD = Integer.parseInt(today.split("\\.")[2]);
        System.out.println(nowY +" "+ nowM + " " + nowD);

        // privacies for문 돌면서 term를 적용
        for(int i=0; i< privacies.length; i++){
            String YMD = privacies[i].split(" ")[0];
            String term = privacies[i].split(" ")[1];

            int month = termToMonth.get(term);

            int Y = Integer.parseInt(YMD.split("\\.")[0]); // "."으로 나눠질 줄 알았음.
            int M = Integer.parseInt(YMD.split("\\.")[1]);
            int D = Integer.parseInt(YMD.split("\\.")[2]);

            // 날짜에 term을 적용
            // 날짜에 term을 적용
            M += month;
            Y += (M-1) / 12;
            M = ((M-1) % 12) + 1;

            D--; // 유효기간 마지막 날짜를 구하기 위해
            if(D == 0) {
                M--;
                D = 28;
                if(M == 0) {
                    Y--;
                    M = 12;
                }
            }

            // term를 적용한 날짜가 today보다 작다면
            if(Y < nowY){
                list.add(i+1);
                continue;
            }else if(Y == nowY){
                if(M < nowM){
                    list.add(i+1);
                    continue;
                }else if(M == nowM){
                    if(D < nowD){
                        list.add(i+1);
                        continue;
                    }
                }
            }

        }
        int[] answer = new int [list.size()];

        for(int i=0; i< list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
