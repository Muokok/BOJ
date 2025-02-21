package programmers.lv2;
import java.util.*;

public class L2_프로세스 {

    public int solution(int[] priorities, int location) {
        // 우선순위 큐 선언 (내림차순 정렬을 위해 Collections.reverseOrder() 사용)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 매개변수로 받은 priorities 배열의 모든 원소를 우선순위 큐에 추가
        for (int priority : priorities) {
            pq.add(priority);
        }

        // 실행 순서를 카운트할 변수 초기화
        int answer = 0;

        // 우선순위 큐가 비어있지 않은 동안 반복
        while (!pq.isEmpty()) {
            // priorities 배열을 처음부터 끝까지 순회
            for (int i = 0; i < priorities.length; i++) {
                // 현재 검사하는 프로세스의 우선순위가 가장 높은 우선순위(pq.peek())와 같다면
                if (priorities[i] == pq.peek()) {
                    // 실행 순서 증가
                    answer++;
                    // 우선순위 큐에서 해당 우선순위 제거
                    pq.poll();

                    // 현재 검사하는 위치(i)가 찾고자 하는 위치(location)와 같다면
                    if (i == location) {
                        // 현재까지의 실행 순서 반환
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
