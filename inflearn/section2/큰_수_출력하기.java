package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 큰_수_출력하기 {

    public static ArrayList<Integer> solution(int num, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i=1; i<num; i++){
            if(arr[i] >arr[i-1]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] numbers = input.split(" ");

        int [] arr = new int[num];

        for(int i=0; i<num;i++){
            arr[i] = Integer.parseInt(numbers[i]);
        }

        for(int x: solution(num,arr)){

            System.out.print(x + " ");
        }
    }

}
