package bronze;

import java.util.Scanner;

public class Q10988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
    }
}
