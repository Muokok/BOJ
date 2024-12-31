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

        for(int i =0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int answ : arr){
            System.out.print(answ + " ");
        }

    }
}
