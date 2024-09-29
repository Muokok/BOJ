package inflearn.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대_매출 {

    public static int solution(int [] numArr, int num){
        int max;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += numArr[i];
        }

        max = sum;

        for (int i = num; i < numArr.length; i++) {
            sum = sum - numArr[i - num] + numArr[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String [] inputArr = input.split(" ");

        int [] numArr = new int[Integer.parseInt(inputArr[0])];

        String input2 = br.readLine();
        String [] inputArr2 = input2.split(" ");

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(inputArr2[i]);
        }

        System.out.println(solution(numArr, Integer.parseInt(inputArr[1])));

    }

}
