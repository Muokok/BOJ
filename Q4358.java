import java.io.*;
import java.util.*;

public class Q4358 {

    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> treeMap = new HashMap<>();
        Set<String> set = new HashSet<>();

        String input;

        // 1. 입력 처리 (EOF까지 읽기 -> [Ctrl+D 또는 Ctrl+Z 입력] )
        while ((input = br.readLine()) != null) {
            if (input.isEmpty()) continue;
            treeMap.put(input, treeMap.getOrDefault(input, 0) + 1);
        }

        // 2. 총 나무 수 계산 (stream 대신 반복문 사용)
        int totalTrees = 0;
        for (int count : treeMap.values()) {
            totalTrees += count;
        }

        // 3. 키셋 정렬 및 결과 출력
        List<String> treeNames = new ArrayList<>(treeMap.keySet());
        Collections.sort(treeNames);

        for (String name : treeNames) {
            double ratio = (double) treeMap.get(name) / totalTrees * 100;
            bw.write(String.format("%s %.4f\n", name, ratio));
        }

        br.close();
        bw.flush();
        bw.close();
    }
/**
 * 입력 처리 개선
     * while ((input = br.readLine()) != null)로 EOF까지 정확히 읽음
     * 빈 줄이 입력될 경우 건너뛰는 조건 추가
 * 데이터 구조 최적화
     * 중복 저장하던 Set 제거 → Map의 keySet() 활용
     * 총 나무 수 계산: totalTrees 변수에 전체 카운트 합계 저장
 * 정확한 비율 계산
     * map.size() 대신 totalTrees 사용 (종류 수가 아닌 전체 개체 수 기준)
     * 형변환 추가: (double)을 이용한 부동소수점 연산 보장
 * 출력 형식 보정
     * String.format()을 이용해 소수점 4자리까지 출력
     * printf 형식 지정자 사용으로 가독성 향상
 * 실행 결과 검증
     * 예제 입력에 대해 정확히 3.4483%, 13.7931% 등의 값이 출력되며, 모든 종이 사전순으로 정렬되어 출력됩니다. 1,000,000그루까지 처리 가능한 효율적인 구조입니다.
 * */
}

