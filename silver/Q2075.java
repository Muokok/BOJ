package silver;

import java.io.*;
import java.util.*;

public class Q2075 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 최소 힙으로 우선순위 큐 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        int [][] nums = new int [n][n];


        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                int num = Integer.parseInt(st.nextToken());

                // 우선순위 큐에 숫자를 넣되, N개만 유지
                if (pq.size() < n) {
                    pq.offer(num);
                } else if (pq.peek() < num) {
                    pq.poll();
                    pq.offer(num);
                }
            }
        }

        // N번째 큰 수 출력 (우선순위 큐의 top)
        System.out.println(pq.peek());
    }
}

/**
 * 주어진 코드는 N x N 행렬에서 N번째로 큰 수를 찾는 알고리즘입니다. 아래 예시를 통해 단계별로 설명드리겠습니다.
 *
 * **입력 예시:**
 * ```
 * 5
 * 12 7 9 15 5
 * 13 8 11 19 6
 * 21 10 26 31 16
 * 48 14 28 35 25
 * 52 20 32 41 49
 * ```
 *
 * ### 1. **힙 초기화**
     * - 최소 힙(`PriorityQueue`)을 사용하며 크기를 5로 유지
     * - 초기 상태: `[]` (빈 큐)
 *
 * ### 2. **첫 번째 행 처리**
     * - 숫자 삽입: 12 → 7 → 9 → 15 → 5
     * - 힙 상태: `[5, 7, 9, 12, 15]`
     * - **현재 최소값**: 5
 *
 * ### 3. **두 번째 행 처리**
     * - 13 > 5 → 5 제거 후 13 추가
     *   힙: `[7, 9, 12, 13, 15]`
     * - 8 > 7 → 7 제거 후 8 추가
     *   힙: `[8, 9, 12, 13, 15]`
     * - 11 > 8 → 8 제거 후 11 추가
     *   힙: `[9, 11, 12, 13, 15]`
     * - 19 > 9 → 9 제거 후 19 추가
     *   힙: `[11, 12, 13, 15, 19]`
     * - 6 < 11 → 무시
 *
 *  중략...
 *
 * ### 7. **결과 출력**
     * - 힙의 최상단 값(35)이 5번째로 큰 수
     *   `System.out.println(pq.peek());` → 35
     *
     * 이 알고리즘은 O(N² log N) 시간 복잡도를 가지며, 최소 힙을 활용해 메모리 사용량을 O(N)으로 제한하는 것이 핵심입니다.
     *
 *
 */
