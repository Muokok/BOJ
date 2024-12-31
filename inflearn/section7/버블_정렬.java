package inflearn.section7;

import java.io.*;

public class 버블_정렬 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        String [] input = br.readLine().split(" ");

        for(int k=0; k<N; k++){
            arr [k] = Integer.parseInt(input[k]);
        }

        for(int i =0; i<N - 1; i++){
            for(int j=0; j<N -i -1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int answ : arr){
            System.out.print(answ + " ");
        }

    }
}
