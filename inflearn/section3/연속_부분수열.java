package inflearn.section3;

import java.util.Scanner;

public class 연속_부분수열 {
    public static int solution(int M, int[] arr) {
        int count = 0;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > M && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == M) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int [] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(M, arr));
    }

}
