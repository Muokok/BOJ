package bronze;

import java.util.Scanner;

public class Q1152 {
    public Q1152() {
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int num = 0;

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                ++num;
            }
        }

        if (s.charAt(0) == ' ') {
            if (s.charAt(s.length() - 1) == ' ') {
                System.out.println("처음, 마지막도 공백이다.");
                num -= 2;
            } else {
                System.out.println("첫 번째만 공백이다.");
                --num;
            }
        } else if (s.charAt(s.length() - 1) == ' ') {
            System.out.println("마지막만 공백이다.");
            --num;
        }

        System.out.println(num + 1);
    }
}
