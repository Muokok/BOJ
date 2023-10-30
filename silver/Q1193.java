package silver;

import java.util.Scanner;

public class Q1193 {
    static public void main(String [] args){
        Scanner scan = new Scanner(System.in);
        /*
        홀:1/1 → X= 1
        짝:1/2 → 2/1 → x= 2,3
        홀:3/1 → 2/2 → 1/3 → X= 4,5,6
        짝:1/4 → 2/3 → 3/2 → 4/1 → X= 7,8,9,10
        5/1 → 4/2 → 3/3 → 2/4 → 1/5 → X= 11,12,13,14,15
        1/6 → 2/5 → 3/4 → 4/3 → 5/2 → 6/1 → X= 16,17,18,19,20,21
        7/1 → ...
         */

        int X = scan.nextInt();
        int diagonalnum = 1; // 대각선 당 최대 숫자 번호
        int diagonal =2 ; // 몇 번째 대각선인지
        String result;

        while (true){
            if(X<= diagonalnum){
                int diagonalPerIndex = diagonalnum - X + diagonal;// ex: X가 17이라면 6번째 대각선의 2번째 값까지 반복한다 >> 6 -(21-17)

                if((diagonal % 2) != 0) { // 홀수라면
                    result = (diagonal-diagonalPerIndex+1) + "/"+ diagonalPerIndex;
                }
                else {// 짝수라면
                    result = diagonalPerIndex+ "/"+ (diagonal-diagonalPerIndex+1);
                }
                break;
            }

            diagonalnum = diagonalnum +diagonal;
            diagonal++;
            System.out.println(diagonalnum);
            System.out.println(diagonal);

        }
        System.out.println(result);
    }
}
