package programmers;

import java.util.*;

public class L1_정수_내림차순_배치하기 {
    public long solution(long n) {

        String str = n + "";
        int [] arr = new int[str.length()];

        for(int i=0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);

        String temp = "";
        for(int j=arr.length-1; j>=0; j--){
            temp += arr[j] -48;
        }

        long answer = Long.parseLong(temp);
        return answer;
    }
}
