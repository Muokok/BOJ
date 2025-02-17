package programmers.lv2;

public class L2_퍼즐_게임_챌린지 {
    public int solution(int[] diffs, int[] times, long limit) {
        // 이진 탐색의 시작점 (최소 숙련도)
        int left = 1;
        // 이진 탐색의 끝점 (퍼즐들 중 최대 난이도)
        int right = getMaxValue(diffs);
        // 정답을 저장할 변수 (초기값은 최대값)
        int answer = right;

        // 이진 탐색 시작
        while (left <= right) {
            // 중간값 계산 (현재 테스트할 숙련도)
            int mid = (left + right) / 2;

            // 현재 숙련도로 제한시간 내 해결 가능한지 확인
            if (canSolveWithinLimit(diffs, times, limit, mid)) {
                // 가능하다면 이 값을 정답 후보로 저장
                answer = mid;
                // 더 작은 숙련도로도 가능한지 확인하기 위해 범위를 줄임
                right = mid - 1;
            } else {
                // 불가능하다면 더 높은 숙련도가 필요하므로 범위를 높임
                left = mid + 1;
            }
        }

        return answer;
    }

    private boolean canSolveWithinLimit(int[] diffs, int[] times, long limit, int level) {
        // 전체 소요 시간을 저장할 변수
        long totalTime = 0;

        // 각 퍼즐을 순회하며 시간 계산
        for (int i = 0; i < diffs.length; i++) {
            // 숙련도가 난이도보다 크거나 같으면 한번에 해결
            if (diffs[i] <= level) {
                totalTime += times[i];
            } else {
                // 실패 횟수 계산 (난이도 - 숙련도)
                int fails = diffs[i] - level;
                // 첫 번째 퍼즐이 아닌 경우
                if (i > 0) {
                    // (이전 퍼즐 시간 + 현재 퍼즐 시간) * 실패횟수 + 현재 퍼즐 시간
                    totalTime += (long)(times[i-1] + times[i]) * fails + times[i];
                } else {
                    // 첫 번째 퍼즐인 경우는 이전 퍼즐이 없으므로 다르게 계산
                    totalTime += (long)times[i] * fails + times[i];
                }
            }
            
            /** for문 아래처럼도 가능
             * for(int i=0; i< diffs.length; i++){
             *             int n = 0;
             *
             *             if(level < diffs[i]){
             *                 n = diffs[i] - level;
             *             }
             *
             *             if(i >0){
             *                 totalScore += (long)(times[i] + times[i-1])*n + times[i];
             *
             *             }else{
             *                 totalScore += (long)times[i]*n + times[i];
             *             }
             *         }
             * 
             * 
             * */

            // 계산된 시간이 제한시간을 초과하면 false 반환
            if (totalTime > limit) {
                return false;
            }
        }

        // 모든 퍼즐을 제한시간 내에 해결 가능
        return true;
    }

    private int getMaxValue(int[] arr) {
        // 배열의 첫 번째 값을 최대값으로 초기화
        int max = arr[0];
        // 배열을 순회하며 최대값 갱신
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
