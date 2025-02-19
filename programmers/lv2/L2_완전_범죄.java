package programmers.lv2;

public class L2_완전_범죄 {
    // A도둑의 최소 흔적 개수를 저장할 변수 (초기값은 가능한 최대값으로 설정)
    int minA = Integer.MAX_VALUE;
    // 각 물건별 도둑들의 흔적 정보를 저장할 배열
    int[][] info;
    // A와 B 도둑이 각각 경찰에 붙잡히는 최소 흔적 개수
    int n, m;

    public int solution(int[][] info, int n, int m) {
        // 입력받은 값들을 클래스 변수에 저장
        this.info = info;
        this.n = n;
        this.m = m;

        // DFS 시작 (첫 번째 물건부터 시작, A와 B의 초기 흔적은 0)
        dfs(0, 0, 0);

        // 가능한 경우가 없으면(minA가 갱신되지 않았으면) -1 반환, 있으면 최소값 반환
        return minA == Integer.MAX_VALUE ? -1 : minA;
    }

    private void dfs(int index, int sumA, int sumB) {
        // 모든 물건을 처리했을 때의 종료 조건
        if (index == info.length) {
            // A와 B 모두 경찰에 붙잡히지 않는 경우에만
            if (sumA < n && sumB < m) {
                // A의 흔적 최소값 갱신
                minA = Math.min(minA, sumA);
            }
            return;
        }

        // A나 B가 이미 경찰에 붙잡히는 상황이면 더 진행하지 않음
        if (sumA >= n || sumB >= m) {
            return;
        }

        // 현재 물건을 A가 훔치는 경우를 탐색
        // (다음 물건으로 이동, A의 흔적 증가, B의 흔적 유지)
        dfs(index + 1, sumA + info[index][0], sumB);

        // 현재 물건을 B가 훔치는 경우를 탐색
        // (다음 물건으로 이동, A의 흔적 유지, B의 흔적 증가)
        dfs(index + 1, sumA, sumB + info[index][1]);
    }

}
