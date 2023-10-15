package bronze;

import java.util.Scanner;

public class Q11382 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        long num = 0;
        long sum = 0;
        /*
        * int: 32비트 부호 있는 정수로, 범위는 대략 -2,147,483,648부터 2,147,483,647까지 입니다.
          long: 64비트 부호 있는 정수로, 범위는 대략 -9,223,372,036,854,775,808부터 9,223,372,036,854,775,807까지 입니다.
        * */

        for(int i=0; i <3; i++){
            num = scan.nextLong();
            sum = sum + num;
        }

        System.out.println(sum);
    }
}
