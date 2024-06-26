package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 피보나치_수열 {


    public static ArrayList<Integer> solution(int num){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);

        for (int i=1; i<num-1; i++){
            arr.add(arr.get(i) + arr.get(i-1));
        }

        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int result: solution(num)){
            System.out.print(result + " ");
        }

    }

}
