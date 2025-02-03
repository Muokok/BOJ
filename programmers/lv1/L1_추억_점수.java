package programmers.lv1;
import java.util.*;

public class L1_추억_점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        // 추억 점수를 더하고 저장해둘 list, 나중에 result로 변환
        List<Integer> sumList = new ArrayList<>(); // 아래처럼 answer 배열에 바로 담아도 됨. photo 배열의 개수가 곧 정답 개수이기 때문

        // 추억 점수를 더하고 저장해둘 result
        //int[] answer = new int[photo.length];

        // name과 추억점수를 map에다가 저장
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i< name.length; i++){
            map.put(name[i], yearning[i]);
        }

        // photo 배열을 for문으로 돌면서
        for(int i=0; i<photo.length; i++){
            int sum = 0;

            for(int j=0; j<photo[i].length; j++){
                String photoName = photo[i][j];

                // 해당 이름이 map에 존재한다면 value를 sum에 더하기
                if(map.containsKey(photoName)){
                    sum += map.get(photoName);
                }
            }
            sumList.add(sum);  // 이후 list 배열에 sum 값을 넣기
        }

        int[] answer = new int [sumList.size()];

        for(int i=0; i<sumList.size(); i++){
            answer[i] = sumList.get(i);
        }


        return answer;
    }
}
