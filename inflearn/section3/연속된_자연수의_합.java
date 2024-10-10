package inflearn.section3;

import java.util.Scanner;

public class 연속된_자연수의_합 {

    private static int solution(int N){
        int count = 0;
        int sum = 0;
        int start = 0;

        int num = (N / 2) + 1;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;

            while (sum > N && start <= i){
                sum = sum - start;
                start ++;
            }

            if (sum == N){
                count ++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(solution(N));

    }

}
