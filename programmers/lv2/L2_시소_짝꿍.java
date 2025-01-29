package programmers.lv2;
import java.util.*;

public class L2_시소_짝꿍 {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights); // 배열 정렬
        Map<Double, Integer> map = new HashMap<>();

        // 가능한 비율: 1:1, 2:3, 1:2, 3:4
        for (int weight : weights) {
            double[] ratios = {
                    weight * 1.0,      // 1:1
                    weight * 2.0 / 3,  // 2:3
                    weight * 1.0 / 2,  // 1:2
                    weight * 3.0 / 4   // 3:4
            };

            // 각 비율에 대해 짝꿍 찾기
            for (double ratio : ratios) {
                if (map.containsKey(ratio)) {
                    answer += map.get(ratio);
                }
            }

            // 현재 무게 맵에 추가
            map.put(weight * 1.0, map.getOrDefault(weight * 1.0, 0) + 1);
        }

        return answer;
    }

}
