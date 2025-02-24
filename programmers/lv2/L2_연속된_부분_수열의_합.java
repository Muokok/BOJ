package programmers.lv2;

public class L2_연속된_부분_수열의_합 {
  public int[] solution(int[] sequence, int k) {
    // 정답을 저장할 배열 초기화 (시작 인덱스 0, 끝 인덱스는 배열 끝)
    int[] answer = new int[2];

    // 시작 포인터 초기화
    int start = 0;
    // 끝 포인터 초기화
    int end = 0;
    // 현재 부분 수열의 합을 첫 번째 원소로 초기화
    int sum = sequence[0];
    // 현재까지 찾은 부분 수열 중 최소 길이를 배열 전체 길이로 초기화
    int minLength = sequence.length;

    // end 포인터가 배열 끝에 도달할 때까지 반복
    while(end < sequence.length) {
      // 현재 부분 수열의 합이 목표값 k와 같은 경우
      if(sum == k) {
        // 현재 부분 수열의 길이 계산
        int currentLength = end - start;

        // 현재 찾은 수열이 이전에 찾은 수열보다 길이가 짧은 경우
        if(currentLength < minLength) {
          // 최소 길이 갱신
          minLength = currentLength;
          // 정답 배열 갱신 (시작, 끝 인덱스)
          answer[0] = start;
          answer[1] = end;
        }

        // 다음 경우를 찾기 위해 시작 포인터의 값을 합에서 빼고
        sum -= sequence[start];
        // 시작 포인터를 오른쪽으로 이동
        start++;

      }
      // 현재 부분 수열의 합이 k보다 큰 경우
      else if(sum > k) {
        // 시작 포인터의 값을 합에서 빼고
        sum -= sequence[start];
        // 시작 포인터를 오른쪽으로 이동하여 합을 줄임
        start++;
      }
      // 현재 부분 수열의 합이 k보다 작은 경우
      else {
        // 끝 포인터를 오른쪽으로 이동
        end++;
        // 끝 포인터가 배열 범위 내에 있다면
        if(end < sequence.length) {
          // 새로운 끝 포인터의 값을 합에 추가
          sum += sequence[end];
        }
      }
    }

    // 찾은 부분 수열의 시작과 끝 인덱스 반환
    return answer;
  }
}
