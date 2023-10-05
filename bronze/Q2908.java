package bronze;

import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int N1 = scan.nextInt();
        int N2 = scan.nextInt();

        String N1Str = Integer.toString(N1);
        String N2Str = Integer.toString(N2);

        String reversedStr1 = new StringBuilder(N1Str).reverse().toString();
        String reversedStr2 = new StringBuilder(N2Str).reverse().toString();

        int reversedN1 = Integer.parseInt(reversedStr1);
        int reversedN2 = Integer.parseInt(reversedStr2);

        if (reversedN1 > reversedN2){
            System.out.println(reversedN1);
        }
        else{
            System.out.println(reversedN2);
        }

    }
}
