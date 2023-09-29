import java.util.Scanner;

public class Q9086 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i=0; i < n; i++){
            String s = scan.next();
            System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
        }

    }
}
