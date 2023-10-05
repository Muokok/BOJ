package bronze;

import java.util.Scanner;

public class Q2743 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int n = 0;

        for(int i = 0; i < S.length(); ++i) {
            ++n;
        }
        System.out.println(n);
    }
}
