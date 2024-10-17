package inflearn.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class 매출액의_종류 {

    private static ArrayList solution( int [] sales, int N, int K) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> HM = new HashMap<>();
        for (int i = 0; i < K - 1; i++) {
            //getOrDefault는 key값(sales[i])에 해당하는 value를 get하는데, 없다면? defaultValue를 넣는 메소드다.
            HM.put(sales[i], HM.getOrDefault(sales[i], 0) + 1);
        }

        int lt=0;
        for (int rt = K-1; rt < N; rt++) {
            HM.put(sales[rt], HM.getOrDefault(sales[rt], 0) + 1);
            answer.add(HM.size());
            HM.put(sales[lt], HM.get(sales[lt])-1);

            if (HM.get(sales[lt]) == 0){
                HM.remove(sales[lt]);
            }
            lt ++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputNK = br.readLine();
        String [] arrNK = inputNK.split(" ");

        int N = Integer.parseInt(arrNK[0]);
        int K = Integer.parseInt(arrNK[1]);

        String input2 = br.readLine();
        String [] inputArr = input2.split(" ");
        int[] sales = new int[N]; // N일 동안의 매출 기록

        for (int i = 0; i < N; i++) {
            sales[i] = Integer.parseInt(inputArr[i]);
        }


        ArrayList<Integer> arr = solution(sales,N,K);

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
