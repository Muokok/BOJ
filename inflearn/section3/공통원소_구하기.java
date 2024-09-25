package inflearn.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 공통원소_구하기 {

    public static String solution(int[] arrA, int [] arrB) {
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        StringBuilder sb = new StringBuilder();
        int pA = 0, pB = 0;

        while (pA < arrA.length && pB < arrB.length) {
            if (arrA[pA] == arrB[pB]) {
                sb.append(arrA[pA]).append(" ");
                pA++;
                pB++;
            } else if (arrA[pA] < arrB[pB]) {
                pA++;
            } else {
                pB++;
            }
        }

        return sb.toString().trim();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] ArrA = new int[N];

        String inputA = br.readLine();
        String[] numberStringsA = inputA.split(" ");
        for (int i = 0; i < N; i++){
            ArrA[i] = Integer.parseInt(numberStringsA[i]);
        }

        int M = Integer.parseInt(br.readLine());
        int [] ArrB = new int[M];

        String inputB = br.readLine();
        String[] numberStringsB = inputB.split(" ");
        for (int j = 0; j < M; j++){
            ArrB[j] = Integer.parseInt(numberStringsB[j]);
        }

        System.out.println(solution(ArrA, ArrB));
    }

}
