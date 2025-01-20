package eecote.greedy;

import java.util.*;

public class 모험가_길드 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int result = 0;
        int count = 0;

        for(int j=0; j<N; j++){
            count += 1; // 현재 그룹에 모험가 포함

            if(count >= arr[j]) { // 현재 그룹원 수가 현재 공포도 이상이라면
                result += 1; // 그룹 결성
                count = 0; // 현재 그룹원 수 초기화
            }

        }
        System.out.print(result);
    }
}
