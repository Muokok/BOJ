package bronze;

import java.util.Scanner;

public class Q2903 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int initial = 2;
        int multiple = 0;
        //3번은 81개 4 > 9 > 25 > 81
        // 답 = 한 변의 점 개수의 제곱
        // 한 변의 점의 개수가 증가하는 루틴이 1,2,4,8,16 즉 2^n

        for(int i=0; i<N;i++){

            multiple = multiple + (int)Math.pow(2,i);
        }

        System.out.println((int)Math.pow(multiple+initial,2));

    }
}
