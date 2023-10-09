package bronze;
import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        // Upper part of the pattern
        for (int i = 1; i <= num; i++) {
            // Print leading spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = num - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


