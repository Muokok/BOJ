package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점수계산 {

    public static int solution(int [] numberList){
        int extraPoint = 0;
        int answer = 0;

        for (int i=0; i<numberList.length; i++){
            if (numberList[i] == 1){
                answer = answer + extraPoint + 1;
                extraPoint++;
            }
            else {
                extraPoint = 0;
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String input = br.readLine();

        // 띄어쓰기를 기준으로 나누기
        String[] numberStrings = input.split(" ");

        // 문자열을 정수로 변환 (필요한 경우)
        int[] numberList = new int[n];
        for (int i = 0; i < n; i++) {
            numberList[i] = Integer.parseInt(numberStrings[i]);
        }

        System.out.println(solution(numberList));
    }

}
