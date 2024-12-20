package challenge;

import java.util.Arrays;
import java.util.Scanner;

public class B_B2_2750 {

    static int [] solution(int [] arr){
        Arrays.sort(arr);

        return(arr);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int result: solution(arr)){
            System.out.println(result);
        }
    }
}
