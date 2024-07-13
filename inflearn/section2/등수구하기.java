package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 등수구하기 {

    public static ArrayList<Integer> solution(int [] numList){
        ArrayList<Integer> answer = new ArrayList<>();

        int rank = 1;

        for (int i=0; i<numList.length; i++){
            for (int j=0; j<numList.length; j++){
                if (numList[i] < numList[j]){ rank++; }
            }
            answer.add(rank);
            rank = 1;
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

        for (int i : solution(numberList)) {
            System.out.print(i + " ");
        }
    }
}
