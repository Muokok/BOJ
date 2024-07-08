package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 뒤집은_소수 {
    public static Boolean isPrime(int number){
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solution(int [] numberList){
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<numberList.length; i++){
            if(isPrime(numberList[i])){
                answer.add(numberList[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();

        // 띄어쓰기를 기준으로 나누기
        String[] numberStrings = input.split(" ");

        // 문자열을 정수로 변환 (필요한 경우)
        int[] numberList = new int[N];
        for (int i = 0; i < N; i++) {
            numberList[i] = Integer.parseInt(new StringBuilder(numberStrings[i]).reverse().toString());
        }

        for (Integer result: solution(numberList)){
            System.out.print(result + " ");
        }

    }
}
