package inflearn.section3;

import java.util.Scanner;

public class 최대_길이_연속부분수열{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        /*
            1 1 0 0 1 1 0 1 1 0 1 1 0 1
            1. 길이 14인 배열 arr만들기
            2. k값받기
            3. arr에 값 넣기

            4. 연속 부분 수열의 조건
            1만나면 count++
            일단 k=2라면
            처음 0을 만났을때 1로 바꾼다고 생각하고 count--
            그러면 첫번째 0 만나고 두번째 0만나서
            1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 이건 -> return 6
            두번째 0만나고 세번째 0만나면
            1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1 이건 -> return 6
            세번째 0만나고 네번째 0만나면
            1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 이건 -> return 8
            네번째 0만나고 다섯번째 0만나면
            1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 이건 -> return 7

            max값 반환 -> return 8
        */
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0; // 0을 만난 횟수
        int left = 0; int right = 0; int answer = 0;

        int[] arr = new int[N];

        for(right = 0; right < N; right++){
            arr[right] = scanner.nextInt();
            if(arr[right] == 0) // k까지의 범위 지정
                count++; // 1 1 0 0 1 1 0일때 count=3

            while(count > k){ //3>2이므로
                if(arr[left] == 0)
                    count--; // 0을 1로 바꾼다고 생각... count=2가됨 1, 1, 1, 0, 1, 1, 0 됨
                left++; // 한칸씩 이동
                //
                // arr[2]일때 count는 2가 됨
                // arr[3]일때 count는 1이 됨... 1, 1, 1, 1, 1, 1, 0 됨
                // left++ 후 while문 통과 (left=4)
                // ---->여기까지만 돌린다면 answer는 6이 됨. 근데 max 찾아야 하니까 계속 for문돌기
            }
            answer = Math.max(answer, right - left + 1); //max값 반환
        }

        System.out.print(answer);
        scanner.close();
    }
}