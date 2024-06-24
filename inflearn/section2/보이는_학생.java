package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 보이는_학생 {

    public static int solution(int num, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 1;
        int max = arr[0];

        for(int i=1; i<num; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int [] arr = new int [num];

        String input = br.readLine();
        String[] numbers = input.split(" ");

        for(int i=0; i<num;i++){
            arr[i] = Integer.parseInt(numbers[i]);
        }

        System.out.println(solution(num,arr));
    }
}
