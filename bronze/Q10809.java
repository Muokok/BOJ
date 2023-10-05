package bronze;

import java.util.Scanner;
public class Q10809 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i < alphabet.length; ++i) {
            int index = S.indexOf(alphabet[i]);
            System.out.print("" + index + " ");
        }

    }
}
