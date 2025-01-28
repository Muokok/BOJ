package silver;

import java.util.*;

public class Q2839 {

    /* 나의 코드 */
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] sugars = {5,3};
        int answer = 0;

        int N = sc.nextInt();


        // 3,13,23,33 -> 5로 나누고 3으로 나누기가 베스트 5*0 + '3*1', + 5*2 + '3*1', 5*4 + '3*1',
        // 8,18,28,38 -> 5로 나누고 3으로 나누기 가능
        // 6,16,26,36 -> 5로 나누고 3으로 나누기가 베스트
        // 9,19,29,39 -> 5로 나누고 3으로 나누기가 베스트
        // clear
        // 12,22,32,42 -> 5로 나누고 3으로 나누기 5*0 + '3*4', 5*2 + '3*4', 5*4 + '3*4' ...
        // 7,17,27,37 -> 5로 나누고 3으로 나누기 가능
        // clear
        // 5,15,25,35 -> 5로 나누기가 베스트
        // 10,20,30,40 -> 5로 나누기가 베스트
        // clear

        // 11,21,31 -> 5로 나누고 3으로 나누기 5*1 + '3*2', 5*2 + '3*2'...
        // 4,14,24,34 -> 5로 나누고 3으로 나누기 등등


        while(N > 1){
            if(N % 10 == 3 || N % 10 == 8){
                N = N - 3;
                answer += 1;
                answer = (N/5) + answer;
                N = N % 5;
            }else if(N % 10 == 6){
                N = N - 6;
                answer += 2;
                answer = (N/5) + answer;
                N = N % 5;
            }else if(N % 10 == 9){
                N = N - 9;
                answer += 3;
                answer = (N/5) + answer;
                N = N % 5;
            }else if(N % 10 == 2 || N % 10 == 7){
                if(N == 7) {
                    answer = -1;
                    break;
                }
                N = N - 12;
                answer += 4;
                answer = (N/5) + answer;
                N = N % 5;
            }else if(N % 5 == 0){
                answer = (N/5) + answer;
                N = N % 5;
            }else{
                if(N == 4) {
                    answer = -1;
                    break;
                }
                N = N - 5;
                answer ++;
            }
        }

        System.out.print(answer);
    }

/* 개선된 코드 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int answer = 0;
//
//        // 5킬로그램 봉지를 최대한 많이 사용
//        while (N >= 0) {
//            if (N % 5 == 0) {
//                answer += N / 5; // 5킬로그램 봉지의 개수 추가
//                System.out.println(answer);
//                return;
//            }
//            N -= 3; // 3킬로그램 봉지 하나 사용
//            answer++;
//        }
//
//        // 만약 정확하게 N킬로그램을 만들 수 없다면 -1 출력
//        System.out.println(-1);
//    }
}
