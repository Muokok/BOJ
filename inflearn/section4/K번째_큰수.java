package inflearn.section4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class K번째_큰수 {

    private static int solution(int N, int K, int[] arr){
        Set<Integer> set = new TreeSet<>();

        // 모든 가능한 3장의 합을 계산
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    set.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        // K번째로 큰 값을 찾기
        int count = 0;
        for (int sum : set) {
            count++;
            if (count == K) {
                return sum;
            }
        }

        return -1; // K번째 값이 존재하지 않으면 -1 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int [] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(N, K, arr));
    }
}
