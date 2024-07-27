package inflearn.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 두_배열_합치기 {

    public static ArrayList<Integer> soulution(ArrayList<Integer> arr) {
        arr.sort(null);
        return arr;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        String inputN = br.readLine();
        String [] inputArrN = inputN.split(" ");
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(inputArrN[i]));
        }


        int M = Integer.parseInt(br.readLine());
        String inputM = br.readLine();
        String [] inputArrM = inputM.split(" ");
        for (int i = 0; i < M; i++) {
            arr.add(Integer.parseInt(inputArrM[i]));
        }

        for (Integer i : soulution(arr)) {
            System.out.print(i+ " ");
        }
    }

}
