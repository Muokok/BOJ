package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5086 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            int a = scan.nextInt();
            int b = scan.nextInt();

            if(a ==0 && b ==0) break;

            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
