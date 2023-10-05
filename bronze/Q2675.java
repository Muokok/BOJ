package bronze;

import java.util.Scanner;

public class Q2675 {
    public Q2675() {
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0; i < n; ++i) {
            int j = scan.nextInt();
            String c = scan.next();

            for(int k = 0; k < c.length(); ++k) {
                for(int l = 0; l < j; ++l) {
                    System.out.print(c.charAt(k));
                }
            }

            System.out.println();
        }

    }
}
