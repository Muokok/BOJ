package programmers.lv2;
import java.util.*;

public class L2_다리를_지나는_트럭 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 다리를 표현하는 큐 선언 (큐의 크기는 다리 길이와 같음)
        Queue<Integer> bridge = new LinkedList<>();

        // 다리의 길이만큼 0으로 채워넣음 (비어있는 다리의 상태를 표현)
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        // 현재까지 걸린 시간
        int time = 0;

        // 현재 다리 위에 있는 트럭들의 총 무게
        int currentWeight = 0;

        // 다음에 다리에 올라갈 트럭의 인덱스
        int truckIndex = 0;

        // 모든 트럭이 다리를 건널 때까지 반복
        while (truckIndex < truck_weights.length) {
            // 다리의 맨 앞에서 나가는 트럭(또는 0)의 무게를 총 무게에서 빼줌
            currentWeight -= bridge.poll();

            // 다음 트럭이 다리에 올라갈 수 있는지 확인 (무게 제한)
            if (currentWeight + truck_weights[truckIndex] <= weight) {
                // 다음 트럭을 다리에 올림
                bridge.offer(truck_weights[truckIndex]);
                // 다리 위 총 무게 증가
                currentWeight += truck_weights[truckIndex];
                // 다음 트럭으로 인덱스 이동
                truckIndex++;
            } else {
                // 무게 제한으로 올라갈 수 없다면 0을 넣어서 다리의 길이 유지
                bridge.offer(0);
            }

            // 시간 증가
            time++;
        }

        // 마지막 트럭이 다리에 올라간 후, 다리 길이만큼 시간 추가
        // (마지막 트럭이 다리를 완전히 건너는 시간)
        return time + bridge_length;
    }
}
