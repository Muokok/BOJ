import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;
        String nums = scan.next();

        for(int i =0; i < n; i++){
            sum = sum + (int)nums.charAt(i) - 48;
        }
        System.out.print(sum);

    }
}
