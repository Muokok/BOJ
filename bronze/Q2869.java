package bronze;

import java.util.Scanner;

public class Q2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        int currentM = 0;
        int day = 0;

        while (true){
            currentM = currentM + A;
            day ++;
            if(currentM >= V){
                break;
            }
            currentM = currentM -B;
        }

        System.out.println(day);
    }
}
