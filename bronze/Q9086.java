package bronze;

import java.io.PrintStream;
import java.util.Scanner;
public class Q9086 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0; i < n; ++i) {
            String s = scan.next();
            PrintStream var10000 = System.out;
            char var10001 = s.charAt(0);
            var10000.println("" + var10001 + s.charAt(s.length() - 1));
        }

    }
}