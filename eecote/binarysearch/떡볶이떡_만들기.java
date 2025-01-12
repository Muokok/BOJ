package eecote.binarysearch;

import java.io.*;
import java.util.*;

public class 떡볶이떡_만들기 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);

        // 각 떡의 개별 높이 정보
        String [] input = br.readLine().split(" ");
        int[] arr = new int[n];
        int max = 0;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(input[i]);
            max = Math.max(max, arr[i]);
        }

        int start = 0;
        int end = max;

        int result =0;
        while(start <= end){
            long total = 0;
            int mid = (end+start) / 2;

            for(int i=0; i<n; i++){
                if(arr[i] - mid > 0){
                    total += arr[i] - mid;
                }
            }
            if(total >= m){
                result = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.print(result);
    }
}
