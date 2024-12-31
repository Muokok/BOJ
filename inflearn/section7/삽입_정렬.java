package inflearn.section7;

import java.io.*;

public class 삽입_정렬 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        String [] input = br.readLine().split(" ");

        for(int k=0; k<N; k++){
            arr[k] = Integer.parseInt(input[k]);
        }

        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for(int answer : arr){
            System.out.print(answer + " ");
        }
    }
}
