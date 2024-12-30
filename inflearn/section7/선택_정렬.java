package inflearn.section7;

import java.util.*;

public class 선택_정렬 {

    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int [] arr = new int [N];

        for(int i=0; i<N; i++){
            int input = in.nextInt();
            arr[i] = input;
        }

        for(int j = 0; j<N; j++){
            int idx = j;
            for(int k = j +1; k<N; k++){

                if(arr[k] < arr[idx]){
                    idx = k;
                }
            }
            int temp = arr[j];
            arr[j] = arr[idx];
            arr[idx] = temp;
        }

        for(int answer : arr){
            System.out.print(answer + " ");
        }
    }
}
