package eecote.sorting;

import java.io.*;
import java.util.*;

public class 두_배열의_원소_교체 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] nk = br.readLine().split(" ");

        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);

        int [] arr1 = new int[N];
        int [] arr2 = new int[N];

        String [] input1 = br.readLine().split(" ");
        String [] input2 = br.readLine().split(" ");

        for(int j=0; j<N; j++){
            arr1[j] =  Integer.parseInt(input1[j]);
            arr2[j] =  Integer.parseInt(input2[j]);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<K; i++){
            if(arr1[i] < arr2[arr2.length -1 -i]){
                arr1[i] = arr2[arr2.length -1 -i];
            }else{
                break;
            }
        }

        int answer = 0;
        for(int num : arr1){
            answer += num;
        }
        System.out.print(answer);
    }
}
